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
 * @author tunguyen
 */
public class SachJPanel extends javax.swing.JPanel {
        connect_sql a=new connect_sql();
        Connection con =a.getConnectionTo();
        DefaultTableModel mode_Sach;
        
        static public String  masach="!!!";
        static public String  tensach="!!!";
        static public String  tentg="!!!";
        static public String  tentl="!!!";
        static public String  tennxb="!!!";
        static public String  namxb="!!!";
        static public String  ngonngu="!!!";
        static public String  sl="!!!";
        static public String  Gia="!!!";
        
        int check_table=0;
    static  public  int sua_them;
    public SachJPanel() {
        initComponents();
        show_dl_sach();
        
    }
public   void show_dl_sach()
    {
        check_table=0;
        try {
            table_sach.removeAll();
            String []arr={"Mã Sách","Tên Sách", "Mã Tác Giả","Mã Thể Loại" ,"Mã Nhà Xuất Bản","Năm Xuất Bản","Ngôn Ngữ","Giá","Số Lượng"};
             mode_Sach=new  DefaultTableModel(arr,0);
            String sql ="select * from Sach"; 
            PreparedStatement ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaSach"));
                vt.add(rs.getString("Tensach"));
                vt.add(rs.getString("MaTG"));
                vt.add(rs.getString("MaTheLoai"));
                vt.add(rs.getString("MaNXB"));
                vt.add(rs.getString("NamXB"));
                vt.add(rs.getString("NgonNgu"));
                vt.add(rs.getString("Gia"));
                vt.add(rs.getString("SoLuongSach"));
                mode_Sach.addRow(vt);
            }
            table_sach.setModel(mode_Sach);
        } catch (SQLException ex) {
            
            System.out.println("Lỗi tại connection sql");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_sach = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_suaSach = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        Reload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/list-icon.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        table_sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_sach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_sachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_sach);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/add-icon.png"))); // NOI18N
        jButton1.setText("THÊM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_suaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/edit-icon.png"))); // NOI18N
        btn_suaSach.setText("SỬA");
        btn_suaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaSachActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/delete-icon.png"))); // NOI18N
        btn_Xoa.setText("XÓA");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        Reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/reload.png"))); // NOI18N
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
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(btn_suaSach)
                .addGap(28, 28, 28)
                .addComponent(btn_Xoa)
                .addGap(25, 25, 25)
                .addComponent(Reload)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_suaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hiện thị  bảng thêm
        
        sua_them=0;
        
        new SachJFrame().setVisible(true);
        show_dl_sach();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
            
                
        
            // check xem có ai đang mượn hay không. nếu muon=1 tức là có
            
            if(check_table==0)
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sách để xóa");
            else if(check_table==1)
            {
                int muon=0;
                try {
                    Statement sta=con.createStatement();
                        String sql_select="select * from MuonTraSach where MaSach=? and TinhTrang=? " ;
                        PreparedStatement pre=con.prepareStatement(sql_select);
                        pre.setString(1, masach);
                        pre.setString(2, "Chưa");
                        
                        ResultSet rs=pre.executeQuery();
                        if(rs.next())
                        {
                            muon=1;
                            System.out.println(muon);
                        }
            
                } catch (SQLException ex) {
                    Logger.getLogger(QLMuonTraJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("sai");
                }
            if(muon==1)
            {
                JOptionPane.showMessageDialog(this, "Hiện đang có người mượn sách này , không thể xóa!!!");
            }
            else if(muon==0)
            {
                try {
                    // TODO add your handling code here:
                    String sql = "DELETE FROM Sach WHERE MaSach=?";
                    
                    PreparedStatement statement = con.prepareStatement(sql);
                    statement.setString(1,masach );
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        JOptionPane.showMessageDialog(this, "Xóa thành công!!!");
                        xoa_top();
                        show_dl_sach();
                        
                    }
                } catch (SQLException ex) {
                    //Logger.getLogger(Dang_ki_ID.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Lỗi không thể xóa!!!");
                }
            }
            }
            
                
    }//GEN-LAST:event_btn_XoaActionPerformed
 private void xoa_top()
 {
     try {
         String sql="delete from ThongKeTop where MaSach=?";
         PreparedStatement statement = con.prepareStatement(sql);
                    statement.setString(1,masach );
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        System.out.println("Xóa ở bảng thông kê thành công.");
                    }
     } catch (Exception e) {
         System.out.println("lỗi xóa top");
     }
 }
    private void table_sachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_sachMouseClicked
        // lấy mã sách thôi.
        check_table=1;
        try {
            int index=table_sach.getSelectedRow();
            masach=((String)(mode_Sach.getValueAt(index,0)));
            tensach=((String)(mode_Sach.getValueAt(index,1)));
            tentg=((String)(mode_Sach.getValueAt(index,2)));
            tentl=((String)(mode_Sach.getValueAt(index,3)));
            tennxb=((String)(mode_Sach.getValueAt(index,4)));
            namxb=((String)(mode_Sach.getValueAt(index,5)));
            ngonngu=((String)(mode_Sach.getValueAt(index,6)));
            Gia=((String)(mode_Sach.getValueAt(index,7)));
            sl=((String)(mode_Sach.getValueAt(index,8)));
            
        } catch (Exception ex) {
            Logger.getLogger(QLMuonTraJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
    }//GEN-LAST:event_table_sachMouseClicked

    private void btn_suaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaSachActionPerformed
        // sủa sách
        if(check_table==0)
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sách để sửa thông tin sách");
            else if(check_table==1)
            {
                sua_them=1;
                new SachJFrame().setVisible(true);
            }
        show_dl_sach();
    }//GEN-LAST:event_btn_suaSachActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        show_dl_sach();
    }//GEN-LAST:event_ReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_suaSach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_sach;
    // End of variables declaration//GEN-END:variables
}
