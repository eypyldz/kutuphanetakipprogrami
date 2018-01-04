/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama;

import enumlar.DB;
import enumlar.UyelerEnum;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import propertiler.UyelerProperti;

/**
 *
 * @author Birnur
 */
public class AnaSayfa extends javax.swing.JFrame {
 ArrayList<UyelerProperti> kgs = new ArrayList<>();
 DB db=new DB();
 UyelerProperti up=new UyelerProperti();
    
  public static String uyeId="";
    public static String uyeAdi="";
    public static String uyeSoyadi="";
 
    public AnaSayfa() {
        initComponents();
    }
    
     public void kontrol() {
        try {
            kgs.clear();
            String query = "select *from uyeler";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
               
//                up.setKulAdi(rs.getString("" + UyelerEnum.kulAdi));
                    
                    uyeAdi=user.getText();
                    uyeSoyadi=pass.getText();

//                up.setSifre(rs.getString("" + UyelerEnum.sifre));
                kgs.add(up);
            }

        } catch (Exception e) {
            System.err.println("Kullanıcı Giriş Hatası : " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButtonUyeGiris = new javax.swing.JButton();
        goster = new javax.swing.JLabel();
        jButtonAdminGiris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 102, 0));
        jButton2.setText("Üye Kayıt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonUyeGiris.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonUyeGiris.setForeground(new java.awt.Color(153, 102, 0));
        jButtonUyeGiris.setText("Uye Giriş");
        jButtonUyeGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUyeGirisActionPerformed(evt);
            }
        });

        goster.setText("hataa");

        jButtonAdminGiris.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonAdminGiris.setForeground(new java.awt.Color(153, 102, 0));
        jButtonAdminGiris.setText("Admin Giriş");
        jButtonAdminGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminGirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUyeGiris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdminGiris)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUyeGiris)
                    .addComponent(jButtonAdminGiris))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(63, 63, 63)
                .addComponent(goster, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           this.setVisible(false);    
              new UyeEkle().setVisible(true);
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonUyeGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUyeGirisActionPerformed
             kontrol();
        for (UyelerProperti kg : kgs) {
            if (kg.getKulAdi().equals(user.getText().trim())&& kg.getSifre().equals(pass.getText().trim())) {
                
                new UyeMenuu().setVisible(true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı Adı veya Şifre Hatalı !");
            }
        }
    }//GEN-LAST:event_jButtonUyeGirisActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButtonAdminGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminGirisActionPerformed
        kontrol();
        for (UyelerProperti kg : kgs) {
            if (kg.getKulAdi().equals(user.getText().trim())&& kg.getSifre().equals(pass.getText())) {
                
                new AdminMenu().setVisible(true);
                this.dispose();               
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı Adı veya Şifre Hatalı !");
            }
        }
    }//GEN-LAST:event_jButtonAdminGirisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goster;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdminGiris;
    private javax.swing.JButton jButtonUyeGiris;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
