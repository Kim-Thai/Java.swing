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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tunguyen
 */
public class TacGiaJFrame extends javax.swing.JFrame {

    connect_sql a=new connect_sql();
    Connection con=a.getConnectionTo();
    public TacGiaJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        if(TacGiaJPanel.flag==0)
        {
            txt_thongbao.setText("Thêm Tác Giả.");
            getTacGia();
            
        }
        else if(TacGiaJPanel.flag==1)
        {
            txt_thongbao.setText("Sửa Thông Tin Tác Giả.");
            txt_matg.setText(TacGiaJPanel.matg);
            txt_tentg.setText(TacGiaJPanel.tentg);
            txt_diachi.setText(TacGiaJPanel.diachi);
            
        }
                
        
    }
private void them_TacGia()
{
    try {
            String SQL="insert into TacGia(MaTG,TenTG,DiaChiTG)  VALUES (?,?, ?)";
            PreparedStatement statement = con.prepareStatement(SQL);
            statement.setString(1, txt_matg.getText());
            statement.setString(2, txt_tentg.getText());
            statement.setString(3,txt_diachi.getText());
            
            
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm tác giả thành công!!!");
                this.dispose();
    }
    }catch (Exception e) {
        System.out.println("mmm");
    }
}
        private void Sua_TacGia()
        {
            try {
                String sql="update TacGia set   TenTG=?, DiaChiTG= ? where MaTG=?";
                PreparedStatement statement = con.prepareStatement(sql);
            
                statement.setString(1, txt_tentg.getText());
                statement.setString(2,txt_diachi.getText());
                statement.setString(3, txt_matg.getText());
            
            int update=statement.executeUpdate();
            if(update>0)
            {
                JOptionPane.showMessageDialog(this, "Bạn đã sửa thông tin tác giả thành công.");
                this.dispose();
            }
            } catch (Exception e) {
                System.out.println("sua tg");
            }
        }
       
         private  void getTacGia()
    {
                
            try {
            Statement sta=con.createStatement();
            ResultSet rss=sta.executeQuery("select MAX(MaTG) as matacgia from TacGia");
            while(rss.next())
            {
                int id=(Integer.parseInt(rss.getString("matacgia")) +1);
                txt_matg.setText(String.valueOf(id));
                System.out.println(id);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PhieuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtMaTG = new javax.swing.JTextField();
        jtTenTG = new javax.swing.JTextField();
        jtDiaChi = new javax.swing.JTextField();
        jbtXacNhan = new javax.swing.JButton();
        jbtHuyBo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_matg = new javax.swing.JTextField();
        txt_tentg = new javax.swing.JTextField();
        txt_diachi = new javax.swing.JTextField();
        txt_thongbao = new javax.swing.JLabel();
        jbtXacNhan1 = new javax.swing.JButton();
        jbtHuyBo1 = new javax.swing.JButton();

        jLabel1.setText("Mã tác giả");

        jLabel2.setText("Tên tác giả");

        jLabel3.setText("Địa chỉ");

        jbtXacNhan.setText("Xác nhận");

        jbtHuyBo.setText("Hủy bỏ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtMaTG)
                    .addComponent(jtTenTG)
                    .addComponent(jtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jbtXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jbtHuyBo)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtMaTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXacNhan)
                    .addComponent(jbtHuyBo))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Mã tác giả");

        jLabel5.setText("Tên tác giả");

        jLabel6.setText("Địa chỉ");

        txt_matg.setEditable(false);

        txt_thongbao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_thongbao.setForeground(new java.awt.Color(255, 0, 0));
        txt_thongbao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_matg)
                            .addComponent(txt_tentg)
                            .addComponent(txt_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txt_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_matg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tentg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtXacNhan1.setText("Xác nhận");
        jbtXacNhan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXacNhan1ActionPerformed(evt);
            }
        });

        jbtHuyBo1.setText("Hủy bỏ");
        jbtHuyBo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyBo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jbtXacNhan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtHuyBo1)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXacNhan1)
                    .addComponent(jbtHuyBo1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtHuyBo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyBo1ActionPerformed
        // hủy bỏ
        this.dispose();
    }//GEN-LAST:event_jbtHuyBo1ActionPerformed

    private void jbtXacNhan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXacNhan1ActionPerformed
        // thêm
        if(txt_diachi.getText().length()==0 ||txt_tentg.getText().length()==0)
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin.");
            else if(txt_diachi.getText().length()>0 &&txt_tentg.getText().length()>0)
            {
                if(TacGiaJPanel.flag==0)    them_TacGia();
                if(TacGiaJPanel.flag==1)    Sua_TacGia();
            }
                
    }//GEN-LAST:event_jbtXacNhan1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TacGiaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TacGiaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TacGiaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TacGiaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TacGiaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtHuyBo;
    private javax.swing.JButton jbtHuyBo1;
    private javax.swing.JButton jbtXacNhan;
    private javax.swing.JButton jbtXacNhan1;
    private javax.swing.JTextField jtDiaChi;
    private javax.swing.JTextField jtMaTG;
    private javax.swing.JTextField jtTenTG;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_matg;
    private javax.swing.JTextField txt_tentg;
    private javax.swing.JLabel txt_thongbao;
    // End of variables declaration//GEN-END:variables
}
