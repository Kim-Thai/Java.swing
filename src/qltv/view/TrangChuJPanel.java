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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tunguyen
 */
public class TrangChuJPanel extends javax.swing.JPanel {

    connect_sql a=new connect_sql();
    Connection con =a.getConnectionTo();
    DefaultTableModel mode_top,mode_Sach;
    public TrangChuJPanel() {
        initComponents();
        show_dl_sach();
        show_top();
    }
private void show_top()
{
    try {
            table_top.removeAll();
            String []arr={"Mã Sách","Tên Sách", "Lượt Mượn"};
            mode_top=new  DefaultTableModel(arr,0);
            String sql ="select * from ThongKeTop where LuotMuon= (SELECT max(LuotMuon) as luotmuon FROM ThongKeTop)"; 
            PreparedStatement ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaSach"));
                vt.add(rs.getString("Tensach"));
                vt.add(rs.getString("LuotMuon"));
                
                mode_top.addRow(vt);
            }
            table_top.setModel(mode_top);
        } catch (SQLException ex) {
            
            System.out.println("Lỗi tại connection sql");
        }
}
    public   void show_dl_sach()
    {
        
        try {
            Sach.removeAll();
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
            Sach.setModel(mode_Sach);
        } catch (SQLException ex) {
            
            System.out.println("Lỗi tại connection sql");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sach = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_top = new javax.swing.JTable();
        btn_boTim = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setBackground(new java.awt.Color(255, 255, 255));

        jbtSearch.setBackground(new java.awt.Color(204, 204, 204));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/search.png"))); // NOI18N
        jbtSearch.setText("Tìm kiếm");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/search-icon.png"))); // NOI18N
        jLabel1.setText("TRA CỨU SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jtxtSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng còn trong kho", "Số lượng chưa trả", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(Sach);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/baseline_favorite_white_24dp.png"))); // NOI18N
        jLabel2.setText("SÁCH Có Số Lượt MƯỢN NHIỀU NHẤT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        table_top.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sách", "Tác giả", "Số lượt mượn"
            }
        ));
        jScrollPane4.setViewportView(table_top);

        btn_boTim.setBackground(new java.awt.Color(204, 204, 204));
        btn_boTim.setText("Bỏ Tìm Kiếm");
        btn_boTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_boTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_boTim)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_boTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
       try {
            Sach.removeAll();
            String []arr={"Mã Sách","Tên Sách", "Mã Tác Giả","Mã Thể Loại" ,"Mã Nhà Xuất Bản","Năm Xuất Bản","Ngôn Ngữ","Giá","Số Lượng"};
            mode_Sach=new  DefaultTableModel(arr,0);
            String sql ="select * from Sach where TenSach  LIKE N'%" +jtxtSearch.getText()+"%'";
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
            Sach.setModel(mode_Sach);
        } catch (SQLException ex) {
            
            System.out.println("Lỗi tại connection sql");
        }
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void btn_boTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_boTimActionPerformed
        show_dl_sach();
    }//GEN-LAST:event_btn_boTimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Sach;
    private javax.swing.JButton btn_boTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTable table_top;
    // End of variables declaration//GEN-END:variables
}
