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


public class BanDocJPanel extends javax.swing.JPanel {
    connect_sql a=new connect_sql();
    Connection con=a.getConnectionTo();
    DefaultTableModel mode;
    static public int flag_bandoc;
    int checkSelect;
    int dangmuon;
    static  public String madg;
    static  public String tendg;
    static  public String dc;
    static public String gt;
    static  public String dienthoai;
    static  public String ngaydangky;
    static  public String ngaysinh;
    public BanDocJPanel() {
        initComponents();
        show_DuLieu_BanDoc();
        checkSelect=0;
    }

    public void show_DuLieu_BanDoc(){
        checkSelect=0;
        try {
            table_BanDoc.removeAll();
            String []arr={"Mã Độc Giả","Tên Độc Giả", "Giới Tính","Ngày Sinh","Địa Chỉ","Điện Thoại","Ngày Tạo"};
            mode=new  DefaultTableModel(arr,0);
            String sql ="select * from DocGia "; 
            PreparedStatement ps=con.prepareCall(sql);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaDG"));
                vt.add(rs.getString("TenDG"));
                vt.add(rs.getString("GioiTinhDG"));
                vt.add(rs.getString("NgaySinh"));
                vt.add(rs.getString("DiaChiDG"));
                vt.add(rs.getString("SoDT"));
                vt.add(rs.getString("NgayTao"));
               
                mode.addRow(vt);
            }
            table_BanDoc.setModel(mode);
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
        btn_ReLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_BanDoc = new javax.swing.JTable();
        btn_ThemBanDoc = new javax.swing.JButton();
        btn_XoaBanDoc = new javax.swing.JButton();
        btn_SuaBanDoc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_muon = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH BẠN ĐỌC");

        btn_ReLoad.setIcon(new javax.swing.ImageIcon("E:\\java\\QuanLyThuVien\\build\\classes\\qltv\\images\\reload.png")); // NOI18N
        btn_ReLoad.setText("ReLoad");
        btn_ReLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ReLoad)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_ReLoad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_BanDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_BanDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_BanDocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_BanDoc);

        btn_ThemBanDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/add-icon.png"))); // NOI18N
        btn_ThemBanDoc.setText("THÊM");
        btn_ThemBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemBanDocActionPerformed(evt);
            }
        });

        btn_XoaBanDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/delete-icon.png"))); // NOI18N
        btn_XoaBanDoc.setText("XÓA");
        btn_XoaBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaBanDocActionPerformed(evt);
            }
        });

        btn_SuaBanDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/edit-icon.png"))); // NOI18N
        btn_SuaBanDoc.setText("SỬA");
        btn_SuaBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaBanDocActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/I-icon.png"))); // NOI18N
        jLabel2.setText("Thông tin mượn");

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

        table_muon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu", "Mã Độc Giả", "Mã Sách", "Mã Admin Cho Mượn", "Ngày Mượn", "Ngày Hẹn Trả", "Tình Trạng"
            }
        ));
        jScrollPane2.setViewportView(table_muon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThemBanDoc)
                .addGap(18, 18, 18)
                .addComponent(btn_SuaBanDoc)
                .addGap(18, 18, 18)
                .addComponent(btn_XoaBanDoc)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThemBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void show_DuLieu(){
        try {
            table_muon.removeAll();
            String []arr={"Mã Phiếu","Mã Độc Giả", "Mã Sách","Mã admin cho mượn","Ngày Mượn ","Hạn Ngày Trả" ,"Tình trạng"};
            mode=new  DefaultTableModel(arr,0);
            String sql ="select * from MuonTraSach where MaDG='"+madg+"'"; 
            PreparedStatement ps=con.prepareCall(sql);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector vt=new Vector();
                vt.add(rs.getString("MaPhieu"));
                vt.add(rs.getString("MaDG"));
                vt.add(rs.getString("MaSach"));
                vt.add(rs.getString("MaAd"));
                vt.add(rs.getString("NgayMuon"));
                vt.add(rs.getString("NgayHenTra"));
                vt.add(rs.getString("TinhTrang"));
                mode.addRow(vt);
            }
            table_muon.setModel(mode);
        } catch (SQLException ex) {
            //Logger.getLogger(Dang_ki_ID.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi tại connection sql");
        }
    }
    private void btn_ThemBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemBanDocActionPerformed
        // Thêm
        flag_bandoc=1;
        new BanDocJFrame().setVisible(true);
    }//GEN-LAST:event_btn_ThemBanDocActionPerformed

    private void btn_SuaBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaBanDocActionPerformed
        // Sửa
        flag_bandoc=2;
        if(checkSelect==1)
        new BanDocJFrame().setVisible(true);
        else
            JOptionPane.showMessageDialog(btn_ThemBanDoc, "Bạn chưa chọn độc giả để sửa!!!");
    }//GEN-LAST:event_btn_SuaBanDocActionPerformed

    private void table_BanDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_BanDocMouseClicked
        // lấy dl qua BanDọcFrame.java
        checkSelect=1;
        
        int index=table_BanDoc.getSelectedRow();
        madg=(String)(mode.getValueAt(index,0));
        tendg=(String)(mode.getValueAt(index,1));
        gt=(String)(mode.getValueAt(index,2));
        ngaysinh=(String)(mode.getValueAt(index,3));
        dc=(String)(mode.getValueAt(index,4));
        dienthoai=(String)(mode.getValueAt(index,5));
        ngaydangky=(String)(mode.getValueAt(index,6));
        
        show_DuLieu();
        show_DuLieu_BanDoc();
        checkSelect=1;
        
        
    }//GEN-LAST:event_table_BanDocMouseClicked

    private void btn_ReLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReLoadActionPerformed
        // load lại table
        show_DuLieu_BanDoc();
    }//GEN-LAST:event_btn_ReLoadActionPerformed

    private void btn_XoaBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaBanDocActionPerformed
        if(checkSelect==0)
            JOptionPane.showMessageDialog(btn_ThemBanDoc, "Bạn chưa chọn độc giả để xóa !!!");
        else {
            KiemTra();
            if(dangmuon==1)
            {
                JOptionPane.showMessageDialog(this, "Bạn chưa trả hết sách cho thư viện.");
            }
            else if(dangmuon==0)
            {
                XoaDocGia();
            }
        }
    }//GEN-LAST:event_btn_XoaBanDocActionPerformed
    private void KiemTra()
    {
        //kiểm tra xem có đang mượn sách hay k.
        dangmuon=0;
                try {
                    Statement sta=con.createStatement();
                        String sql_select="select * from MuonTraSach where MaDG=? and TinhTrang=? " ;
                        PreparedStatement pre=con.prepareStatement(sql_select);
                        pre.setString(1, BanDocJPanel.madg);
                        pre.setString(2, "Chưa");
                        
                        ResultSet rs=pre.executeQuery();
                        if(rs.next())
                        {
                            dangmuon=1;
                            System.out.println("Dang mượn :"+dangmuon);
                        }
            
                } catch (SQLException ex) {
                    Logger.getLogger(QLMuonTraJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("sai");
                }
    }
    private  void XoaDocGia()
    {
        try {
                    // TODO add your handling code here:
                    String sql = "DELETE FROM DocGia WHERE MaDG=?";
                    
                    PreparedStatement statement = con.prepareStatement(sql);
                    statement.setString(1,BanDocJPanel.madg );
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        
                        JOptionPane.showMessageDialog(this, "Xóa thành công!!!");
                        show_DuLieu_BanDoc();
                    }
                } catch (SQLException ex) {
                    //Logger.getLogger(Dang_ki_ID.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Lỗi không thể xóa!!!");
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ReLoad;
    private javax.swing.JButton btn_SuaBanDoc;
    private javax.swing.JButton btn_ThemBanDoc;
    private javax.swing.JButton btn_XoaBanDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_BanDoc;
    private javax.swing.JTable table_muon;
    // End of variables declaration//GEN-END:variables
}
