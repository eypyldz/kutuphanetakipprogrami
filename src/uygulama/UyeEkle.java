/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama;

import Siniflar.HataAyiklama;
import enumlar.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UyeEkle extends javax.swing.JFrame {

   
    public UyeEkle() {
        initComponents();
    }
    public static String uyeId="";
    public static String uyeAdi="";
    public static String uyeSoyadi="";
    public void kullaniciEkle() {
        
      
        
        DB db=new DB();
      
        String query = "Select * from uyeler";
        ArrayList uyeListesi = new ArrayList();

        try {
            uyeListesi.clear();
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                uyeListesi.add(rs.getString("kulAdi"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bağlantı Hatası" + e);
        }

        boolean kontrol = true;
        String hata = "";
        HataAyiklama hk = new HataAyiklama();

        uyeAdi = ad.getText().trim().toUpperCase();
        if (!hk.bosMu(uyeAdi)) {
            kontrol = false;
            hata += "Ad kısmı boş bırakılamaz \n";
        }
        
        uyeSoyadi = soyad.getText().trim().toUpperCase();
        if (!hk.bosMu(uyeSoyadi)) {
            kontrol = false;
            hata += "Soyad kısmı boş bırakılamaz \n";
        }
       
         String kUsername = kad.getText().trim();
         if (!hk.bosMu(kUsername)) {
            kontrol = false;
            hata += "Kullanıcı adı boş bırakılamaz \n";
        }
         
        if (uyeListesi.contains(kUsername)) {
            kontrol = false;
            hata += "Kullanıcı adı daha önce alınmış \n";
        } 
        
         String kSifre = pass.getText();
        String kSfireYeniden = pass2.getText();
       if (!kSifre.equals(kSfireYeniden)) {

            kontrol = false;
            hata += "Girdiğiniz şifreler uyuşmamaktadır";
        }
        String yetki_sec = (String) yetki.getSelectedItem();
      
        if (kontrol) {
            String queryy = "INSERT INTO uyeler values (null,'" + uyeAdi + "','" + uyeSoyadi + "',"
                    + "'" + kUsername + "','" + kSifre + "','" + yetki_sec + "')";
                   

            try {
                int ekle = db.baglan().executeUpdate(queryy);

                if (ekle > 0) {
                    JOptionPane.showMessageDialog(this, "Ekleme işlemi başarılı");
                    new UyeEkle().setVisible(true);
                    dispose();
                }

                //bilgiler doğruysa veritabanına kaydetme 
            } catch (SQLException ex) {
                Logger.getLogger(UyeEkle.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else {
            JOptionPane.showMessageDialog(this, hata);
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ad = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        kad = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        yetki = new javax.swing.JComboBox();
        goster = new javax.swing.JLabel();
        jButtonUyeOl = new javax.swing.JButton();
        jButtonGiris = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        soyad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyadActionPerformed(evt);
            }
        });

        kad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        pass.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        pass2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        yetki.setEditable(true);
        yetki.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        yetki.setForeground(new java.awt.Color(153, 153, 0));
        yetki.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kullanici" }));

        jButtonUyeOl.setText("Uye Ol");
        jButtonUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUyeOlActionPerformed(evt);
            }
        });

        jButtonGiris.setText("Giriş");
        jButtonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisActionPerformed(evt);
            }
        });

        jLabel1.setText("Adi :");

        jLabel2.setText("Soyadi :");

        jLabel3.setText("Kullanıcı Adı");

        jLabel4.setText("Şifre");

        jLabel5.setText("Şİfre Tekrar");

        jLabel6.setText("Yetki");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goster)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(soyad)
                        .addComponent(ad)
                        .addComponent(kad)
                        .addComponent(pass)
                        .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(yetki, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yetki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(goster)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadActionPerformed
      
    }//GEN-LAST:event_soyadActionPerformed

    private void jButtonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisActionPerformed
        this.setVisible(false);
        new AnaSayfa().setVisible(true);
    }//GEN-LAST:event_jButtonGirisActionPerformed

    private void jButtonUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUyeOlActionPerformed
       kullaniciEkle();
    }//GEN-LAST:event_jButtonUyeOlActionPerformed

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
            java.util.logging.Logger.getLogger(UyeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeEkle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JLabel goster;
    private javax.swing.JButton jButtonGiris;
    private javax.swing.JButton jButtonUyeOl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kad;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTextField soyad;
    private javax.swing.JComboBox yetki;
    // End of variables declaration//GEN-END:variables
}
