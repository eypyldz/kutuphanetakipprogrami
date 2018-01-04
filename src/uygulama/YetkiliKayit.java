/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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

/**
 *
 * @author Eyup
 */
public class YetkiliKayit extends javax.swing.JFrame {

    public YetkiliKayit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kad = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        yetki = new javax.swing.JComboBox();
        jButtonUyeOl = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        soyad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adi :");

        ad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel2.setText("Soyadi :");

        jLabel3.setText("Kullanıcı Adı");

        kad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        pass.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel5.setText("Şİfre Tekrar");

        pass2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        yetki.setEditable(true);
        yetki.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        yetki.setForeground(new java.awt.Color(153, 153, 0));
        yetki.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yetkili" }));

        jButtonUyeOl.setText("Kaydet");
        jButtonUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUyeOlActionPerformed(evt);
            }
        });

        jLabel6.setText("Yetki");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGap(103, 103, 103)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad)
                            .addComponent(kad)
                            .addComponent(pass)
                            .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addComponent(yetki, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jButtonUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yetki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

        String kAdi = ad.getText().trim().toUpperCase();
        if (!hk.bosMu(kAdi)) {
            kontrol = false;
            hata += "Ad kısmı boş bırakılamaz \n";
        }
        
        String kSoyadi = soyad.getText().trim().toUpperCase();
        if (!hk.bosMu(kSoyadi)) {
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
            String queryy = "INSERT INTO uyeler values (null,'" + kAdi + "','" + kSoyadi + "',"
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
                Logger.getLogger(YetkiliKayit.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else {
            JOptionPane.showMessageDialog(this, hata);
        }
       
    }
    private void jButtonUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUyeOlActionPerformed
        
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
            java.util.logging.Logger.getLogger(YetkiliKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YetkiliKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YetkiliKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YetkiliKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YetkiliKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JButton jButtonUyeOl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kad;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTextField soyad;
    private javax.swing.JComboBox yetki;
    // End of variables declaration//GEN-END:variables
}
