package Model;
import java.util.Date ; 

public class KhungGio15 {
    private int magio ;
    private String ngay ;
    private String giobatdau ; 
    private String gioketthuc ;

    public KhungGio15() {
    }

    public KhungGio15(int magio, String ngay, String giobatdau, String gioketthuc) {
        this.magio = magio;
        this.ngay = ngay;
        this.giobatdau = giobatdau;
        this.gioketthuc = gioketthuc;
    }

    public int getMagio() {
        return magio;
    }

    public void setMagio(int magio) {
        this.magio = magio;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGiobatdau() {
        return giobatdau;
    }

    public void setGiobatdau(String giobatdau) {
        this.giobatdau = giobatdau;
    }

    public String getGioketthuc() {
        return gioketthuc;
    }

    public void setGioketthuc(String gioketthuc) {
        this.gioketthuc = gioketthuc;
    }
    
    @Override
    public String toString(){
        return  ngay + ", tu " + giobatdau + " den " + gioketthuc;
    }
}
