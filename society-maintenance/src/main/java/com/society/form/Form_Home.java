package com.society.form;

import com.society.models.Model_Card;
import com.society.models.StatusType;
import com.society.swing.ScrollBar;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/society/icons/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/society/icons/profit.png")), "Total Profit", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/society/icons/flag.png")), "Unique Visitors", "$300000", "Increased by 70%"));
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        table.addRow(new Object[]{"Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECTED});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECTED});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECTED});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Sarah Johnson", "sarahjohnson@gmail.com", "Manager", "10 May,2019", StatusType.APPROVED});
        table.addRow(new Object[]{"David Beckham", "davidbeckham@gmail.com", "Editor", "15 Jun,2020", StatusType.REJECTED});
        table.addRow(new Object[]{"Cristiano Ronaldo", "cristianoronaldo@gmail.com", "Subscriber", "20 Jul,2021", StatusType.APPROVED});
        table.addRow(new Object[]{"Lionel Messi", "lionelmessi@gmail.com", "Admin", "25 Dec,2021", StatusType.PENDING});
        table.addRow(new Object[]{"Roger Federer", "rogerfederer@gmail.com", "Editor", "1 Jan,2022", StatusType.REJECTED});
        table.addRow(new Object[]{"Serena Williams", "serenawilliams@gmail.com", "Manager", "10 Feb,2022", StatusType.APPROVED});
        table.addRow(new Object[]{"Maria Sharapova", "mariasharapova@gmail.com", "Subscriber", "15 Mar,2022", StatusType.PENDING});
        table.addRow(new Object[]{"Usain Bolt", "usainbolt@gmail.com", "Admin", "5 Apr,2022", StatusType.REJECTED});
        table.addRow(new Object[]{"Michael Phelps", "michaelphelps@gmail.com", "Editor", "10 May,2022", StatusType.APPROVED});
        table.addRow(new Object[]{"Simone Biles", "simonebiles@gmail.com", "Manager", "20 Jun,2022", StatusType.PENDING});
        table.addRow(new Object[]{"LeBron James", "lebronjames@gmail.com", "Subscriber", "30 Jul,2022", StatusType.APPROVED});
        table.addRow(new Object[]{"Tom Brady", "tombrady@gmail.com", "Admin", "10 Aug,2022", StatusType.REJECTED});
        table.addRow(new Object[]{"Tiger Woods", "tigerwoods@gmail.com", "Editor", "15 Sep,2022", StatusType.PENDING});
        table.addRow(new Object[]{"Sachin Tendulkar", "sachintendulkar@gmail.com", "Manager", "20 Oct,2022", StatusType.APPROVED});
        table.addRow(new Object[]{"Virat Kohli", "viratkohli@gmail.com", "Subscriber", "25 Nov,2022", StatusType.REJECTED});
        table.addRow(new Object[]{"Rafael Nadal", "rafaelnadal@gmail.com", "Admin", "30 Dec,2022", StatusType.PENDING});
        table.addRow(new Object[]{"Novak Djokovic", "novakdjokovic@gmail.com", "Editor", "5 Jan,2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Andy Murray", "andymurray@gmail.com", "Manager", "10 Feb,2023", StatusType.REJECTED});
        table.addRow(new Object[]{"Venus Williams", "venuswilliams@gmail.com", "Subscriber", "15 Mar,2023", StatusType.PENDING});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.society.components.Card();
        card2 = new com.society.components.Card();
        card3 = new com.society.components.Card();
        panelBorder1 = new com.society.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.society.swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));
        setBorder(null);

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(247, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Standard Table Design");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "User Type", "Joined", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.society.components.Card card1;
    private com.society.components.Card card2;
    private com.society.components.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.society.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.society.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
