/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.KhungGio15;
import Model.LopHocPhan15;
import Model.MonHoc15;
import Model.Phong15;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] agrs){
        LenLichHocDAO15 a = new LenLichHocDAO15() ; 
        try {
            List<LopHocPhan15> ls = a.getListLopHocPhan("INT1234") ;
            System.out.println(ls);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
