package Model;

public class LopHocPhan15 {
    private String malop ;
    private String tenlop ; 
    private int sosinhvientoida ;
    private String maphonghoc ; 
    private int makhunggio ;
    private String mamon ; 

    public LopHocPhan15() {
        
    }

    public LopHocPhan15(String malop, String tenlop, int sosinhvientoida, String maphonghoc, int makhunggio, String mamon) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.sosinhvientoida = sosinhvientoida;
        this.maphonghoc = maphonghoc;
        this.makhunggio = makhunggio;
        this.mamon = mamon ;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getSosinhvientoida() {
        return sosinhvientoida;
    }

    public void setSosinhvientoida(int sosinhvientoida) {
        this.sosinhvientoida = sosinhvientoida;
    }

    public String getMaphonghoc() {
        return maphonghoc;
    }

    public void setMaphonghoc(String maphonghoc) {
        this.maphonghoc = maphonghoc;
    }

    public int getMakhunggio() {
        return makhunggio;
    }

    public void setMakhunggio(int makhunggio) {
        this.makhunggio = makhunggio;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    @Override
    public String toString(){
        return malop + " " + tenlop + " " + maphonghoc + " " + makhunggio + " " + mamon;
    }
    
}
