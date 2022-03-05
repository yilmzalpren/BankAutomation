/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaotomasyonu;

/**
 *
 * @author YILMAZ
 */
public class Fatura1 extends javax.swing.JFrame {
    public static User currentUser ; 
    /**
     * Creates new form 
     */
    public Fatura1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jArkaPanel = new javax.swing.JPanel();
        jCancelLabel = new javax.swing.JLabel();
        jGeriLabel = new javax.swing.JLabel();
        jDevamLabel = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jResimLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GERİ GİT");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });

        jDevamLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N
        jDevamLabel.setText("DEVAM ET");
        jDevamLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jDevamLabel.setVisible(false);
        jDevamLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDevamLabelMousePressed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-FATURA SEC-", "SU", "ELEKTRIK", "DOGALGAZ" }));
        jComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ISLEM YAPMAK İSTEDİGİNİZ FATURAYI SECINIZ");

        jResimLabel.setVisible(false);
        jResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/water.png"))); // NOI18N

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addComponent(jGeriLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDevamLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCancelLabel))))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jResimLabel)
                .addGap(164, 164, 164))
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelLabel)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jResimLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGeriLabel)
                    .addComponent(jDevamLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jGeriLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriMenu.mainMusteriMenu(currentUser);
        
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String keeper = jComboBox.getSelectedItem().toString();
        if(keeper.charAt(0)=='-'){
            jResimLabel.setVisible(false);
            jDevamLabel.setVisible(false);
        }
        else{
            if(keeper.charAt(0)=='S')
                jResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/water.png"))); // NOI18N
            else if(keeper.charAt(0)=='E')
                        jResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elektrik.png"))); // NOI18N
            else
                        jResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dogalgaz.png"))); // NOI18N
           jResimLabel.setVisible(true);
           jDevamLabel.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxPopupMenuWillBecomeInvisible

    private void jDevamLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDevamLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        if(((Musteri)currentUser).vadesizHesapVarMi())
            Fatura2.mainFatura2(currentUser);
        else{
            VadesizFrame.mainVadesizFrame(currentUser);
            javax.swing.JOptionPane.showMessageDialog(null,"FATURA YATIRMA ISLEMLERI VADESİZ HESAPTAN OLMAKTADIR\nLUTFEN ONCE HESAP OLUSTURUN!");
        }
        // 2.frame'e gec
    }//GEN-LAST:event_jDevamLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainFatura1(User currentUser) {
        Fatura1.currentUser = currentUser ; 
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
            java.util.logging.Logger.getLogger(Fatura1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fatura1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fatura1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fatura1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fatura1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jDevamLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jResimLabel;
    // End of variables declaration//GEN-END:variables
}
