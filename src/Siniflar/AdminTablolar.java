/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Siniflar;

import enumlar.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class AdminTablolar {
   
    public DefaultTableModel kitaplar(String gelenAd){
        DefaultTableModel dtm= new DefaultTableModel();
         DB db=new DB();
        dtm.addColumn("ID"); 
        dtm.addColumn("Yazar Adi ");
        dtm.addColumn("Yazar Soyadı");
        dtm.addColumn("Kitap Adi");
        
       
        String query = "select * from kitaplar where yazarAdi like '%" + gelenAd + "%'";
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("kitapID"),rs.getString("yazarAdi"), rs.getString("yazarSoyadi"), rs.getString("kitapAdi")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminTablolar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.kapat();
        }
        return  dtm;
    }
   
    
     
}
