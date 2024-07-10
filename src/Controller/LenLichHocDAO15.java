package Controller;
import Model.KhungGio15;
import Model.MonHoc15;
import java.sql.Connection ;
import java.util.List;
import Model.LopHocPhan15 ;
import Model.Phong15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LenLichHocDAO15 {
    private Connection con ;
    private List<LopHocPhan15> ls ;
    private List<MonHoc15> lsmh ;
    private List<Phong15> lsp ;
    private List<KhungGio15> lskg ; 
    
    public LenLichHocDAO15(){
        String dbUrl = "jdbc:mysql://localhost:3308/BTLCNPM";

        String dbClass = "com.mysql.cj.jdbc.Driver";
        try {
        Class.forName(dbClass);
        con = DriverManager.getConnection (dbUrl, "root", "0915166497Bc#");

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<MonHoc15> getListMonHoc() throws SQLException{
        Statement st = con.createStatement();
        String sql = ("SELECT * FROM tblMonHoc15 ;");
        ResultSet rs = st.executeQuery(sql);
        lsmh = new ArrayList<>() ;
        while(rs.next()) { 
            String mamon = rs.getString("Mamon"); 
            String tenmon = rs.getString("TenMon");
            int sotinchi = rs.getInt("sotinchi") ;
            String mamontq = rs.getString("mamontienquyet") ;
            List<String> montq ;
            if(mamontq != ""){
                montq = Arrays.asList(mamontq.split(",") );  
            }
            else{
                montq = new ArrayList<>() ;
            }
            String maki = rs.getString("maki") ;
            lsmh.add(new MonHoc15(mamon, tenmon, sotinchi, montq, maki)) ;
        }
        return lsmh ;
    }
    
    public List<LopHocPhan15> getListLopHocPhan(String mamon) throws SQLException{
        Statement st = con.createStatement();
        String sql = ("SELECT * FROM tblLopHocPhan15 ;");
        ResultSet rs = st.executeQuery(sql);
        ls = new ArrayList<>() ;
        while(rs.next()) { 
            String mamontmp = rs.getString("Mamon") ;
            if(mamontmp.equalsIgnoreCase(mamon)){
                String malop = rs.getString("Malop"); 
                String tenlop = rs.getString("Tenlop");
                int sosv = rs.getInt("Sosinhvientoida") ;
                String maphong = rs.getString("Maphonghoc") ;
                int magio = rs.getInt("Makhunggio") ;
                ls.add(new LopHocPhan15(malop, tenlop, sosv, maphong, magio, mamon)) ;
            }
        }
        if(ls.size() == 0){
            return Collections.emptyList(); 
        }
        else{
            return ls ;
        }
    }
    
    public List<Phong15> getListPhong() throws SQLException{
       Statement st = con.createStatement();
        String sql = ("SELECT * FROM tblPhong15 ;");
        ResultSet rs = st.executeQuery(sql);
        List<Phong15> ls = new ArrayList<>() ;
        while(rs.next()) { 
            String maphong = rs.getString("maphong");
            String sophong = rs.getString("sophong") ;
            ls.add(new Phong15( maphong, sophong)) ;
        }
        return ls ;                
    }
  
    public List<KhungGio15> getListKhungGio() throws SQLException{
        Statement st = con.createStatement();
        String sql = ("SELECT * FROM tblKhungGio15 ;");
        ResultSet rs = st.executeQuery(sql);
        List<KhungGio15> ls = new ArrayList<>() ;
        while(rs.next()) { 
            int magio = rs.getInt("Magio"); 
            String ngay = rs.getString("Ngay");
            String giobatdau = rs.getString("Giobatdau") ;
            String giokt = rs.getString("Gioketthuc") ;
            ls.add(new KhungGio15(magio, ngay, giobatdau, giokt)) ;
        }
        return ls ;        
    }
    
    public String newLopHocPhan(){
        int s = ls.size() ; 
        String x = "CNPM" + Integer.toString(s + 1) ;
        return x ;
    }
    
    public void addLopHocPhan(LopHocPhan15 s) throws SQLException{
        String sql = ("insert into tblLopHocPhan15 (malop, tenlop, sosinhvientoida, maphonghoc, makhunggio, mamon)" + " values(?, ?, ?, ?, ?, ?)");
        PreparedStatement preparedStmt = con.prepareStatement(sql);
        preparedStmt.setString (1, s.getMalop());
        preparedStmt.setString (2, s.getTenlop());
        preparedStmt.setInt   (3, 61);
        preparedStmt.setString(4, s.getMaphonghoc());
        preparedStmt.setInt    (5, s.getMakhunggio());
        preparedStmt.setString(6, s.getMamon()) ; 
        preparedStmt.execute();
    }
    
    public boolean checkLopHocPhan(LopHocPhan15 a){
        Boolean error = false ; 
        for(int i = 0 ; i< ls.size() ; i++){
            if(ls.get(i).getMaphonghoc().equalsIgnoreCase(a.getMaphonghoc())){
                if (ls.get(i).getMakhunggio() == a.getMakhunggio()) {
                    System.out.println("error");
                    error = true ; 
                    break ;
                }
            }
        }
        return error ;
    }
    
    public String get_mamon_from_tenmon(String tenmon){
        String res = "";
        for(int i = 0 ; i < lsmh.size() ; i++){
            if(lsmh.get(i).getTenmon().equalsIgnoreCase(tenmon)){
                res = lsmh.get(i).getMamon() ;
                break ;
            }
        }
        return res ;
    }
    
    public String get_maphong_from_tenlop(String tenlop){
        String res = "";
        for(int i = 0 ; i < ls.size() ; i++){
            if(ls.get(i).getTenlop().equalsIgnoreCase(tenlop)){
                res = ls.get(i).getMaphonghoc() ;
                break ;
            }
        }
        return res ;
    }
    
    public int get_magio_from_tenlop(String tenlop){
        int res = 0;
        for(int i = 0 ; i < ls.size() ; i++){
            if(ls.get(i).getTenlop().equalsIgnoreCase(tenlop)){
                res = ls.get(i).getMakhunggio() ;
                break ;
            }
        }
        return res ;        
    }
   
    
    public String getGio(int magio) throws SQLException{
        lskg = getListKhungGio() ;
        String res = "" ;
        for(int i = 0 ; i < lskg.size() ; i++){
            if(lskg.get(i).getMagio() == magio){
                res = lskg.get(i).toString() ;
            }
        }
        return res ; 
    }
}
