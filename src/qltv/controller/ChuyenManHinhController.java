package qltv.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qltv.bean.DanhMuc;
import qltv.view.BanDocJPanel;
import qltv.view.DoiMatKhauJPanel;
import qltv.view.NhaXuatBanJPanel;
import qltv.view.QLMuonTraJPanel;
import qltv.view.SachJPanel;
import qltv.view.TacGiaJPanel;
import qltv.view.TheLoaiJPanel;
import qltv.view.TrangChuJPanel;

/**
 *
 * @author tunguyen
 */
public class ChuyenManHinhController {
    
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMuc> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem,JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMuc> listItem){
        this.listItem = listItem;
        for(DanhMuc item : listItem){
            item.getJlb().addMouseListener(new LabelVent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelVent implements MouseListener {
        
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelVent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind)
            {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "Sach":
                    node = new SachJPanel();
                    break;
                case "QLMuonTra":
                    node = new QLMuonTraJPanel();
                    break;
                case "BanDoc":
                    node = new BanDocJPanel();
                    break;
                case "TacGia":
                    node = new TacGiaJPanel();
                    break;
                case "DoiMatKhau":
                    node = new DoiMatKhauJPanel();
                    break;
                case "NhaXuatBan":
                    node = new NhaXuatBanJPanel();
                    break;
                case "TheLoai":
                    node = new TheLoaiJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jlbItem.setBackground(new Color(96,100,191));
            jpnItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jlbItem.setBackground(new Color(96,100,191));
            jpnItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jlbItem.setBackground(new Color(255,0,0));
                jpnItem.setBackground(new Color(255,0,0));
            }
        }
        
    }
    
    private void setChangeBackground(String kind){
        for(DanhMuc item: listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
            }else{
                item.getJpn().setBackground(new Color(255,0,0));
                item.getJlb().setBackground(new Color(255,0,0));
            }
        }
    }
}
