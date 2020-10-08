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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qltv.view.BanDocJPanel;

public class BanDocJFrame extends javax.swing.JFrame {

    connect_sql  a=new connect_sql();
    Connection con =a.getConnectionTo();
    DefaultTableModel mode;
    int check;
    public BanDocJFrame() {
        initComponents();
        check_Xoa_Sua();
        this.setLocationRelativeTo(null);
        
        check=0;
        if(BanDocJPanel.flag_bandoc==1)
        {
            rdo_Nam.setSelected(true);
            
        }
            
        else if(BanDocJPanel.flag_bandoc==2)
                {
                    getdl();
                }
        
        
         
    }

    private void check_Xoa_Sua(){
        if(BanDocJPanel.flag_bandoc==1)
        {
            txt_Note.setText("Thêm Bạn Đọc.");
            // get thời gian hiện tại.
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String muon= sdf.format(cal.getTime());
            txt_NgayDangKy.setText(muon);
            getMaBanDoc();
        }
        else if(BanDocJPanel.flag_bandoc==2)
        {
            txt_Note.setText("Sửa Bạn Đọc");
        }
    }
    private void getMaBanDoc()
    {
            try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaDG) as mabandoc from DocGia");
            while(rss.next())
            {
                int MaBanDoc=(Integer.parseInt(rss.getString("mabandoc")) +1);
                txt_MaBanDoc.setText(String.valueOf(MaBanDoc));
            }
                
            
        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Them()
    { 
        
        
        String gt="Nam";
        if(rdo_Nam.isSelected()==true) gt="Nam";
        else if(rdo_Nu.isSelected()==true) gt="Nữ";
        
        try {
            String sql ="insert into DocGia (MaDG,TenDG,GioiTinhDG,NgaySinh,DiaChiDG,SoDT,NgayTao) values(?,?,?,?,?,?,?)";
            
            PreparedStatement statement=con.prepareStatement(sql);
            statement.setString(1, txt_MaBanDoc.getText());
            statement.setString(2, txt_TenBanDoc.getText());
            statement.setString(3, gt);
            statement.setString(4, txt_NgaySinh.getText());
            statement.setString(5, txt_DiaChi.getText());
            statement.setString(6, txt_DienThoai.getText());
            statement.setString(7, txt_NgayDangKy.getText());
            int rowupdate=statement.executeUpdate();
            if(rowupdate>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký thẻ bạn đọc thành công!!!");
            }
                
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Lỗi đăng ký không thành công!!!");
        }
    }
    private void sua(){
        String gt="Nam";
        if(rdo_Nam.isSelected()==true) gt="Nam";
        else if(rdo_Nu.isSelected()==true) gt="Nữ";
        try {
            String sql_update="update DocGia set TenDG=?, GioiTinhDG=?, NgaySinh=?,DiaChiDG=?,SoDT=? where MaDG=?";
            PreparedStatement statement =con.prepareStatement(sql_update);
            statement.setString(1, txt_TenBanDoc.getText());
            statement.setString(2, gt);
            statement.setString(3, txt_NgaySinh.getText());
            statement.setString(4, txt_DiaChi.getText());
            statement.setString(5, txt_DienThoai.getText());
            statement.setString(6, txt_MaBanDoc.getText());
            int update=statement.executeUpdate();
            if(update>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã sửa thành công !!!");
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công !!!");
            }
        } catch (Exception e) {
            System.out.println("đây");
        }
    }
    private  void check_null()
    {
        if(txt_TenBanDoc.getText().trim().length()==0)
        {
            txt_ThongBao.setText("Bạn không được để trống tên độc giả!!!");
        }
        else if(txt_NgaySinh.getText().trim().length()==0)
        {
            txt_ThongBao.setText("Bạn không được để trống ngày sinh độc giả!!!");
        }
        else if(txt_DiaChi.getText().trim().length()==0)
        {
            txt_ThongBao.setText("Bạn không được để trống đia chỉ độc giả!!!");
        }
        else if(txt_DienThoai.getText().trim().length()==0)
        {
            txt_ThongBao.setText("Bạn không được để trống điện thoại độc giả!!!");
        }
        else 
            check=1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jtMaBanDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtTenBanDoc = new javax.swing.JTextField();
        jtGioiTinh = new javax.swing.JTextField();
        jtDiaChi = new javax.swing.JTextField();
        jtDienThoai = new javax.swing.JTextField();
        jtNgayDangKy = new javax.swing.JTextField();
        jtNgayHetHan = new javax.swing.JTextField();
        jbtXacNhan = new javax.swing.JButton();
        jbtHuyBo = new javax.swing.JButton();
        btn_gr_rdo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_MaBanDoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_TenBanDoc = new javax.swing.JTextField();
        txt_DienThoai = new javax.swing.JTextField();
        txt_NgayDangKy = new javax.swing.JTextField();
        rdo_Nu = new javax.swing.JRadioButton();
        rdo_Nam = new javax.swing.JRadioButton();
        txt_DiaChi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_NgaySinh = new javax.swing.JTextField();
        jbtHuyBo1 = new javax.swing.JButton();
        jbtXacNhan1 = new javax.swing.JButton();
        txt_Note = new javax.swing.JLabel();
        txt_ThongBao = new javax.swing.JLabel();

        jLabel1.setText("Mã bạn đọc");

        jLabel2.setText("Tên bạn đọc");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Điện thoại");

        jLabel6.setText("Ngày đăng ký");

        jLabel7.setText("Ngày hết hạn thẻ");

        jbtXacNhan.setText("Xác nhận");

        jbtHuyBo.setText("Hủy bỏ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtMaBanDoc)
                            .addComponent(jtTenBanDoc)
                            .addComponent(jtGioiTinh)
                            .addComponent(jtDiaChi)
                            .addComponent(jtDienThoai)
                            .addComponent(jtNgayDangKy)
                            .addComponent(jtNgayHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jbtXacNhan)
                        .addGap(106, 106, 106)
                        .addComponent(jbtHuyBo)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMaBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTenBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXacNhan)
                    .addComponent(jbtHuyBo))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_MaBanDoc.setEditable(false);

