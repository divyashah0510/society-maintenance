package com.society.main;

import com.society.components.MessageDialog;
import com.society.event.EventMenuSelected;
import com.society.form.Form_Amenities;
import com.society.form.Form_Events;
import com.society.form.Form_Residents;
import com.society.form.Form_Maintenance;
import com.society.form.Form_Home;
import com.society.form.Form_Notices;
import com.society.form.Form_Payments;
import com.society.form.Form_Profile;
import com.society.form.Form_Reports;
import com.society.models.ModelUser;
import java.awt.Color;
import javax.swing.JComponent;

public class MainSystem extends javax.swing.JFrame {

    private final ModelUser user;
    private Form_Home home;
    private Form_Residents formResidents;
    private Form_Maintenance formMaintainence;
    private Form_Events formEvents;
    private Form_Payments formPayments;
    private Form_Notices formNotices;
    private Form_Amenities amenities;
    private Form_Reports reports;
    private Form_Profile profile;

    public MainSystem(ModelUser user) {
        this.user = user;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        lbUser.setText(user.getUserName());
        menu.initMoving(MainSystem.this);
        home = new Form_Home();
        setForm(home);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println("Currently on " + index);
                switch (index) {
                    case 0:
                        home = new Form_Home();
                        setForm(home);
                        break;
                    case 1:
                        formResidents = new Form_Residents();
                        setForm(formResidents);
                        break;
                    case 2:
                        formMaintainence = new Form_Maintenance();
                        setForm(formMaintainence);
                        break;
                    case 3:
                        formEvents = new Form_Events();
                        setForm(formEvents);
                        break;
                    case 4:
                        formPayments = new Form_Payments();
                        setForm(formPayments);
                        break;
                    case 8:
                        formNotices = new Form_Notices();
                        setForm(formNotices);
                        break;
                    case 9:
                        amenities = new Form_Amenities();
                        setForm(amenities);
                        break;
                    case 10:
                        reports = new Form_Reports();
                        setForm(reports);
                        break;
                    case 11:
                        profile = new Form_Profile();
                        setForm(profile);
                        break;
                    case 12:
                        MessageDialog obj = new MessageDialog(MainSystem.this);
                        obj.showMessage("LogOut", "Are you sure you want to Exit ??");
                        if (obj.getMessageType() == MessageDialog.MessageType.OK) {
                            System.out.println("User click ok");
                        } else {
                            System.out.println("User click cancel");
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        });

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

        lbUser = new javax.swing.JLabel();
        panelBorder1 = new com.society.swing.PanelBorder();
        header1 = new com.society.components.Header();
        menu = new com.society.components.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        lbUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        mainPanel.setBackground(new java.awt.Color(242, 242, 242));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 708, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(568, 568, 568)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(358, 358, 358)
                    .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(ModelUser user) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.society.components.Header header1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel mainPanel;
    private com.society.components.Menu menu;
    private com.society.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
