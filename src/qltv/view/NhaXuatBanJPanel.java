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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isokids
 */
public class NhaXuatBanJPanel extends javax.swing.JPanel {
    connect_sql a=new connect_sql();
    Connection con=a.getConnectionTo();
    DefaultTableModel mode_NXB;
    int check;
    String maNXB="";
    String TenNXB="";
    String DC="";
    int flag;
    public NhaXuatBanJPanel() {
        initComponents();
        show_NXB();
        check=0;
        flag=0;
        this.pn_Sua.setVisible(false);
        this.pn_Them.setVisible(false);
        

        
        
    }

    private void show_NXB()
    {
        try {
            table_NXB.removeAll();
            String []arr={"Mã NXB","Tên NXB", "Địa Chỉ"};
             mode_NXB=new  DefaultTableModel(arr,0);
            String sql ="select * from NXB"; 
            PreparedStatement ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaNXB"));
                vt.add(rs.getString("TenNXB"));
                vt.add(rs.getString("DiaCHi"));
                
                mode_NXB.addRow(vt);
            }
            table_NXB.setModel(mode_NXB);
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_NXB = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pn_Them = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_manxb_Them = new javax.swing.JTextField();
        txt_tenThem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DCThem = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        reset_them = new javax.swing.JButton();
        pn_Sua = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_maSua = new javax.swing.JTextField();
        txt_tenSua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_dcSua = new javax.swing.JTextField();
        btn_sua = new javax.swing.JButton();
        reset_sua = new javax.swing.JButton();
        Reload = new javax.swing.JButton();

        table_NXB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_NXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_NXBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_NXB);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/list-icon.png"))); // NOI18N
        jLabel1.setText("NHÀ XUẤT BẢN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(943, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        btn_Them.setText("Thêm ");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã NXB");

        jLabel3.setText("Tên NXB");

        txt_manxb_Them.setEditable(false);

        jLabel4.setText("Đia Chỉ");

