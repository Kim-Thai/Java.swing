package qltv.main;

import qltv.view.DangNhapJDialog;
import qltv.view.MainJFrame;


public class Main {

    public static void main(String[] args) {
        DangNhapJDialog dialog = new DangNhapJDialog(null, true);
        dialog.setTitle("Đăng Nhập Hệ Thống");
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
}