        jLabel8.setText("Mã bạn đọc");

        jLabel9.setText("Tên bạn đọc");

        jLabel10.setText("Giới tính");

        jLabel11.setText("Địa chỉ");

        jLabel12.setText("Điện thoại");

        jLabel13.setText("Ngày đăng ký");

        txt_NgayDangKy.setEditable(false);

        btn_gr_rdo.add(rdo_Nu);
        rdo_Nu.setText("Nữ");
        rdo_Nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_NuActionPerformed(evt);
            }
        });

        btn_gr_rdo.add(rdo_Nam);
        rdo_Nam.setText("Nam");

        jLabel14.setText("Ngày Sinh");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_MaBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(txt_TenBanDoc))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rdo_Nam)
                                        .addGap(26, 26, 26)
                                        .addComponent(rdo_Nu)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_NgayDangKy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(txt_NgaySinh)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_TenBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rdo_Nam)
                    .addComponent(rdo_Nu))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_DienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_NgayDangKy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jbtHuyBo1.setText("Hủy bỏ");
        jbtHuyBo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyBo1ActionPerformed(evt);
            }
        });

        jbtXacNhan1.setText("Xác nhận");
        jbtXacNhan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXacNhan1ActionPerformed(evt);
            }
        });

        txt_Note.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Note.setForeground(new java.awt.Color(255, 51, 51));
        txt_Note.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_ThongBao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_ThongBao.setForeground(new java.awt.Color(255, 51, 51));
        txt_ThongBao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jbtXacNhan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jbtHuyBo1)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXacNhan1)
                    .addComponent(jbtHuyBo1))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtHuyBo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyBo1ActionPerformed
        // hủy bỏ
        this.dispose();
    }//GEN-LAST:event_jbtHuyBo1ActionPerformed

    private void rdo_NuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_NuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_NuActionPerformed

    private void jbtXacNhan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXacNhan1ActionPerformed
        check_null();
        if(check==1)
        {
            if(BanDocJPanel.flag_bandoc==1)
        {
            rdo_Nam.setSelected(true);
            Them();
            this.dispose();
        }
            
        else if(BanDocJPanel.flag_bandoc==2)
                {
                    
                    sua();
                    this.dispose();
                }
        }
        
        
    }//GEN-LAST:event_jbtXacNhan1ActionPerformed

    private void getdl()
    {
        txt_MaBanDoc.setText(BanDocJPanel.madg);
        txt_TenBanDoc.setText(BanDocJPanel.tendg);
        txt_DiaChi.setText(BanDocJPanel.dc);
        txt_DienThoai.setText(BanDocJPanel.dienthoai);
        txt_NgayDangKy.setText(BanDocJPanel.ngaydangky);
        txt_NgaySinh.setText(BanDocJPanel.ngaysinh);
        if(BanDocJPanel.gt.equals("Nam"))
                rdo_Nam.setSelected(true);
        else
                rdo_Nu.setSelected(true);
        //txt_MaBanDoc.setText(BanDocJPanel.madg);
        
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
            java.util.logging.Logger.getLogger(BanDocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanDocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanDocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanDocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanDocJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btn_gr_rdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtHuyBo;
    private javax.swing.JButton jbtHuyBo1;
    private javax.swing.JButton jbtXacNhan;
    private javax.swing.JButton jbtXacNhan1;
    private javax.swing.JTextField jtDiaChi;
    private javax.swing.JTextField jtDienThoai;
    private javax.swing.JTextField jtGioiTinh;
    private javax.swing.JTextField jtMaBanDoc;
    private javax.swing.JTextField jtNgayDangKy;
    private javax.swing.JTextField jtNgayHetHan;
    private javax.swing.JTextField jtTenBanDoc;
    private javax.swing.JRadioButton rdo_Nam;
    private javax.swing.JRadioButton rdo_Nu;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_DienThoai;
    private javax.swing.JTextField txt_MaBanDoc;
    private javax.swing.JTextField txt_NgayDangKy;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JLabel txt_Note;
    private javax.swing.JTextField txt_TenBanDoc;
    private javax.swing.JLabel txt_ThongBao;
    // End of variables declaration//GEN-END:variables
}
