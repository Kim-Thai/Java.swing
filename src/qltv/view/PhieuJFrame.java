/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qltv.view.QLMuonTraJPanel;
import qltv.controller.TaiKhoanController;

public class PhieuJFrame extends javax.swing.JFrame {

        connect_sql a=new connect_sql();
        Connection con=a.getConnectionTo();
        int LuotMuon;
        int soluong=0;
        String masach="";
    public PhieuJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        getTenSach_cb();
        Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String muon= sdf.format(cal.getTime());
            System.out.println(cal.getTime());
            jtNgayMuon.setText(muon);
            // hạn trả sau 10 ngày 
            cal.add(GregorianCalendar.DAY_OF_YEAR, 10);
            String tra=sdf.format(cal.getTime());
            jtNgayHenTra.setText(tra); 
            getMaPhieu();
            LuotMuon=0;
             
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtMaPhieu = new javax.swing.JTextField();
        jtMaDocGia = new javax.swing.JTextField();
        jtNgayMuon = new javax.swing.JTextField();
        jtNgayHenTra = new javax.swing.JTextField();
        jtTinhTrang = new javax.swing.JTextField();
        cb_MaSach = new javax.swing.JComboBox<>();
        btn_xacnhan = new javax.swing.JButton();
        btn_huybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã phiếu");

        jLabel2.setText("Mã độc giả");

        jLabel3.setText("Tên  sách");

        jLabel4.setText("Ngày mượn");

        jLabel5.setText("Ngày hẹn trả");

        jLabel6.setText("Tình trạng");

        jtMaPhieu.setEditable(false);

        jtNgayMuon.setEditable(false);

        jtNgayHenTra.setEditable(false);

        jtTinhTrang.setEditable(false);
        jtTinhTrang.setText("Chưa");

        cb_MaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_MaSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtMaPhieu)
                    .addComponent(jtNgayMuon)
                    .addComponent(jtNgayHenTra)
                    .addComponent(jtTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jtMaDocGia)
                    .addComponent(cb_MaSach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtNgayHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_xacnhan.setText("Xác nhận");
        btn_xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xacnhanActionPerformed(evt);
            }
        });

        btn_huybo.setText("Hủy bỏ");
        btn_huybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btn_xacnhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_huybo)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xacnhan)
                    .addComponent(btn_huybo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_huyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyboActionPerformed
        this.dispose();   
    }//GEN-LAST:event_btn_huyboActionPerformed
private void getTenSach_cb()
    {
 
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from Sach");

            while (r.next()) {  

            cb_MaSach.addItem(r.getString("TenSach"));  
        } 
        } catch (Exception e) {
        }
    }
    private void btn_xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xacnhanActionPerformed
        
        String maphieu=jtMaPhieu.getText();
        
        // check số luong sách 
                
                try {
                Statement sta=con.createStatement();
                ResultSet rss=sta.executeQuery("select SoLuongSach  from Sach where MaSach ='" +masach+"'");
                while(rss.next())
                {
                 soluong=(Integer.parseInt(rss.getString("SoLuongSach")));
                 
                }
            
                } catch (SQLException ex) {
                    Logger.getLogger(QLMuonTraJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        if(jtMaDocGia.getText().trim().equals(""))
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã độc giả !!!");
            else if(masach.trim().equals(""))
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn sách !!!");
            else if(soluong<=0)
                JOptionPane.showMessageDialog(rootPane, "Sách này trong kho hiện đang hết !!!");
            else
        try {
            // đây rồi xử lý bên sql nữa mới được.
            
            String sql = "INSERT INTO MuonTraSach (MaPhieu, MaDG, MaSach,MaAD ,NgayMuon,NgayHenTra,TinhTrang) VALUES (?, ?, ?,?, ?,?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, maphieu);
            statement.setString(2, jtMaDocGia.getText());
            statement.setString(3,masach);
            statement.setString(4, TaiKhoanController.MaAdmin);
            statement.setString(5, jtNgayMuon.getText());
            statement.setString(6, jtNgayHenTra.getText());
            statement.setString(7, "Chưa");
            
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký thành công!!!");
                updateTopThongKe();
                this.dispose();
                ChoMuonSach();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi không thể mượn !!!!");
            
        }
    }//GEN-LAST:event_btn_xacnhanActionPerformed

    private void cb_MaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_MaSachActionPerformed
        // get Mã sách.
        System.out.println("ddd");
        
        
        try {
            String sql="select * from Sach where TenSach=N'"+cb_MaSach.getSelectedItem().toString()+"'";
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery(sql);

            while (r.next()) { 

                 
                masach=r.getString("MaSach");
                
            }
            
        } catch (Exception e) {
            System.out.println("sai r");
        }
    }//GEN-LAST:event_cb_MaSachActionPerformed
private void updateTopThongKe()
{
    
    try {
        Statement sta_lm=con.createStatement();
            ResultSet rss_lm=sta_lm.executeQuery("select LuotMuon as LM  from ThongKeTop where MaSach='" +masach+"'");
            while(rss_lm.next())
            {
                String lm=rss_lm.getString("LM");
                LuotMuon=Integer.parseInt(lm) ;
                
                System.out.println("Luot Muon: "+LuotMuon);
            }   
        
    } catch (Exception e) {
        System.out.println("0000");
    }
    if((LuotMuon +1 )>=1)
    {
        try {
        String sql="update ThongKeTop set LuotMuon=? where MaSach=?";
        PreparedStatement statement=con.prepareStatement(sql);
        LuotMuon=LuotMuon+1;
        String lm=Integer.toString(LuotMuon);
        statement.setString(1, lm);
        statement.setString(2, masach);
        int sua=statement.executeUpdate();
        if(sua>0)
            System.out.println("Sửa bảng top thành công.");
    } catch (Exception e) {
        System.out.println("sai ");
    }
        
    }   
}
    private  void getMaPhieu()
    {
                
                try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaPhieu) as maphieu from MuonTraSach");
            while(rss.next())
            {
                int id=(Integer.parseInt(rss.getString("maphieu")) +1);
                jtMaPhieu.setText(String.valueOf(id));
            }
                
            
        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ChoMuonSach(){
        // khi mượn thì tăng số lượng sách vào bảng sách
        try {
                    String sql = "UPDATE   Sach SET SoLuongSach=?  where MaSach=?";
                    PreparedStatement statement = con.prepareStatement(sql);
                    
                    statement.setString(1,String.valueOf((soluong-1)) );

                    statement.setString(2,masach);
                    int rowsUpdate = statement.executeUpdate();
                    if (rowsUpdate > 0) {
                        System.out.println("Giảm tành công");
                    }
                } catch (SQLException ex) {
                    System.out.println("lỗi thêm bảng sách");
                }
        
    }
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
            java.util.logging.Logger.getLogger(PhieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huybo;
    private javax.swing.JButton btn_xacnhan;
    private javax.swing.JComboBox<String> cb_MaSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtMaDocGia;
    private javax.swing.JTextField jtMaPhieu;
    private javax.swing.JTextField jtNgayHenTra;
    private javax.swing.JTextField jtNgayMuon;
    private javax.swing.JTextField jtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
