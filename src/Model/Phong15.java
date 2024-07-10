package Model;

public class Phong15 {
    private String maphong ; 
    private String tenphong ;

    public Phong15() {
    }

    public Phong15(String maphong, String tenphong) {
        this.maphong = maphong;
        this.tenphong = tenphong;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
    
    @Override
    public String toString(){
        return maphong +" " + tenphong ;
    }
}
