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
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tunguyen
 */
public class TacGiaJPanel extends javax.swing.JPanel {

    connect_sql a=new connect_sql();
    Connection con=a.getConnectionTo();
    static  public int flag;
    int check_tb=0;
    static  public String matg;
    static  public String tentg;
    static  public String diachi;
    DefaultTableModel mode;
    public TacGiaJPanel() {
        initComponents();
        show_DuLieu_TacGia();
        
    }

    public void show_DuLieu_TacGia(){
        check_tb=0;
        try {
            table_TacGia.removeAll();
            String []arr={"Mã Tác Giả","Tên Tác Giả", "Địa Chỉ"};
            mode=new  DefaultTableModel(arr,0);
            String sql ="select * from TacGia "; 
            PreparedStatement ps=con.prepareCall(sql);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaTG"));
                vt.add(rs.getString("TenTG"));
                vt.add(rs.getString("DiaChiTG"));
               
                mode.addRow(vt);
            }
            table_TacGia.setModel(mode);
        } catch (SQLException ex) {
            //Logger.getLogger(Dang_ki_ID.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi tại connection sql");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_TacGia = new javax.swing.JTable();
        btn_ThemTacGia = new javax.swing.JButton();
        btn_XoaTacGia = new javax.swing.JButton();
        btn_SuaTacGia = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH TÁC GIẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_TacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tác giả", "Tên tác giả", "Địa chỉ"
            }
        ));
        table_TacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_TacGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_TacGia);

        btn_ThemTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/add-icon.png"))); // NOI18N
        btn_ThemTacGia.setText("THÊM");
        btn_ThemTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemTacGiaActionPerformed(evt);
            }
        });

        btn_XoaTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/delete-icon.png"))); // NOI18N
        btn_XoaTacGia.setText("XÓA");
        btn_XoaTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTacGiaActionPerformed(evt);
            }
        });

        btn_SuaTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/edit-icon.png"))); // NOI18N
        btn_SuaTacGia.setText("SỬA");
        btn_SuaTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaTacGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThemTacGia)
                .addGap(18, 18, 18)
                .addComponent(btn_SuaTacGia)
                .addGap(18, 18, 18)
                .addComponent(btn_XoaTacGia)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThemTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemTacGiaActionPerformed
        // thêm Tác giả:
        flag=0;
        new TacGiaJFrame().setVisible(true);
    }//GEN-LAST:event_btn_ThemTacGiaActionPerformed

    private void btn_SuaTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaTacGiaActionPerformed
        // Sửa tác giả
        if(check_tb==0) JOptionPane.showMessageDialog(this, "Bạn chưa chọn tác giả để sửa.");
        else
        {
            flag=1;
            new TacGiaJFrame().setVisible(true);
        }
        
    }//GEN-LAST:event_btn_SuaTacGiaActionPerformed

    private void table_TacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_TacGiaMouseClicked
        // à à à. chả biết mình làm j nữa
        check_tb=1;
        try {
            int index=table_TacGia.getSelectedRow();
            matg=((String)(mode.getValueAt(index,0)));
            tentg=((String)(mode.getValueAt(index,1)));
            diachi=((String)(mode.getValueAt(index,2)));
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_table_TacGiaMouseClicked

    private void btn_XoaTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTacGiaActionPerformed
        // xóa sách
        if(check_tb==0) JOptionPane.showMessageDialog(this, "Bạn chưa chọn tác giả để xóa.");
        else
        {
        try {
            String SQL="Delete from TacGia where MaTG=?";
            PreparedStatement statement = con.prepareStatement(SQL);
                    statement.setString(1,matg );
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        JOptionPane.showMessageDialog(this, "Xóa thành công!!!");
                        show_DuLieu_TacGia();
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Còn có sách của tác này trong kho.");
        }
    }
        
    }//GEN-LAST:event_btn_XoaTacGiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SuaTacGia;
    private javax.swing.JButton btn_ThemTacGia;
    private javax.swing.JButton btn_XoaTacGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_TacGia;
    // End of variables declaration//GEN-END:variables
}
