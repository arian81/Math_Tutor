/*
 * Developed by Arian Ahmadinejad
 * From Jul 12 to Jul 17 2020
 * Final Project : Math Tutor
 * Software made to help grade 9 students with learning prime functions
 */

/**
 *
 * @author arian
 */
public class Main_menu extends javax.swing.JFrame {

    /**
     * Creates new form Main_menu
     */
    
    // making too class of main_menu to being able to pass values from another
    // form to here
    public Main_menu() {
        initComponents();
    }
    
    public Main_menu(String name) {
        initComponents();
        this.lblWelcome.setText("Welcome : " + name);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        btnMenu = new javax.swing.JComboBox<>();
        lblTitle = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaCredits = new javax.swing.JTextArea();
        lblSub = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaCredits1 = new javax.swing.JTextArea();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tutor");
        setLocation(new java.awt.Point(500, 500));
        setLocationByPlatform(true);

        pnlBackground.setBackground(new java.awt.Color(92, 219, 149));

        btnMenu.setBackground(new java.awt.Color(237, 245, 225));
        btnMenu.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Introduction", "Divisibility", "Factor Pairs", "Prime and Composite Numbers", "Continued", "Prime Factorazation", "WRAP UP!" }));
        btnMenu.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                btnMenuPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Transformers Movie", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(5, 56, 107));
        lblTitle.setText("Math Tutor");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arithmatics.png"))); // NOI18N

        txaCredits.setEditable(false);
        txaCredits.setBackground(new java.awt.Color(92, 219, 149));
        txaCredits.setColumns(20);
        txaCredits.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txaCredits.setForeground(new java.awt.Color(237, 245, 225));
        txaCredits.setRows(5);
        txaCredits.setText("Content Resrouce :\ncourseware.cemc.uwaterloo.ca\n\nSoftware Consultant and Tester:\nZaki Ul Haq\n\nTeacher : \nMs. Ramona Clayton\n\nDeveloper and Designer :\nArian Ahmadinejad ");
        jScrollPane1.setViewportView(txaCredits);

        lblSub.setFont(new java.awt.Font("Space Age", 0, 16)); // NOI18N
        lblSub.setText("Prime Factorization");

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon2MouseClicked(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaCredits1.setEditable(false);
        txaCredits1.setBackground(new java.awt.Color(92, 219, 149));
        txaCredits1.setColumns(20);
        txaCredits1.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txaCredits1.setForeground(new java.awt.Color(240, 128, 128));
        txaCredits1.setLineWrap(true);
        txaCredits1.setRows(5);
        txaCredits1.setText("Notice : \nIn this programme \"^\" is the power sign.");
        txaCredits1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txaCredits1);

        lblWelcome.setFont(new java.awt.Font("Space Age", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSub)
                                .addGap(145, 145, 145)))
                        .addComponent(icon))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(icon))
                .addGap(44, 44, 44)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_btnMenuPopupMenuWillBecomeInvisible
        comboselect(); // applying the selecting options to the menue
    }//GEN-LAST:event_btnMenuPopupMenuWillBecomeInvisible

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        // showing the quiz page by pushing the picture
        new quiz().setVisible(true);
        new Main_menu().setVisible(false);
    }//GEN-LAST:event_icon2MouseClicked
    
    // making a method to be able to choose a page from drop down menu
    public void comboselect(){
        int intPageNum = btnMenu.getSelectedIndex();
        if (intPageNum == 1)
        {
            new Content_p1().setVisible(true);
            this.setVisible(false);
        }
        if (intPageNum == 2)
        {
            new Content_p2().setVisible(true);
            this.setVisible(false);
        }
        if (intPageNum == 3)
        {
            new Content_p3().setVisible(true);
            this.setVisible(false);
        }
        if (intPageNum == 4)
        {
            new Content_p4().setVisible(true);
            this.setVisible(false);
        }
        if (intPageNum == 5)
        {
            new Content_p5().setVisible(true);
            this.setVisible(false);
        }
                if (intPageNum == 6)
        {
            new Content_p7().setVisible(true);
            this.setVisible(false);
        }
        if (intPageNum == 7)
        {
            new Wrap_Up().setVisible(true);
            this.setVisible(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btnMenu;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextArea txaCredits;
    private javax.swing.JTextArea txaCredits1;
    // End of variables declaration//GEN-END:variables
}
