
package Siniflar;

import enumlar.DB;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UyeTablolar {
    
//    public DefaultTableModel UyeAnaSayfa(int id, String ad, String soyad){
//        DefaultTableModel dtm=new DefaultTableModel();
//        DB db=new DB();
//        dtm.addColumn("Başlık"); 
//        dtm.addColumn("Duyurular");
//        String query="Select *from duyurular";
//       
//        try {
//             ResultSet rs = db.baglan().executeQuery(query);
//             while (rs.next()) {
//                dtm.addRow(new String[]{rs.getString("duyruID"),rs.getString("duyuru"), rs.getString("baslik")});
//
//            }
//             
//        } catch (Exception e) {
//           Logger.getLogger(UyeTablolar.class.getName()).log(Level.SEVERE, null, e);
//        }
//        
//        return dtm;
//    }
    
    
    public DefaultTableModel KitalAl(String ad){
        DefaultTableModel dtm=new DefaultTableModel();
        DB db=new DB();
        dtm.addColumn("ID");
        dtm.addColumn("Yazar Adı"); 
        dtm.addColumn("Yazar Soyadı"); 
        dtm.addColumn("Kitap Adı"); 
        
        String query="select * from kitaplar where kitapAdi like '%" + ad + "%'";
        try {
             ResultSet rs = db.baglan().executeQuery(query);
             
             while (rs.next()) {
               dtm.addRow(new String[]{rs.getString("kitapID"),rs.getString("yazarAdi"), rs.getString("yazarSoyadi"), rs.getString("kitapAdi")});
                
             }
        } catch (Exception e) {
            Logger.getLogger(UyeTablolar.class.getName()).log(Level.SEVERE, null, e);
        }
        return  dtm;
    }
    
    public DefaultTableModel duyurular(){
        DefaultTableModel dtm=new DefaultTableModel();
        DB db=new DB();
        dtm.addColumn("ID");
        dtm.addColumn("baslik");
        dtm.addColumn("duyurular");
        String query="select *from duyurular";
        try {
            ResultSet rs=db.baglan().executeQuery(query);
            
            while(rs.next()){
                dtm.addRow(new String[]{rs.getString("duyuruID"),rs.getString("baslik"),rs.getString("duyuru")});
            }
            
        } catch (Exception e) {
             Logger.getLogger(UyeTablolar.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return  dtm;
    }
    
//    public void labelyazdir(){
//        DB db=new DB();
//        String query="select ";
//    }
}
