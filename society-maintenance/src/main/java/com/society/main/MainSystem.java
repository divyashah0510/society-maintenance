package com.society.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.society.form.Form_Residents;
import com.society.form.Form_Maintenance;
import com.society.form.Form_Profile;
import com.society.menu.MenuEvent;
import com.society.models.ModelUser;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class MainSystem extends javax.swing.JFrame {
    
    private final ModelUser user;
    private Form_Residents formResidents;
    private Form_Maintenance formMaintainence;
    private Form_Profile profile;
    public URL logoUrl = getClass().getResource("/com/society/icons/logoS.png");
    
    public MainSystem(ModelUser user) {
        if (logoUrl != null) {
            this.setIconImage(new ImageIcon(logoUrl).getImage());
            this.setTitle("DashBoard");
        } else {
            System.err.println("Resource not found: /com/society/icons/logoS.png");
        }
        this.user = user;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

//        lbUser.setText(user.getUserName());
        menu.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                System.out.println(index + "<- Main Index  Sub Index ->" + subIndex);
//                switch (index) {
//                    case 0:
//                        home = new Form_Home();
//                        setForm(home);
//                        break;
//                    case 1:
//                        formResidents = new Form_Residents();
//                        setForm(formResidents);
//                        break;
//                    case 2:
//                        formMaintainence = new Form_Maintenance();
//                        setForm(formMaintainence);
//                        break;
//                    case 3:
//                        formEvents = new Form_Events();
//                        setForm(formEvents);
//                        break;
//                    case 4:
//                        formPayments = new Form_Payments();
//                        setForm(formPayments);
//                        break;
//                    case 8:
//                        formNotices = new Form_Notices();
//                        setForm(formNotices);
//                        break;
//                    case 9:
//                        amenities = new Form_Amenities();
//                        setForm(amenities);
//                        break;
//                    case 10:
//                        reports = new Form_Reports();
//                        setForm(reports);
//                        break;
//                    case 11:
//                        profile = new Form_Profile(user);
//                        setForm(profile);
//                        break;
//                    case 12:
//                        MessageDialog obj = new MessageDialog(MainSystem.this);
//                        obj.showMessage("LogOut", "Are you sure you want to Logout ??");
//                        if (obj.getMessageType() == MessageDialog.MessageType.OK) {
//                            System.out.println("User click ok");
//                            
//                        } else {
//                            System.out.println("User click cancel");
//                        }
//                        break;
//                    default:
//                        throw new AssertionError();
//                }
            }
        });
//        profile = new Form_Profile(user);
//        setForm(profile);
        formMaintainence = new Form_Maintenance();
        setForm(formMaintainence);
//        home = new Form_Home();
//        setForm(home);
        
    }
    
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.society.swing.PanelBorder();
        header1 = new com.society.components.Header();
        mainPanel = new com.society.swing.PanelRound();
        sp = new com.society.swing.ScrollPaneWin11();
        menu = new com.society.menu.Menu();
        namePanel = new com.society.swing.PanelRound();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setLayout(new java.awt.BorderLayout());

        sp.setBorder(null);
        sp.setViewportView(menu);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/society/icons/logo.png"))); // NOI18N
        jLabel1.setText("Disha Residency");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(ModelUser user) {
        IntelliJTheme.setup(Main.class.getResourceAsStream("/template.theme.json"));
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.society.components.Header header1;
    private javax.swing.JLabel jLabel1;
    private com.society.swing.PanelRound mainPanel;
    private com.society.menu.Menu menu;
    private com.society.swing.PanelRound namePanel;
    private com.society.swing.PanelBorder panelBorder1;
    private com.society.swing.ScrollPaneWin11 sp;
    // End of variables declaration//GEN-END:variables
}
