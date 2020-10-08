package qltv.view;

import java.util.ArrayList;
import java.util.List;
import qltv.bean.DanhMuc;
import qltv.controller.ChuyenManHinhController;
import qltv.view.QLMuonTraJPanel;

/**
 *
 * @author tunguyen
 */
public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        
        setTitle("QUẢN LÝ THƯ VIỆN");
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu, jlbTrangChu);
        
        List<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("TrangChu",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMuc("Sach",jpnSach,jlbSach));
        listItem.add(new DanhMuc("QLMuonTra",jpnQLMuonTra,jlbQLMuonTra));
        listItem.add(new DanhMuc("BanDoc",jpnBanDoc,jlbBanDoc));
        listItem.add(new DanhMuc("TacGia",jpnTacGia,jlbTacGia));
        listItem.add(new DanhMuc("DoiMatKhau", jpnDoiMatKhau, jlbDoiMatKhau));
        listItem.add(new DanhMuc("NhaXuatBan", jpnNhaXuatBan, jlbNhaXuatBan));
        listItem.add(new DanhMuc("TheLoai",jpnTheLoai,jlbTheLoai));
        
        
        controller.setEvent(listItem);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnQLMuonTra = new javax.swing.JPanel();
        jlbQLMuonTra = new javax.swing.JLabel();
        jpnBanDoc = new javax.swing.JPanel();
        jlbBanDoc = new javax.swing.JLabel();
        jpnSach = new javax.swing.JPanel();
        jlbSach = new javax.swing.JLabel();
        jpnTacGia = new javax.swing.JPanel();
        jlbTacGia = new javax.swing.JLabel();
        jpnTheLoai = new javax.swing.JPanel();
        jlbTheLoai = new javax.swing.JLabel();
        jpnNhaXuatBan = new javax.swing.JPanel();
        jlbNhaXuatBan = new javax.swing.JLabel();
        jpnDoiMatKhau = new javax.swing.JPanel();
        jlbDoiMatKhau = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(204, 255, 255));
        jpnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jpnMenu.setForeground(new java.awt.Color(255, 255, 255));
        jpnMenu.setPreferredSize(new java.awt.Dimension(184, 69));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/bookcase_icon.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ THƯ VIỆN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(255, 0, 0));

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/home-icon.png"))); // NOI18N
        jlbTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTrangChu)
                .addGap(10, 10, 10))
        );

        jpnQLMuonTra.setBackground(new java.awt.Color(255, 0, 0));

        jlbQLMuonTra.setBackground(new java.awt.Color(0, 153, 51));
        jlbQLMuonTra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbQLMuonTra.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/card-icon.png"))); // NOI18N
        jlbQLMuonTra.setText("Quản lý mượn trả");

        javax.swing.GroupLayout jpnQLMuonTraLayout = new javax.swing.GroupLayout(jpnQLMuonTra);
        jpnQLMuonTra.setLayout(jpnQLMuonTraLayout);
        jpnQLMuonTraLayout.setHorizontalGroup(
            jpnQLMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLMuonTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLMuonTraLayout.setVerticalGroup(
            jpnQLMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLMuonTraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbQLMuonTra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnBanDoc.setBackground(new java.awt.Color(255, 0, 0));

        jlbBanDoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbBanDoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbBanDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jlbBanDoc.setText("Bạn đọc");

        javax.swing.GroupLayout jpnBanDocLayout = new javax.swing.GroupLayout(jpnBanDoc);
        jpnBanDoc.setLayout(jpnBanDocLayout);
        jpnBanDocLayout.setHorizontalGroup(
            jpnBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBanDocLayout.setVerticalGroup(
            jpnBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBanDocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbBanDoc)
                .addContainerGap())
        );

        jpnSach.setBackground(new java.awt.Color(255, 0, 0));

        jlbSach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbSach.setForeground(new java.awt.Color(255, 255, 255));
        jlbSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/book-icon.png"))); // NOI18N
        jlbSach.setText("Sách");
        jlbSach.setToolTipText("");

        javax.swing.GroupLayout jpnSachLayout = new javax.swing.GroupLayout(jpnSach);
        jpnSach.setLayout(jpnSachLayout);
        jpnSachLayout.setHorizontalGroup(
            jpnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSachLayout.createSequentialGroup()
                .addComponent(jlbSach, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnSachLayout.setVerticalGroup(
            jpnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbSach)
                .addContainerGap())
        );

        jpnTacGia.setBackground(new java.awt.Color(240, 0, 0));

        jlbTacGia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTacGia.setForeground(new java.awt.Color(255, 255, 255));
        jlbTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jlbTacGia.setText("Tác Giả");

        javax.swing.GroupLayout jpnTacGiaLayout = new javax.swing.GroupLayout(jpnTacGia);
        jpnTacGia.setLayout(jpnTacGiaLayout);
        jpnTacGiaLayout.setHorizontalGroup(
            jpnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTacGiaLayout.setVerticalGroup(
            jpnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTacGia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTheLoai.setBackground(new java.awt.Color(240, 0, 0));

        jlbTheLoai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTheLoai.setForeground(new java.awt.Color(255, 255, 255));
        jlbTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jlbTheLoai.setText("Thể Loại");

        javax.swing.GroupLayout jpnTheLoaiLayout = new javax.swing.GroupLayout(jpnTheLoai);
        jpnTheLoai.setLayout(jpnTheLoaiLayout);
        jpnTheLoaiLayout.setHorizontalGroup(
            jpnTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTheLoaiLayout.setVerticalGroup(
            jpnTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTheLoai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnNhaXuatBan.setBackground(new java.awt.Color(240, 0, 0));

        jlbNhaXuatBan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbNhaXuatBan.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhaXuatBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jlbNhaXuatBan.setText("Nhà xuất bản");

        javax.swing.GroupLayout jpnNhaXuatBanLayout = new javax.swing.GroupLayout(jpnNhaXuatBan);
        jpnNhaXuatBan.setLayout(jpnNhaXuatBanLayout);
        jpnNhaXuatBanLayout.setHorizontalGroup(
            jpnNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhaXuatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhaXuatBanLayout.setVerticalGroup(
            jpnNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhaXuatBan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnDoiMatKhau.setBackground(new java.awt.Color(240, 0, 0));

        jlbDoiMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/images/user-icon.png"))); // NOI18N
        jlbDoiMatKhau.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jpnDoiMatKhauLayout = new javax.swing.GroupLayout(jpnDoiMatKhau);
        jpnDoiMatKhau.setLayout(jpnDoiMatKhauLayout);
        jpnDoiMatKhauLayout.setHorizontalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnDoiMatKhauLayout.setVerticalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDoiMatKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQLMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTacGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnNhaXuatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQLMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbBanDoc;
    private javax.swing.JLabel jlbDoiMatKhau;
    private javax.swing.JLabel jlbNhaXuatBan;
    private javax.swing.JLabel jlbQLMuonTra;
    private javax.swing.JLabel jlbSach;
    private javax.swing.JLabel jlbTacGia;
    private javax.swing.JLabel jlbTheLoai;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnBanDoc;
    private javax.swing.JPanel jpnDoiMatKhau;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhaXuatBan;
    private javax.swing.JPanel jpnQLMuonTra;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSach;
    private javax.swing.JPanel jpnTacGia;
    private javax.swing.JPanel jpnTheLoai;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
