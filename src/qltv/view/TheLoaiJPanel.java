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
public class TheLoaiJPanel extends javax.swing.JPanel {

    connect_sql a=new connect_sql();
    Connection con=a.getConnectionTo();
    static  public int check_tb;
    DefaultTableModel mode_TL;
    String matl;
    public TheLoaiJPanel() {
        initComponents();
        this.pn_Sua.setVisible(false);
        this.pn_Them.setVisible(false);
        check_tb=0;
        show_TheLoai();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Theloai = new javax.swing.JTable();
        pn_all = new javax.swing.JPanel();
        pn_Them = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_matl_Them = new javax.swing.JTextField();
        txt_tenThem = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_reset1 = new javax.swing.JButton();
        pn_Sua = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_maSua = new javax.swing.JTextField();
        txt_tenSua = new javax.swing.JTextField();
        btn_sua = new javax.swing.JButton();
        btn_reset2 = new javax.swing.JButton();
        btn_themTL = new javax.swing.JButton();
        btn_SuaTL = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        table_Theloai.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Theloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_TheloaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Theloai);

        jLabel2.setText("Mã Thể Loại");

        jLabel3.setText("Tên Thể Loại");

        txt_matl_Them.setEditable(false);

        btn_them.setText("Xác Nhận");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_reset1.setText("Reset");
        btn_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_ThemLayout = new javax.swing.GroupLayout(pn_Them);
        pn_Them.setLayout(pn_ThemLayout);
        pn_ThemLayout.setHorizontalGroup(
            pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ThemLayout.createSequentialGroup()
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ThemLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_matl_Them, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txt_tenThem)))
                    .addGroup(pn_ThemLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_them)
                        .addGap(46, 46, 46)
                        .addComponent(btn_reset1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_ThemLayout.setVerticalGroup(
            pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ThemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_matl_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(pn_ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_reset1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel8.setText("Mã Thể Loại");

        jLabel9.setText("Tên Thể Loại");

        txt_maSua.setEditable(false);

        btn_sua.setText("Xác Nhận");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_reset2.setText("Reset");
        btn_reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_SuaLayout = new javax.swing.GroupLayout(pn_Sua);
        pn_Sua.setLayout(pn_SuaLayout);
        pn_SuaLayout.setHorizontalGroup(
            pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_SuaLayout.createSequentialGroup()
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_SuaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(56, 56, 56)
                        .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_maSua, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txt_tenSua)))
                    .addGroup(pn_SuaLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_sua)
                        .addGap(46, 46, 46)
                        .addComponent(btn_reset2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_SuaLayout.setVerticalGroup(
            pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_SuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_maSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tenSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(pn_SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua)
                    .addComponent(btn_reset2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_allLayout = new javax.swing.GroupLayout(pn_all);
        pn_all.setLayout(pn_allLayout);
        pn_allLayout.setHorizontalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_allLayout.setVerticalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addComponent(pn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_themTL.setText("Thêm ");
        btn_themTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themTLActionPerformed(evt);
            }
        });

        btn_SuaTL.setText("Sửa");
        btn_SuaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaTLActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_reload.setText("Reload");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/list-icon.png"))); // NOI18N
        jLabel1.setText("Thể Loại Sách");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn_all, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_themTL)
                                .addGap(60, 60, 60)
                                .addComponent(btn_SuaTL)))
                        .addGap(59, 59, 59)
                        .addComponent(btn_xoa)
                        .addGap(72, 72, 72)
                        .addComponent(btn_reload)
                        .addGap(28, 28, 28))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themTL)
                    .addComponent(btn_SuaTL)
                    .addComponent(btn_xoa)
                    .addComponent(btn_reload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_all, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // them
        if(txt_tenThem.getText().length()>0 && txt_matl_Them.getText().length()>0)
        {
            try {
                String sql_ThongKe ="insert into TheLoai(MaTheLoai,TenTheLoai) VALUES(?,?)";
                PreparedStatement statement =con.prepareStatement(sql_ThongKe);
                statement.setString(1, txt_matl_Them.getText());
                statement.setString(2, txt_tenThem.getText());
                
                int insert=statement.executeUpdate();
                if(insert>0)
                {
                    
                    JOptionPane.showMessageDialog(this, "Bạn đã thêm thể loại thành công.");
                    this.txt_matl_Them.setText("");
                    this.pn_Them.setVisible(false);
                    
                    show_TheLoai();
                }
            } catch (Exception e) {
                System.out.println("sai ");
            }
        }
        else JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin.");

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // Sua nxb.
        if(txt_maSua.getText().length()>0 &&txt_tenSua.getText().length()>0)
        {
            try {
                String sql="update TheLoai set TenTheLoai= ?  where MaTheLoai= ?";
                PreparedStatement statement =con.prepareStatement(sql);
                statement.setString(1, txt_tenSua.getText());
                
                statement.setString(2, txt_maSua.getText());
                int m=statement.executeUpdate();
                if(m>0)
                {
                    JOptionPane.showMessageDialog(this, "Đã sửa thể loại thành công.");
                    show_TheLoai();
                    this.pn_Sua.setVisible(false);
                }

            } catch (Exception e) {
                System.out.println("dd");
            }

        }
        else JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin.");
    }//GEN-LAST:event_btn_suaActionPerformed
    
    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        // reload
        this.pn_Sua.setVisible(false);
        this.pn_Them.setVisible(false);
        show_TheLoai();
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_themTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themTLActionPerformed
        // show thêm
        
        this.pn_Them.setVisible(true);
        this.pn_Sua.setVisible(false);
        getMaTheLoai();
        
    }//GEN-LAST:event_btn_themTLActionPerformed

    private void btn_SuaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaTLActionPerformed
        // show sửa
        if(check_tb==0)     JOptionPane.showMessageDialog(this, "Bạn chưa chọn thể loại để sửa.");
        else if (check_tb==1){
            this.pn_Sua.setVisible(true);
            this.pn_Them.setVisible(false);
        }
        
    }//GEN-LAST:event_btn_SuaTLActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // xóa
        if(check_tb==0)     JOptionPane.showMessageDialog(this, "Bạn chưa chọn thể loại để xóa.");
        else if (check_tb==1)
                {
                    this.pn_Sua.setVisible(false);
                    this.pn_Them.setVisible(false);
                    xoa_TheLoai();
                }
        
    }//GEN-LAST:event_btn_xoaActionPerformed
     private void xoa_TheLoai()
    {
        try {
            String SQL="Delete from TheLoai where MaTheLoai=?";
            PreparedStatement statement = con.prepareStatement(SQL);
                    statement.setString(1, matl);
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        JOptionPane.showMessageDialog(this, "Xóa thành công!!!");
                        show_TheLoai();
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Còn có sách của thể loại này trong kho.");
        }
    } 
    private void table_TheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_TheloaiMouseClicked
        check_tb=1;
        int index=table_Theloai.getSelectedRow();
        txt_maSua.setText((String)(mode_TL.getValueAt(index,0)));
        matl=(String)(mode_TL.getValueAt(index,0));
        txt_tenSua.setText((String)(mode_TL.getValueAt(index,1)));
        
    }//GEN-LAST:event_table_TheloaiMouseClicked

    private void btn_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset1ActionPerformed
        // reset thêm.
        
        this.txt_tenThem.setText("");
    }//GEN-LAST:event_btn_reset1ActionPerformed

    private void btn_reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset2ActionPerformed
        // reset sửa
        
        this.txt_tenSua.setText("");
    }//GEN-LAST:event_btn_reset2ActionPerformed
private  void getMaTheLoai()
    {
                
            try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaTheLoai) as matl from TheLoai");
            while(rss.next())
            {
                int id=(Integer.parseInt(rss.getString("matl")) +1);
                txt_matl_Them.setText(String.valueOf(id));
                System.out.println(id);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void show_TheLoai()
    {
        check_tb=0;
        try {
            table_Theloai.removeAll();
            String []arr={"Mã Thể Loại","Tên Thể Loại"};
             mode_TL=new  DefaultTableModel(arr,0);
            String sql ="select * from TheLoai"; 
            PreparedStatement ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaTheLoai"));
                vt.add(rs.getString("TenTheLoai"));
                
                
                mode_TL.addRow(vt);
            }
            table_Theloai.setModel(mode_TL);
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SuaTL;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JButton btn_reset2;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_themTL;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_Sua;
    private javax.swing.JPanel pn_Them;
    private javax.swing.JPanel pn_all;
    private javax.swing.JTable table_Theloai;
    private javax.swing.JTextField txt_maSua;
    private javax.swing.JTextField txt_matl_Them;
    private javax.swing.JTextField txt_tenSua;
    private javax.swing.JTextField txt_tenThem;
    // End of variables declaration//GEN-END:variables
}
