/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class MAINMENU extends javax.swing.JFrame {


    public MAINMENU() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardsPanel = new javax.swing.JPanel();
        event1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        details1 = new javax.swing.JLabel();
        reg1 = new javax.swing.JButton();
        event2 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        details2 = new javax.swing.JLabel();
        reg2 = new javax.swing.JButton();
        event3 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        details3 = new javax.swing.JLabel();
        reg3 = new javax.swing.JButton();
        event4 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        details4 = new javax.swing.JLabel();
        reg4 = new javax.swing.JButton();
        event5 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        details5 = new javax.swing.JLabel();
        reg5 = new javax.swing.JButton();
        event6 = new javax.swing.JPanel();
        title6 = new javax.swing.JLabel();
        details6 = new javax.swing.JLabel();
        reg6 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(245, 245, 245));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setText("Search events...");
        searchField.setActionCommand(null);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        cardsPanel.setLayout(new javax.swing.BoxLayout(cardsPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(cardsPanel);
        cardsPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardsPanel.setPreferredSize(new java.awt.Dimension(330, 140));

        event1.setBackground(new java.awt.Color(255, 255, 255));
        event1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event1.setPreferredSize(new java.awt.Dimension(330, 140));
        event1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title1.setText("Mr & Ms NBSC");
        event1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details1.setText("Event description...");
        event1.add(details1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg1.setText("Register");
        event1.add(reg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 25));

        event2.setBackground(new java.awt.Color(255, 255, 255));
        event2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event2.setPreferredSize(new java.awt.Dimension(330, 140));
        event2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title2.setText("Men's Volleyball Competition");
        event2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details2.setText("Event description...");
        event2.add(details2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg2.setText("Register");
        event2.add(reg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, 25));

        event3.setBackground(new java.awt.Color(255, 255, 255));
        event3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event3.setPreferredSize(new java.awt.Dimension(330, 140));
        event3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title3.setText("Women's Volleyball Competition");
        event3.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details3.setText("Event description...");
        event3.add(details3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg3.setText("Register");
        event3.add(reg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, 25));

        event4.setBackground(new java.awt.Color(255, 255, 255));
        event4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event4.setPreferredSize(new java.awt.Dimension(330, 140));
        event4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title4.setText("Men's Basketball Competition");
        event4.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details4.setText("Event description...");
        event4.add(details4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg4.setText("Register");
        event4.add(reg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, 25));

        event5.setBackground(new java.awt.Color(255, 255, 255));
        event5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event5.setPreferredSize(new java.awt.Dimension(330, 140));
        event5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title5.setText("Women's Basketball Competition");
        event5.add(title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details5.setText("Event description...");
        event5.add(details5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg5.setText("Register");
        event5.add(reg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, 25));

        event6.setBackground(new java.awt.Color(255, 255, 255));
        event6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        event6.setPreferredSize(new java.awt.Dimension(330, 140));
        event6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title6.setText("Mr & Ms NBSC");
        event6.add(title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 25));

        details6.setText("Event description...");
        event6.add(details6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        reg6.setText("Register");
        event6.add(reg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, 25));

        javax.swing.GroupLayout cardsPanelLayout = new javax.swing.GroupLayout(cardsPanel);
        cardsPanel.setLayout(cardsPanelLayout);
        cardsPanelLayout.setHorizontalGroup(
            cardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(event1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(event2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardsPanelLayout.setVerticalGroup(
            cardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(event1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(event6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(cardsPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel2);

        mainPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINMENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardsPanel;
    private javax.swing.JLabel details1;
    private javax.swing.JLabel details2;
    private javax.swing.JLabel details3;
    private javax.swing.JLabel details4;
    private javax.swing.JLabel details5;
    private javax.swing.JLabel details6;
    private javax.swing.JPanel event1;
    private javax.swing.JPanel event2;
    private javax.swing.JPanel event3;
    private javax.swing.JPanel event4;
    private javax.swing.JPanel event5;
    private javax.swing.JPanel event6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton reg1;
    private javax.swing.JButton reg2;
    private javax.swing.JButton reg3;
    private javax.swing.JButton reg4;
    private javax.swing.JButton reg5;
    private javax.swing.JButton reg6;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    // End of variables declaration//GEN-END:variables
}
