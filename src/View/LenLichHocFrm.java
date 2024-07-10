/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LenLichHocDAO15;
import Model.KhungGio15;
import Model.LopHocPhan15;
import Model.MonHoc15;
import Model.Phong15;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LenLichHocFrm extends javax.swing.JFrame {
    private DefaultTableModel tmLLH ;
    private String fLLH;
    private LenLichHocDAO15 a = new LenLichHocDAO15() ; 
    public LenLichHocFrm() {
        initComponents();
        loadData() ;
        setButtonState(true) ;
    }

    private void setButtonState(boolean b){
        xacnhanbtn.setEnabled(!b);
    }
    private void loadData(){
        
        try {
            List<MonHoc15> ls = a.getListMonHoc() ;
            for(int i = 0 ; i < ls.size() ; i++){
                selectMonHoc.addItem(ls.get(i).getTenmon()) ;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Controller.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        selectMonHoc = new javax.swing.JComboBox<>();
        selectLopHocPhan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selectPhong = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        selectKhungGio = new javax.swing.JComboBox<>();
        xacnhanbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí lịch học");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jLabel4.setText("Chọn môn học");

        selectMonHoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectMonHocItemStateChanged(evt);
            }
        });
        selectMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMonHocMouseClicked(evt);
            }
        });
        selectMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMonHocActionPerformed(evt);
            }
        });
        selectMonHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectMonHocKeyPressed(evt);
            }
        });

        selectLopHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectLopHocPhanActionPerformed(evt);
            }
        });

        jLabel5.setText("Chọn lớp học phần");

        jLabel6.setText("Chọn phòng học");

        selectPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPhongActionPerformed(evt);
            }
        });

        jLabel7.setText("Chọn khung giờ");

        selectKhungGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectKhungGioActionPerformed(evt);
            }
        });

        xacnhanbtn.setText("Xác nhận");
        xacnhanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectLopHocPhan, 0, 152, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectPhong, 0, 158, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectKhungGio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xacnhanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectLopHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectKhungGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170)
                .addComponent(xacnhanbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lên lịch học", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMonHocActionPerformed
        selectPhong.removeAllItems(); 
        selectLopHocPhan.removeAllItems();
        selectKhungGio.removeAllItems();
        String s = selectMonHoc.getSelectedItem().toString() ;
        System.out.println(s);
        String ma = a.get_mamon_from_tenmon(s) ;
        try {
            List<LopHocPhan15> ls = a.getListLopHocPhan(ma) ;
            if(ls.size() > 0){
                for(int i = 0 ; i < ls.size() ; i++){
                    selectLopHocPhan.addItem(ls.get(i).getTenlop());
                }
                selectLopHocPhan.addItem("Them lop hoc phan...");
            }
            

        } 
        catch (SQLException ex) {
            Logger.getLogger(Controller.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_selectMonHocActionPerformed

    private void selectLopHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectLopHocPhanActionPerformed
        String s = "" ;
        if(selectLopHocPhan.getItemCount() > 0 ){
            List<KhungGio15> lskg = new ArrayList<>(); 
            List<Phong15> lsp = new ArrayList<>() ;
            try {
                lskg = a.getListKhungGio();
                lsp = a.getListPhong() ;
            } catch (SQLException ex) {
                Logger.getLogger(LenLichHocFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            s = selectLopHocPhan.getSelectedItem().toString() ;
            selectPhong.removeAllItems();
            selectKhungGio.removeAllItems();
            if(s.equalsIgnoreCase("Them lop hoc phan...")){
                selectLopHocPhan.removeAllItems(); 
                String ma = a.newLopHocPhan() ;
                selectLopHocPhan.addItem(ma + " - Nhom " + Integer.parseInt(ma.replaceAll("[\\D]", "")));
                for(int i = 0 ; i < lsp.size() ; i++){
                    selectPhong.addItem(lsp.get(i).getMaphong());
                }
                for(int i = 0 ; i < lskg.size() ; i++){
                    selectKhungGio.addItem(lskg.get(i).toString());
                }
                selectPhong.addItem("");
                selectKhungGio.addItem("");
                selectPhong.setSelectedItem("");
                selectKhungGio.setSelectedItem("");
                setButtonState(false) ;
            }
            else{
                String malop = a.get_maphong_from_tenlop(s) ;
                int magio = a.get_magio_from_tenlop(s) ;
                try{
                    selectPhong.addItem(malop);
                    selectKhungGio.addItem(a.getGio(magio));
                    selectPhong.setSelectedItem(malop);
                    selectKhungGio.setSelectedItem(a.getGio(magio));
                }
                catch (SQLException ex) {
                    Logger.getLogger(Controller.Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_selectLopHocPhanActionPerformed

    private void selectKhungGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectKhungGioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectKhungGioActionPerformed

    private void selectMonHocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectMonHocKeyPressed
        
    }//GEN-LAST:event_selectMonHocKeyPressed

    private void selectMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMonHocMouseClicked

    }//GEN-LAST:event_selectMonHocMouseClicked

    private void selectMonHocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectMonHocItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMonHocItemStateChanged

    private void xacnhanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanbtnActionPerformed
        if(selectKhungGio.getSelectedItem().toString().equalsIgnoreCase("") || selectPhong.getSelectedItem().toString().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(new JFrame(), "Dien day du thong tin!") ; 
        }
        else{
            List<KhungGio15> lskg = new ArrayList<>(); 
            List<Phong15> lsp = new ArrayList<>() ;
            List<MonHoc15> lsmh = new ArrayList<>() ; 
            try {
                lskg = a.getListKhungGio();
                lsp = a.getListPhong() ;
                lsmh = a.getListMonHoc() ;
            } catch (SQLException ex) {
                Logger.getLogger(LenLichHocFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            String malop = selectLopHocPhan.getSelectedItem().toString() ; 
            malop = malop.split("-")[0].strip() ;
            String tenmon = selectMonHoc.getSelectedItem().toString() ;
            String[] arr = tenmon.split(" ") ;
            String tenlop = "" ; 
            for(String x : arr){
                tenlop += x.substring(0, 1).toUpperCase() ;
            }
            tenlop += " - Nhom " + malop.substring(malop.length() - 1, malop.length());
            String maphong = selectPhong.getSelectedItem().toString() ;
            int i_mh = selectMonHoc.getSelectedIndex() ;
            String mamon = lsmh.get(i_mh).getMamon() ; 
            int i_kg = selectKhungGio.getSelectedIndex() ; 
            int magio = lskg.get(i_kg).getMagio(); 
            int ssv = 61 ;
            LopHocPhan15 lhp = new LopHocPhan15(malop, tenlop, ssv, maphong, magio, mamon) ; 
            if(a.checkLopHocPhan(lhp)){
                JOptionPane.showMessageDialog(new JFrame(), "Them lop hoc phan that bai do phong " + maphong + " da co lop hoc phan khac vao khung gio tren!");
            }
            else{
                try {
                    a.addLopHocPhan(lhp);
                    JOptionPane.showMessageDialog(new JFrame(), "Them lop hoc moi thanh cong");
                } catch (SQLException ex) {
                    Logger.getLogger(LenLichHocFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_xacnhanbtnActionPerformed

    private void selectPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPhongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LenLichHocFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LenLichHocFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LenLichHocFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LenLichHocFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LenLichHocFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> selectKhungGio;
    private javax.swing.JComboBox<String> selectLopHocPhan;
    private javax.swing.JComboBox<String> selectMonHoc;
    private javax.swing.JComboBox<String> selectPhong;
    private javax.swing.JButton xacnhanbtn;
    // End of variables declaration//GEN-END:variables
}