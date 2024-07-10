package Model;

import java.util.List;

public class MonHoc15 {
    private String mamon ;
    private String tenmon ; 
    private int sotinchi ; 
    private List<String> mamontienquyet ;
    private String maki ; 
    public MonHoc15() {
    }

    public MonHoc15(String mamon, String tenmon, int sotinchi, List<String> mamontienquyet, String maki) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
        this.mamontienquyet = mamontienquyet;
        this.maki = maki ;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }

    public List<String> getMamontienquyet() {
        return mamontienquyet;
    }

    public void setMamontienquyet(List<String> mamontienquyet) {
        this.mamontienquyet = mamontienquyet;
    }

    public String getMaki() {
        return maki;
    }

    public void setMaki(String maki) {
        this.maki = maki;
    }

    @Override
    public String toString(){
        String montq = "" ;
        for (int i = 0 ; i < mamontienquyet.size() ; i++){
            montq += mamontienquyet.get(i) + " " ;
        }
        return mamon + " " + tenmon + " " + sotinchi + " " + montq + " " + maki ;
    }
}
