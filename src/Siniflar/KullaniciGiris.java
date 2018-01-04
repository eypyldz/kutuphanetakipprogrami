
package Siniflar;

import enumlar.DB;
import enumlar.UyelerEnum;
import java.sql.ResultSet;
import propertiler.UyelerProperti;

public class KullaniciGiris {
             DB db=new DB();
        public boolean GirisKontrol(UyelerProperti kul){ 
          
            
        String query="select count(*) as eslesme from uyeler where " +UyelerEnum.kulAdi+ "='"+kul.getKulAdi()+"' "
                + "and "+UyelerEnum.sifre+"='"+kul.getSifre()+"'";
        try {
            
            ResultSet rs=db.baglan().executeQuery(query);
            System.out.println(query);
            System.out.println(rs.getString("eslesme"));
            if(Integer.valueOf(rs.getString("eslesme"))>0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }
        
//        public boolean UyeGirisKontrol(UyelerProperti kul){ 
//            DB db=new DB();
//        String query="select count(*) as eslesme from uyeler where " +UyelerEnum.kulAdi+ "='"+kul.getKulAdi()+"' "
//                + "and "+UyelerEnum.sifre+"='"+kul.getSifre()+"'";
//        try {
//            ResultSet rs=db.baglan().executeQuery(query);
//            System.out.println(query);
//            System.out.println(rs.getString("eslesme"));
//            if(Integer.valueOf(rs.getString("eslesme"))>0){
//                return true;
//            }else{
//                return false;
//            }
//        } catch (Exception e) {
//        }
//        return false;
//    }
    
}