        btn_them.setText("Xác Nhận");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        reset_them.setText("Reset");
        reset_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_ThemLayout = new javax.swing.GroupLayout(pn_Them);
        pn_Them.setLayout(pn_ThemLayout);
        pn_ThemLayout.setHorizontalGroup(
            pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ThemLayout.createSequentialGroup()
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ThemLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_manxb_Them, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txt_tenThem)
                            .addComponent(txt_DCThem)))
                    .addGroup(pn_ThemLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_them)
                        .addGap(46, 46, 46)
                        .addComponent(reset_them)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pn_ThemLayout.setVerticalGroup(
            pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ThemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_manxb_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_DCThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(reset_them))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel8.setText("Mã NXB");

        jLabel9.setText("Tên NXB");

        txt_maSua.setEditable(false);

        jLabel10.setText("Đia Chỉ");

        btn_sua.setText("Xác Nhận");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        reset_sua.setText("Reset");
        reset_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_SuaLayout = new javax.swing.GroupLayout(pn_Sua);
        pn_Sua.setLayout(pn_SuaLayout);
        pn_SuaLayout.setHorizontalGroup(
            pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_SuaLayout.createSequentialGroup()
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_SuaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_maSua, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txt_tenSua)
                            .addComponent(txt_dcSua)))
                    .addGroup(pn_SuaLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_sua)
                        .addGap(46, 46, 46)
                        .addComponent(reset_sua)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pn_SuaLayout.setVerticalGroup(
            pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_SuaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_maSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tenSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_dcSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua)
                    .addComponent(reset_sua))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Reload.setText("Reload");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Them)
                        .addGap(60, 60, 60)
                        .addComponent(btn_Sua)
                        .addGap(56, 56, 56)
                        .addComponent(btn_xoa)
                        .addGap(44, 44, 44)
                        .addComponent(Reload)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(451, 451, 451))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua)
                    .addComponent(btn_xoa)
                    .addComponent(Reload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        this.pn_Sua.setVisible(false);
        this.pn_Them.setVisible(true);
        getNXB();
                
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        if(check==1){
            this.pn_Sua.setVisible(true);
            this.pn_Them.setVisible(false);
            txt_maSua.setText(maNXB);
            txt_tenSua.setText(TenNXB);
            txt_dcSua.setText(DC);
        }
        else if(check==0)
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn NXB để sửa .");
        
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void table_NXBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_NXBMouseClicked
        //lấy mã nxb.
        
        try {
            check=1;
            // lấy mã phiếu
            int index=table_NXB.getSelectedRow();
            maNXB=((String)(mode_NXB.getValueAt(index,0)));
            TenNXB=((String)(mode_NXB.getValueAt(index,1)));
            DC=((String)(mode_NXB.getValueAt(index,2)));
        }
        catch( Exception e)
        {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_table_NXBMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // Xóa nxb.
        if(check==0)
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn NXB để sửa .");
        else if(check==1){
            xoa_nxb();
              
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // them
        if(txt_tenThem.getText().length()>0 &&txt_DCThem.getText().length()>0)
        {
            try {
            String sql_ThongKe ="insert into NXB(MaNXB, TenNXB,DiaChi) VALUES(?,?,?)";
            PreparedStatement statement =con.prepareStatement(sql_ThongKe);
            statement.setString(1, txt_manxb_Them.getText());
            statement.setString(2, txt_tenThem.getText());
            statement.setString(3,txt_DCThem.getText());
            int insert=statement.executeUpdate();
            if(insert>0)
            {
                System.out.println("Thêm  thành công .");
                JOptionPane.showMessageDialog(this, "Bạn đã thêm nxb thành công.");
                this.pn_Them.setVisible(false);
                show_NXB();
            }
        } catch (Exception e) {
            System.out.println("sai ");
        }
        }
        else JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin.");
        
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // Sua nxb.
        if(txt_dcSua.getText().length()>0 &&txt_tenSua.getText().length()>0)
        {
            try {
            String sql="update NXB set TenNXB= ? ,DiaChi= ? where MaNXB= ?";
            PreparedStatement statement =con.prepareStatement(sql);
            statement.setString(1, txt_tenSua.getText());
            statement.setString(2, txt_dcSua.getText());
            statement.setString(3, txt_maSua.getText());
            int m=statement.executeUpdate();
            if(m>0)
            {
                JOptionPane.showMessageDialog(this, "Đã sửa nxb thành công.");
                show_NXB();
                this.pn_Sua.setVisible(false);
            }
            
    } catch (Exception e) {
                System.out.println("dd");
        }
        
        }
        else JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin.");
    }//GEN-LAST:event_btn_suaActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // load lại trang.
        show_NXB();
        this.pn_Sua.setVisible(false);
        this.pn_Them.setVisible(false);
    }//GEN-LAST:event_ReloadActionPerformed

    private void reset_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_themActionPerformed
        this.txt_DCThem.setText("");
        this.txt_tenThem.setText("");
    }//GEN-LAST:event_reset_themActionPerformed

    private void reset_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_suaActionPerformed
         this.txt_dcSua.setText("");
        this.txt_tenSua.setText("");
    }//GEN-LAST:event_reset_suaActionPerformed
    private void xoa_nxb()
    {
        try {
            String SQL="Delete from NXB where MaNXB=?";
            PreparedStatement statement = con.prepareStatement(SQL);
                    statement.setString(1,maNXB );
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        JOptionPane.showMessageDialog(this, "Xóa thành công!!!");
                        show_NXB();
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Còn có sách của nxb này trong kho.");
        }
    }
    private void check_muon()
    {
        try {
            String sql="select * from Sach where MaNXB=?";
            PreparedStatement pre=con.prepareStatement(sql);
             pre.setString(1, maNXB);
             int check_co=pre.executeUpdate();
             if(check_co>0)
             {
                 flag=1;
             }
        } catch (Exception e) {
        }
        
    }
private  void getNXB()
    {
                
            try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaNXB) as manxb from NXB");
            while(rss.next())
            {
                int id=(Integer.parseInt(rss.getString("manxb")) +1);
                txt_manxb_Them.setText(String.valueOf(id));
                System.out.println(id);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_Sua;
    private javax.swing.JPanel pn_Them;
    private javax.swing.JButton reset_sua;
    private javax.swing.JButton reset_them;
    private javax.swing.JTable table_NXB;
    private javax.swing.JTextField txt_DCThem;
    private javax.swing.JTextField txt_dcSua;
    private javax.swing.JTextField txt_maSua;
    private javax.swing.JTextField txt_manxb_Them;
    private javax.swing.JTextField txt_tenSua;
    private javax.swing.JTextField txt_tenThem;
    // End of variables declaration//GEN-END:variables
}
