/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum190625;

/**
 *
 * @author Lenovo
 */
public class MenuMinuman extends javax.swing.JFrame {

    private MenuUtama utama;
    
    public MenuMinuman() {
        initComponents();
    }
    
    public MenuMinuman(MenuUtama utama){
        this.utama = utama;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbapel = new javax.swing.JCheckBox();
        cbmangga = new javax.swing.JCheckBox();
        cbjeruk = new javax.swing.JCheckBox();
        cbnaga = new javax.swing.JCheckBox();
        txtapel = new javax.swing.JTextField();
        txtmangga = new javax.swing.JTextField();
        txtjeruk = new javax.swing.JTextField();
        txtnaga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbjusapel = new javax.swing.JComboBox<>();
        cbjusmangga = new javax.swing.JComboBox<>();
        cbjusjeruk = new javax.swing.JComboBox<>();
        cbjusnaga = new javax.swing.JComboBox<>();
        txtjusapel = new javax.swing.JTextField();
        txtjusmangga = new javax.swing.JTextField();
        txtjusjeruk = new javax.swing.JTextField();
        txtjusnaga = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        btnharga = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("DAFTAR MENU MINUMAN");

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        cbapel.setText("Jus apel");
        cbapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbapelActionPerformed(evt);
            }
        });

        cbmangga.setText("Jus mangga");
        cbmangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmanggaActionPerformed(evt);
            }
        });

        cbjeruk.setText("Jus jeruk");
        cbjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjerukActionPerformed(evt);
            }
        });

        cbnaga.setText("Jus naga");
        cbnaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnagaActionPerformed(evt);
            }
        });

        txtapel.setText("0");

        txtmangga.setText("0");

        txtjeruk.setText("0");

        txtnaga.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbmangga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbjeruk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbnaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnaga, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtjeruk)
                    .addComponent(txtmangga)
                    .addComponent(txtapel)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbapel)
                    .addComponent(txtapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmangga)
                    .addComponent(txtmangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjeruk)
                    .addComponent(txtjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnaga)
                    .addComponent(txtnaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        cbjusapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbjusapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjusapelActionPerformed(evt);
            }
        });

        cbjusmangga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbjusmangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjusmanggaActionPerformed(evt);
            }
        });

        cbjusjeruk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbjusjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjusjerukActionPerformed(evt);
            }
        });

        cbjusnaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbjusnaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjusnagaActionPerformed(evt);
            }
        });

        txtjusapel.setText("0");

        txtjusmangga.setText("0");

        txtjusjeruk.setText("0");

        txtjusnaga.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbjusapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbjusmangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbjusjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbjusnaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtjusapel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtjusmangga)
                    .addComponent(txtjusjeruk)
                    .addComponent(txtjusnaga))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjusapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjusapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjusmangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjusmangga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjusjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjusjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjusnaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjusnaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnharga.setText("Total harga");
        btnharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhargaActionPerformed(evt);
            }
        });

        txtharga.setText("0");

        btnkembali.setText("Kembali Kemenu Utama");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnharga)
                        .addGap(37, 37, 37)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnreset)
                            .addComponent(btnkembali))
                        .addGap(86, 86, 86)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnharga)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkembali))
                .addGap(33, 33, 33)
                .addComponent(btnreset)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbapelActionPerformed
   txtapel.setText("15000");
    }//GEN-LAST:event_cbapelActionPerformed

    private void cbjusapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjusapelActionPerformed
    int jml = (int) cbjusapel.getSelectedIndex();
    double harga = Double.parseDouble(txtapel.getText());
    double total = jml*harga;
    txtjusapel.setText(Double.toString(total));
    }//GEN-LAST:event_cbjusapelActionPerformed

    private void cbmanggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmanggaActionPerformed
    txtmangga.setText("12000");
    }//GEN-LAST:event_cbmanggaActionPerformed

    private void cbjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjerukActionPerformed
    txtjeruk.setText("25000");
    }//GEN-LAST:event_cbjerukActionPerformed

    private void cbnagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnagaActionPerformed
    txtnaga.setText("22000");
    }//GEN-LAST:event_cbnagaActionPerformed

    private void cbjusmanggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjusmanggaActionPerformed
    int jml = (int) cbjusmangga.getSelectedIndex();
    double harga = Double.parseDouble(txtmangga.getText());
    double total = jml*harga;
    txtjusmangga.setText(Double.toString(total));
    }//GEN-LAST:event_cbjusmanggaActionPerformed

    private void cbjusjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjusjerukActionPerformed
    int jml = (int) cbjusjeruk.getSelectedIndex();
    double harga = Double.parseDouble(txtjeruk.getText());
    double total = jml*harga;
    txtjusjeruk.setText(Double.toString(total));   // TODO add your handling code here:
    }//GEN-LAST:event_cbjusjerukActionPerformed

    private void cbjusnagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjusnagaActionPerformed
    int jml = (int) cbjusnaga.getSelectedIndex();
    double harga = Double.parseDouble(txtnaga.getText());
    double total = jml*harga;
    txtjusnaga.setText(Double.toString(total));
    }//GEN-LAST:event_cbjusnagaActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    txtjusapel.setText("0");
    txtjusmangga.setText("0");
    txtjusjeruk.setText("0");
    txtjusnaga.setText("0");
    txtharga.setText("0.0");
    cbjusapel.setSelectedIndex(0);
    cbjusmangga.setSelectedIndex(0);
    cbjusjeruk.setSelectedIndex(0);
    cbjusnaga.setSelectedIndex(0);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhargaActionPerformed
    double apel = Double.parseDouble(txtapel.getText());
    double mangga = Double.parseDouble(txtmangga.getText());
    double jeruk = Double.parseDouble(txtjeruk.getText());
    double naga= Double.parseDouble(txtnaga.getText());
    double total = apel + mangga + jeruk+ naga;
    txtharga.setText(String.valueOf(total));
    
    }//GEN-LAST:event_btnhargaActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
     String total = txtharga.getText();
     utama.setTotalMinuman(total);
     this.dispose();
     
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMinuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnharga;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox cbapel;
    private javax.swing.JCheckBox cbjeruk;
    private javax.swing.JComboBox<String> cbjusapel;
    private javax.swing.JComboBox<String> cbjusjeruk;
    private javax.swing.JComboBox<String> cbjusmangga;
    private javax.swing.JComboBox<String> cbjusnaga;
    private javax.swing.JCheckBox cbmangga;
    private javax.swing.JCheckBox cbnaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtapel;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjeruk;
    private javax.swing.JTextField txtjusapel;
    private javax.swing.JTextField txtjusjeruk;
    private javax.swing.JTextField txtjusmangga;
    private javax.swing.JTextField txtjusnaga;
    private javax.swing.JTextField txtmangga;
    private javax.swing.JTextField txtnaga;
    // End of variables declaration//GEN-END:variables
}
