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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tunguyen
 */
public class SachJFrame extends javax.swing.JFrame {

    connect_sql a=new connect_sql();
    Connection con =a.getConnectionTo();
        int flag_TG=0;
        int flag_TL=0;
        int flag_NXB=0;
        int flag=0;
        String MaTG=null;
        String MaTL=null;
        String MaNXB=null;
    public SachJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        getTenTacGia_cb();
        getTenNXB_cb();
        getTenTheLoai_cb();
        
        if(SachJPanel.sua_them==0) 
        {
            txt_note.setText("Thêm Sách");
            getMaSach();
        }
        else   
        {
            txt_note.setText("Sửa Thông Tin Sách");
            jtMaSach.setText(SachJPanel.masach);
            jtTenSach.setText(SachJPanel.tensach);
            jtNamXB.setText(SachJPanel.namxb);
            jtSoLuong.setText(SachJPanel.sl);
            txt_ngonngu.setText(SachJPanel.ngonngu);
            txt_Gia.setText(SachJPanel.Gia);
            
            
            get_cb();
            
        }
    }

    private void get_cb()
    {
        // thể loại
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from TheLoai where MaTheLoai="+SachJPanel.tentl);

            while (r.next()) {  
                cb_TheLoai.setSelectedItem(r.getString("TenTheLoai" ));
            
        } 
        } catch (Exception e) {
        }
        // Tác giả
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from TacGia where MaTG="+SachJPanel.tentg);

            while (r.next()) {  
                cb_TacGia.setSelectedItem(r.getString("TenTG" ));
            
        } 
        } catch (Exception e) {
        }
        
        // nhà xuất bản.
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from NXB where MaNXB="+SachJPanel.tennxb);

            while (r.next()) {  
                cb_NXB.setSelectedItem(r.getString("TenNXB" ));
            
        } 
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtMaSach = new javax.swing.JTextField();
        jtTenSach = new javax.swing.JTextField();
        jtNamXB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtSoLuong = new javax.swing.JTextField();
        cb_TacGia = new javax.swing.JComboBox<>();
        cb_TheLoai = new javax.swing.JComboBox<>();
        cb_NXB = new javax.swing.JComboBox<>();
        txt_note = new javax.swing.JLabel();
        txt_ngonngu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Gia = new javax.swing.JTextField();
        btn_XacNhan = new javax.swing.JButton();
        btn_HuyBo = new javax.swing.JButton();
        txt_ThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setText("Mã sách");

        jLabel2.setText("Tên sách");

        jLabel3.setText("Tên tác giả");

        jLabel4.setText("Tên NXB");

        jLabel5.setText("Năm XB");

        jLabel6.setText("Số lượng");

        jtMaSach.setEditable(false);

        jLabel7.setText("Tên Thể Loại");

        jLabel8.setText("Ngôn Ngữ");

        cb_TacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TacGiaActionPerformed(evt);
            }
        });

        cb_TheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TheLoaiActionPerformed(evt);
            }
        });

        cb_NXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NXBActionPerformed(evt);
            }
        });

        txt_note.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_note.setForeground(new java.awt.Color(255, 0, 0));
        txt_note.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setText("Giá Sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(txt_note, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(91, 91, 91))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(83, 83, 83)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(103, 103, 103)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Gia)
                            .addComponent(jtMaSach)
                            .addComponent(jtTenSach)
                            .addComponent(jtNamXB)
                            .addComponent(jtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(cb_TacGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_TheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_NXB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_ngonngu))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_note, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_TheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txt_ngonngu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_XacNhan.setText("Xác nhận");
        btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanActionPerformed(evt);
            }
        });

        btn_HuyBo.setText("Hủy bỏ");
        btn_HuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyBoActionPerformed(evt);
            }
        });

        txt_ThongBao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_ThongBao.setForeground(new java.awt.Color(255, 0, 0));
        txt_ThongBao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btn_XacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_HuyBo)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_ThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_XacNhan)
                    .addComponent(btn_HuyBo))
                .addGap(18, 18, 18)
                .addComponent(txt_ThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyBoActionPerformed
        // hủy bỏ
        this.dispose();
    }//GEN-LAST:event_btn_HuyBoActionPerformed
    private void getTenTacGia_cb()
    {
 
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from TacGia");

            while (r.next()) {  

            cb_TacGia.addItem(r.getString("TenTG" ));  
        } 
        } catch (Exception e) {
            System.out.println("sai select");
        }
    }
    private void getTenTheLoai_cb()
    {
 
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from TheLoai");

            while (r.next()) {  

            cb_TheLoai.addItem(r.getString("TenTheLoai" ));  
        } 
        } catch (Exception e) {
        }
    }
    private void getTenNXB_cb()
    {
 
        try {
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery("select * from NXB");

            while (r.next()) {  

            cb_NXB.addItem(r.getString("TenNXB" ));  
        } 
        } catch (Exception e) {
        }
    }
   
    private void btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanActionPerformed
        // Thêm Sách.
        
        flag_TG=0;
        flag_TL=0;
        flag_NXB=0;
        flag=0;
        this.txt_ThongBao.setText("  ");
        int namxb=0;
        int matg=0;
        int matl=0;
        int maxnb=0;
        int sl=0;
        int gia=0;
        
        
        // lấy năm hiện tại
        Calendar calendar = Calendar.getInstance(); 
        int namht= calendar.get(Calendar.YEAR);
         
        check_null();
        if(flag==0)
        {
            // kiểm tra năm xuất bản có phải số.
         if(jtNamXB.getText().trim().equals("")!=true)
         {
             try {
            namxb=Integer.parseInt(jtNamXB.getText().trim());
            
            // xem năm xb hợp lệ k
             if(namxb>namht)
                {
                    txt_ThongBao.setText("Năm xuất bản lớn hơn năm hiện tại ???"); 
                    flag=1;
                } 
        } catch (Exception e) {
            txt_ThongBao.setText("Năm xuất bản không hợp lệ!!!"); 
            flag=1;
        }
         }}
         // kiểm tra số lượng có phải là số
        if(flag==0)
        {
         if(jtSoLuong.getText().trim().equals("")!=true)
        {
            
             try {
            sl=Integer.parseInt(jtSoLuong.getText().trim());
             if(Integer.parseInt(jtSoLuong.getText().trim())<0 )
            {
                 txt_ThongBao.setText("Số lượng phải lớn hơn hoặc bằng 0!!!");  
                 flag=1;
        } 
            
                } catch (Exception e) {
                txt_ThongBao.setText("Số lượng phải là số nguyên !!!");
                flag=1;
                        }
        
        //kiểm tra xem giá có phải là số
             if(txt_Gia.getText().trim().equals("")!=true)
        {
            
             try {
            gia=Integer.parseInt(txt_Gia.getText().trim());
             if(Integer.parseInt(txt_Gia.getText().trim())<0 )
            {
                 txt_ThongBao.setText("Giá Sách phải lớn hơn  0!!!");  
                 flag=1;
        } 
            
                } catch (Exception e) {
                txt_ThongBao.setText("Giá Sách phải là số nguyên !!!");
                flag=1;
                        }
        }
         }
            
        }
        
        if(flag==0)
        {
            System.out.println("flag: "+ flag);
                if(SachJPanel.sua_them==0)
            {
             ThemSach();
            }   
                else if(SachJPanel.sua_them==1){
                // sửa sách.
                    sua();
            
        }
    }
        
        
        
    }//GEN-LAST:event_btn_XacNhanActionPerformed
