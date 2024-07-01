package com.society.form;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import raven.datetime.component.date.DatePicker;
import raven.datetime.component.date.DateSelectionAble;

public class Form_Maintenance extends javax.swing.JPanel {

    private DatePicker billDatePicker;
    private DatePicker dueDatePicker;

    public Form_Maintenance() {
        initComponents();
        btnClass();
    }

    private void btnClass() {
        billDatePicker = new DatePicker();
        billDatePicker.setEditor(billDate);
//        billDatePicker.setDateSelectionMode(DatePicker.DateSelectionMode.BETWEEN_DATE_SELECTED);
//        billDatePicker.setSeparator(" to date ");
//        billDatePicker.setUsePanelOption(true);
        billDatePicker.setDateSelectionAble(new DateSelectionAble() {
            @Override
            public boolean isDateSelectedAble(LocalDate ld) {
                return !ld.isAfter(LocalDate.now());
            }
        });
        dueDatePicker = new DatePicker();
        dueDatePicker.setEditor(dueDate);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        notice = new com.society.swing.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        billPanel = new raven.crazypanel.CrazyPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBillNo = new com.society.swing.TextField();
        txtName = new com.society.swing.TextField();
        txtFlat = new com.society.swing.TextField();
        billDate = new javax.swing.JFormattedTextField();
        dueDate = new javax.swing.JFormattedTextField();
        printBill = new com.society.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new com.society.swing.Table();
        addBill = new com.society.swing.Button();

        jLabel1.setFont(new java.awt.Font("FiraCode Nerd Font", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maintenance Form");

        jLabel2.setFont(new java.awt.Font("FiraCode Nerd Font", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Important Note:");

        jLabel3.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 12)); // NOI18N
        jLabel3.setText("1. IF PAYMENT IS NOT MADE ON OR BEFORE DUE DATE INTEREST @ 20% WILL BE CHARGED");

        jLabel4.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 12)); // NOI18N
        jLabel4.setText("2. PLEASE ISSUE CROSSED ACCOUNT PAYEE CHEQUE IN THE NAME OF THE SOCIETY ONLY");

        jLabel5.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 12)); // NOI18N
        jLabel5.setText("3. NO OFFICE BEARER OR EMPLOYEE OF THE SOCIETY IS AUTHORIZED TO ACCEPT PAYEMENT IN CASH");

        javax.swing.GroupLayout noticeLayout = new javax.swing.GroupLayout(notice);
        notice.setLayout(noticeLayout);
        noticeLayout.setHorizontalGroup(
            noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(noticeLayout.createSequentialGroup()
                        .addGroup(noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        noticeLayout.setVerticalGroup(
            noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        billPanel.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        billPanel.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Bill No.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.4;
        gridBagConstraints.weighty = 4.0;
        billPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Bill Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.4;
        gridBagConstraints.weighty = 4.0;
        billPanel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.4;
        gridBagConstraints.weighty = 4.0;
        billPanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Flat No.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.4;
        gridBagConstraints.weighty = 4.0;
        billPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Due Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 4.4;
        gridBagConstraints.weighty = 4.0;
        billPanel.add(jLabel10, gridBagConstraints);

        txtBillNo.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        txtBillNo.setPlaceholder("Enter Bill Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        billPanel.add(txtBillNo, gridBagConstraints);

        txtName.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        txtName.setPlaceholder("Enter Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        billPanel.add(txtName, gridBagConstraints);

        txtFlat.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        txtFlat.setPlaceholder("Enter Flat Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        billPanel.add(txtFlat, gridBagConstraints);

        billDate.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        billPanel.add(billDate, gridBagConstraints);

        dueDate.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        billPanel.add(dueDate, gridBagConstraints);

        printBill.setBackground(new java.awt.Color(0, 153, 51));
        printBill.setForeground(new java.awt.Color(255, 255, 255));
        printBill.setText("Generate Bill");
        printBill.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        printBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Bill Date", "Name", "Flat No.:"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        addBill.setBackground(new java.awt.Color(121, 157, 242));
        addBill.setForeground(new java.awt.Color(255, 255, 255));
        addBill.setText("Add");
        addBill.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(billPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(printBill, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(addBill, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(notice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(printBill, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(addBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillActionPerformed
        MessageFormat header = new MessageFormat("Disha Residency CO OP Housing Society.");
        MessageFormat footer = new MessageFormat("Page {0}"); //to add image here
        try {
            System.out.println("Performing print action");
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (PrinterException e) {
            System.err.println("Error is " + e);
        }
    }

    private JFrame getParentFrame() {
        java.awt.Component parent = this;
        while (parent.getParent() != null) {
            parent = parent.getParent();
            if (parent instanceof JFrame) {
                return (JFrame) parent;
            }
        }
        return null;
    }//GEN-LAST:event_printBillActionPerformed

    private void addBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBillActionPerformed
        String bill_Number = txtBillNo.getText();
        String bill_Name = txtName.getText();
        String flat_Number = txtFlat.getText();
        String bill_Date = billDate.getText(); //billDatePicker.getDateFormat();
        String due_Date = dueDate.getText();//dueDatePicker.getDateFormat();

        // Adding data into table 
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.addRow(new Object[]{bill_Number, bill_Date, bill_Name, flat_Number, due_Date});

        // Clear the fields
        txtBillNo.setText("");
        txtName.setText("");
        txtFlat.setText("");
        billDate.setText(null);
        dueDate.setText(null);
    }//GEN-LAST:event_addBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.society.swing.Button addBill;
    private javax.swing.JFormattedTextField billDate;
    private raven.crazypanel.CrazyPanel billPanel;
    private javax.swing.JFormattedTextField dueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.society.swing.PanelRound notice;
    private com.society.swing.Button printBill;
    private com.society.swing.Table table;
    private com.society.swing.TextField txtBillNo;
    private com.society.swing.TextField txtFlat;
    private com.society.swing.TextField txtName;
    // End of variables declaration//GEN-END:variables
}
