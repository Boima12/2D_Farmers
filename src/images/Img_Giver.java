package images;

import java.awt.Image;
import java.io.*;

import javax.swing.*;

// chỉnh JLabel hoặc JButton nha :3

public class Img_Giver {
	private static String pathCanon;
	
	public Img_Giver() {
		try {
			pathCanon = new File(".").getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void imgsprout(JButton bt) {
		bt.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\sprout.png").getImage().getScaledInstance(bt.getSize().width, bt.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void imgTheDealer(JButton bt) {
		bt.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\TheDealer.jpg").getImage().getScaledInstance(bt.getSize().width, bt.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	// 1_y là viết tắt của 1_young đó, 1_g là 1_grown
	
	
	public void img1_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\1_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img1_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\1_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img2_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\2_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img2_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\2_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img3_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\3_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img3_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\3_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img4_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\4_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img4_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\4_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img5_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\5_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img5_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\5_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img6_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\6_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img6_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\6_g.png").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img7_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\7_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img7_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\7_g.png").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img8_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\8_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img8_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\8_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img9_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\9_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img9_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\9_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img10_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\10_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img10_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\10_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img11_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\11_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img11_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\11_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img12_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\12_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img12_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\12_g.png").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img13_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\13_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img13_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\13_g.jpg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img14_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\14_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img14_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\14_g.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void img15_y(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\15_y.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	public void img15_g(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\15_g.jpg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void imganh1(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\anh1.jpg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void imgcat1(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\cat1.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void imgcat2(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\cat2.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void imgNhau(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\Nhau.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
	public void imgwhite(JLabel lb) {
		lb.setIcon(new ImageIcon(new ImageIcon(pathCanon + "\\src\\images\\white.jpeg").getImage().getScaledInstance(lb.getSize().width, lb.getSize().height, Image.SCALE_SMOOTH)));
		return;
	}
	
	
}