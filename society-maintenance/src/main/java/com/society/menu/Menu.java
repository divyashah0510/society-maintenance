package com.society.menu;

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
    // private String[][] menuItems = new String[][]{
    // {"Dashboard"},
    // {"Email", "Inbox", "Read", "Compost"},
    // {"Chat"},
    // {"Calendar"},
    // {"UI Kit", "Accordion", "Alerts", "Badges", "Breadcrumbs", "Buttons", "Button
    // group"},
    // {"Advanced UI", "Cropper", "Owl Carousel", "Sweet Alert"},
    // {"Forms", "Basic Elements", "Advanced Elements", "SEditors", "Wizard"},
    // {"Charts", "Apex", "Flot", "Peity", "Sparkline"},
    // {"Table", "Basic Tables", "Data Table"},
    // {"Icons", "Feather Icons", "Flag Icons", "Mdi Icons"},
    // {"Special Pages", "Blank page", "Faq", "Invoice", "Profile", "Pricing",
    // "Timeline"}
    // };
    private String[][] menuItems = new String[][] {
            { "Dashboard" },
            { "Notices", "Inbox", "Read", "Announcements" },
            { "Community Chat" },
            { "Events & Bookings" },
            { "Maintenance Requests", "Submit Request", "Track Request" },
            { "Payments & Dues", "View Dues", "Make Payment" },
            { "Documents & Downloads", "Society Rules", "Forms" },
            { "Security & Staff", "View Staff", "Report Issue" },
            { "Amenities", "Book Amenity", "View Schedule" },
            { "Complaints & Feedback", "Submit Complaint", "View Feedback" },
            { "Emergency Contacts", "Police", "Fire Department", "Hospital" },
            { "Visitor Management", "Add Visitor", "View Visitors" },
            { "Polls & Surveys", "Active Polls", "Submit Survey" },
            { "Parking Management", "View Parking", "Request Space" },
            { "Help Center", "FAQs", "Contact Support" },
            { "Reports & Analytics", "Maintenance Reports", "Financial Reports" },
            { "Service Providers", "Electricians", "Plumbers", "Carpenters" },
            { "Lost & Found", "Report Lost Item", "View Found Items" },
            { "Events Calendar", "Upcoming Events", "Past Events" },
            { "Important Notices", "Critical Updates", "General Notices" }
    };

    public Menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        // Init MenuItem
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
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);
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
