package enumlar;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import propertiler.UyelerProperti;
import uygulama.AdminMenu;
import uygulama.AnaSayfa;

import uygulama.UyeMenuu;


public class DB {

    private final String url ="jdbc:mysql://localhost/";
    private final String driver = "com.mysql.jdbc.Driver";
    final private String encode = "?useUnicode=true&characterEncoding=utf-8";
    
    private String dbName ="kutuphaneotomasyon";
    private String dbUser ="root";
    private String dbPass = "";
    
    
    private Connection conn =null;
    private Statement st = null;
    private PreparedStatement preSt = null;
    
    public DB () {
    }
    
    public ResultSet ar(ResultSet st){
        return st;
    }
    
    public DB (String dbName, String dbUser, String dbPass) {
    this.dbName = dbName;
    this.dbUser = dbUser;
    this.dbPass = dbPass;
    }
    public Statement baglan() {
        if (conn!=null) {
        kapat();
        }
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName+encode,dbUser,dbPass);
            st = conn.createStatement();
            System.out.println("Bağlantı başarılı !"); 
       } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Bağlantı hatası !"+e);
        }
        return st;
    }
    public PreparedStatement preBaglan(String query) {
        try {
            if (conn != null) {
                kapat();
            }
            // kütüphane hazırlanıyor
            Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName+encode, dbUser, dbPass);
            preSt = conn.prepareStatement(query);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("PreparedStatement hatası : " + e);
        }
        return preSt;
    }
    
    public void kapat () {
        try {
            if (preSt != null) {
                preSt.close();
                System.out.println("PraperedStatement Kapandı");
                preSt = null;
            }
            if(st!= null) {
            st.close();
                System.out.println("st kapatıldı !");
                st = null;
            }
            if(conn!= null) {
                conn.close();
                    System.out.println("conn kapatıldı !");
                    conn= null;
                }
            
        } catch (SQLException e) {
            System.err.println("St ve Conn kapatma hatası !"+e);
        }
    
    }
    
    
    public void giris(String gkadi, String gsifre) throws SQLException {
        try {        
            String sorgu = "select * from uyeler where kulAdi ='" + gkadi + "' and sifresi ='" + gsifre + "'";              
            ResultSet rs = st.executeQuery(sorgu);
                 AnaSayfa ac= new AnaSayfa();
                 AdminMenu ad=new AdminMenu(0, gkadi, gkadi);
                 UyeMenuu um=new UyeMenuu();
            if (rs.first()) {
                
                if (rs.getString("yetki").equals("Yetkili")) {
                  
                    ac.setVisible(false);
                    
                   ad.setVisible(true);
                }
                else {ac.setVisible(false);
               um.setVisible(true);
                }
            } else {
                System.out.println("kul adi veya sifre hatalı");
            }
        } catch (Exception ex) {
            System.err.println("yanliş bişiler var "+ex);
        }
    }

   
    public boolean GirisKontrol(UyelerProperti kul){
        String query="select count(*) as eslesme from uyeler where " +UyelerEnum.kulAdi+ "='"+kul.getKulAdi()+"'"
                + "and "+UyelerEnum.sifre+"='"+kul.getSifre()+"'";
        try {
          ResultSet rs=baglan().executeQuery(query);
            System.out.println(query);
            System.out.println(rs.getString("eslesme"));
            if(Integer.valueOf(rs.getString("eslesme"))>0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.err.println("yanliş bişilerrrrrr  "+e);
        }
        return false;
    }

}
