package com.society.menu;

import com.society.models.ModelUser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Menu extends JComponent {

    public MenuEvent getEvent() {
        return event;
    }

    public void setEvent(MenuEvent event) {
        this.event = event;
    }

    private MenuEvent event;
    private MigLayout layout;
    // For Admin
    private final String[][] menuItemsAdmin = new String[][]{
        {"Dashboard"},
        {"Maintenance Notices", "View Notices", "Add Notice"},
        {"Payments & Dues", "View Payments", "Track Dues"},
        {"Complaints", "View Complaints", "Resolve Complaints"},
        {"Visitor Management", "Add Visitor", "View Visitor Log"},
        {"Resident Directory", "View Residents", "Manage Residents"},
        {"Reports & Analytics", "Maintenance Reports", "Financial Reports"},
        {"Help Center", "FAQs", "Contact Support"}
    };

    // For Client
    private final String[][] menuItemsClient = new String[][]{
        {"Dashboard"},
        {"Notices", "View Notices"},
        {"Payments", "View Dues", "Make Payment"},
        {"Complaints", "Submit Complaint", "Track Complaint"},
        {"Visitor Management", "Pre-Approve Visitor", "View Visitor Log"},
        {"Resident Directory", "View Residents"},
        {"Help Center", "FAQs", "Contact Support"}
    };

    // This will hold the menu items based on the user role
    private String[][] menuItems;

    public Menu(ModelUser user) {
        System.out.println(user.getRole());
        if (user.getRole() != null) {
            if (user.getRole().equals("admin")) {
                System.out.println("Admin logged in");
                menuItems = menuItemsAdmin;
            } else {
                System.out.println("Client logged in");
                menuItems = menuItemsClient;
            }
        } else {
            System.out.println("Unexpected error");
        }

        init();
    }
//    public Menu() {
//        init();
//    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        // Init MenuItem based on role
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }

    }

    private Icon getIcon(int index) {
        URL url = getClass().getResource("/com/society/icons/" + index + ".png");
        if (url != null) {
            return new ImageIcon(url);
        } else {
            return null;
        }
    }

    private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        // Hide menu
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                } else {
                    if (event != null) {
                        event.selected(index, 0);
                    }
                }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(Color.decode("#1c8c54"));
        for (int i = 1; i < length; i++) {
            MenuItem subItem = new MenuItem(menuItemsAdmin[index][i], i, false);
            subItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (event != null) {
                        event.selected(index, subItem.getIndex());
                    }
                }
            });
            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation.showMenu(panel, item, layout, true);
    }

    private void hideMenu(MenuItem item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setColor(Color.decode("#1c9454"));
        int arc = 20;
        int width = getWidth();
        int height = getHeight();

        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(width, 0);
        path.lineTo(width, height);
        path.lineTo(arc, height);
        path.quadTo(0, height, 0, height - arc);
        path.closePath();

        g2.fill(path);
        super.paintComponent(grphcs);
    }

}
