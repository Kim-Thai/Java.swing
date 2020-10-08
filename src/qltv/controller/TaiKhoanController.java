package qltv.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import qltv.view.MainJFrame;
import qltv.view.connect_sql;

/**
 *
 * @author tunguyen
 */
public class TaiKhoanController {
    
    static public JDialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JPasswordField jpfMatKhau;
    private JLabel jlbMsg;
    static public MainJFrame frame;
    static public String MaAdmin;
    public TaiKhoanController(JDialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, JPasswordField jpfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jpfMatKhau = jpfMatKhau;
        this.jlbMsg = jlbMsg;
    }
    
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            
            public void mouseClicked(MouseEvent e) {
                String user=jtfTenDangNhap.getText();
                String pass=jpfMatKhau.getText();
                if(jtfTenDangNhap.getText().length() == 0 || jpfMatKhau.getText().length() == 0){
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buột!");
                } else{
                    {
                    try {
                        connect_sql a=new connect_sql();
                        Connection con =a.getConnectionTo();
                        String sql="select * from Admin where MaAd=? and MatKhauAd=? " ;
                        PreparedStatement pre=con.prepareStatement(sql);
                        pre.setString(1, user);
                        pre.setString(2, pass);
                        
                        ResultSet rs=pre.executeQuery();
                        if(rs.next())
                        {
                            MaAdmin=user;
                            dialog.dispose();
                            frame = new MainJFrame();
                            frame.setTitle("Quản Lý Thư Viện");
                            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            frame.setVisible(true);
                        } else{
                            jlbMsg.setText("Tên đăng nhập hoặc mật khẩu không đúng!");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e){
                btnSubmit.setBackground(new Color(0,200,83));
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnSubmit.setBackground(new Color(0,221,23));
            }
}
        );
        
    }
    
}