private void sua()
{
    try {
        String sql="update Sach set Tensach=?, MaTG=?, MaTheLoai=?,MaNXB=?,NamXB=?,NgonNgu=?,Gia= ?, SoLuongSach=? where MaSach=?";
            PreparedStatement statement = con.prepareStatement(sql);
            
            statement.setString(1, jtTenSach.getText());
            statement.setString(2,MaTG);
            statement.setString(3, MaTL);
            statement.setString(4,MaNXB);
            statement.setString(5, jtNamXB.getText());
            statement.setString(6, txt_ngonngu.getText());
            statement.setString(7, txt_Gia.getText());
            statement.setString(8, jtSoLuong.getText());
            statement.setString(9, jtMaSach.getText());
            int update=statement.executeUpdate();
            if(update>0)
            {
                sua_top();
                JOptionPane.showMessageDialog(this, "Bạn đã sửa sách thành công.");
                this.dispose();
            }
                
    } catch (Exception e) {
        System.out.println(" sai sửa sách");
    }
}
    private void sua_top()
    {
        try {
        String sql="update ThongKeTop set Tensach=? where MaSach=?";
            PreparedStatement statement = con.prepareStatement(sql);
            
            statement.setString(1, jtTenSach.getText());
            statement.setString(2, jtMaSach.getText());
            
            int update=statement.executeUpdate();
            if(update>0)
            {
                System.out.println("Sủa top thành công");
            }
    } catch (Exception e) {
        System.out.println(" sai sửa top");
    }
    }
    private void cb_TacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TacGiaActionPerformed
        // lấy mã tác giả.
        try {
            String sql="select * from TacGia where TenTG=N'"+cb_TacGia.getSelectedItem().toString()+"'";
            Statement st = con.createStatement();

                 ResultSet r=st.executeQuery(sql);

            while (r.next()) { 

                 
                MaTG=r.getString("MaTG");
                
            }
            
        } catch (Exception e) {
            System.out.println("sai r");
        }
    }//GEN-LAST:event_cb_TacGiaActionPerformed

    private void cb_TheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TheLoaiActionPerformed
        // get Mã tl
        try {
            String sql="select * from TheLoai where TenTheLoai=N'"+cb_TheLoai.getSelectedItem().toString()+"'";
            Statement st = con.createStatement();
                 ResultSet r=st.executeQuery(sql);
            while (r.next()) {  
                MaTL=r.getString("MaTheLoai");
            }           
        } catch (Exception e) {
            System.out.println("sai r");
        }
    }//GEN-LAST:event_cb_TheLoaiActionPerformed

    private void cb_NXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NXBActionPerformed
        // get Mã nxb
        try {
            String sql="select * from NXB where TenNXB=N'"+cb_NXB.getSelectedItem().toString()+"'";
            Statement st = con.createStatement();
                 ResultSet r=st.executeQuery(sql);
            while (r.next()) {                 
                MaNXB=r.getString("MaNXB");                
            }           
        } catch (Exception e) {
            System.out.println("sai r");
        }
    }//GEN-LAST:event_cb_NXBActionPerformed
    private void check_null()
    {
        flag=0;
        // kiểm tra xem còn ô nào trống.
        if(jtTenSach.getText().equals(""))
        {
            txt_ThongBao.setText("Bạn chưa nhập tên sách!!");
            flag=1;
        }
        else if(jtNamXB.getText().equalsIgnoreCase(""))
        {
            flag=1;
            txt_ThongBao.setText("Bạn chưa nhập năm NXB!!"); 
        } 
        
        else if(jtSoLuong.getText().equalsIgnoreCase(""))
        {
            flag=1;
            txt_ThongBao.setText("Bạn chưa nhập số lượng sách!!");
        }
        else if(txt_ngonngu.getText().equalsIgnoreCase(""))
        {
            flag=1;
            txt_ThongBao.setText("Bạn chưa nhập  ngôn ngữ sách!!");
        }
        else if(txt_Gia.getText().equalsIgnoreCase(""))
        {
            flag=1;
            txt_ThongBao.setText("Bạn chưa nhập giá sách!!");
        }
    }
    private void ThemSach()
     {  this.txt_ThongBao.setText("  ");
         
        // thêm bảng thống kê
             insert_ThongKeTop();
             // thêm sách vào bảng sách
             
              if(flag_TG==0 && flag_NXB==0 && flag_TL==0)
             {
                 
         try {
            String sql_sach = "INSERT INTO Sach (MaSach, Tensach, MaTG, MaTheLoai,MaNXB,NamXB,NgonNgu,Gia,SoLuongSach) VALUES (?,?,?, ?, ?, ?,?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql_sach);
            statement.setString(1, jtMaSach.getText());
            statement.setString(2, jtTenSach.getText());
            statement.setString(3,MaTG);
            statement.setString(4, MaTL);
            statement.setString(5,MaNXB);
            statement.setString(6, jtNamXB.getText());
            statement.setString(7, txt_ngonngu.getText());
            statement.setString(8, txt_Gia.getText());
            statement.setString(9, jtSoLuong.getText());
            insert_ThongKeTop();
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm sách thành công!!!");
                //thêm vào bảng thống kê top
                
                this.dispose();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(rootPane, "Thêm sách không thành công!!!!");
        }
        }       
    }
    private void insert_ThongKeTop()
    {
        try {
            String sql_ThongKe ="insert into ThongKeTop(MaSach, TenSach,LuotMuon) VALUES(?,?,?)";
            PreparedStatement statement =con.prepareStatement(sql_ThongKe);
            statement.setString(1, jtMaSach.getText());
            statement.setString(2, jtTenSach.getText());
            statement.setString(3,"0");
            int insert=statement.executeUpdate();
            if(insert>0)
            {
                System.out.println("Thêm vào bảng thống kê thành công .");
            }
        } catch (Exception e) {
            System.out.println("sai top thống kê.");
        }
    }
     private  void getMaSach()
    {
                
            try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaSach) as masach from Sach");
            while(rss.next())
            {
                int id=(Integer.parseInt(rss.getString("masach")) +1);
                jtMaSach.setText(String.valueOf(id));
                System.out.println(id);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(SachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SachJFrame().setVisible(true);
            }
        });
    }
private void update_TopThongKe()
{
    try {
        String sql="update ThongKeTop set TenSach=? where MaSach=?";
        PreparedStatement statement =con.prepareStatement(sql);
        statement.setString(1, jtTenSach.getText());
        statement.setString(2, jtMaSach.getText());
        int m=statement.executeUpdate();
        if(m>0)
            System.out.println("đã sửa tên sách ở bảng thống kê thành công.");
    } catch (Exception e) {
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HuyBo;
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JComboBox<String> cb_NXB;
    private javax.swing.JComboBox<String> cb_TacGia;
    private javax.swing.JComboBox<String> cb_TheLoai;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jtMaSach;
    private javax.swing.JTextField jtNamXB;
    private javax.swing.JTextField jtSoLuong;
    private javax.swing.JTextField jtTenSach;
    private javax.swing.JTextField txt_Gia;
    private javax.swing.JLabel txt_ThongBao;
    private javax.swing.JTextField txt_ngonngu;
    private javax.swing.JLabel txt_note;
    // End of variables declaration//GEN-END:variables
}
