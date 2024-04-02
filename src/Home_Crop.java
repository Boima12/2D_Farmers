import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import images.*;

public class Home_Crop extends JFrame {

	private static Img_Giver imgGiver = new Img_Giver();	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField tf_hatgiong1;
	private JTextField tf_hatgiong2;
	private JTextField tf_hatgiong3;
	private JTextField tf_hatgiong4;
	private JTextField tf_hatgiong5;
	private JTextField tf_hatgiong6;
	private JTextField tf_hatgiong7;
	private JTextField tf_hatgiong8;
	private JTextField tf_hatgiong9;
	private JTextField tf_hatgiong10;
	private JTextField tf_hatgiong11;
	private JTextField tf_hatgiong12;
	private JTextField tf_hatgiong13;
	private JTextField tf_hatgiong14;
	private JTextField tf_hatgiong15;
	private JButton bt_hatgiong1;
	private JButton bt_hatgiong2;
	private JButton bt_hatgiong3;
	private JButton bt_hatgiong4;
	private JButton bt_hatgiong5;
	private JButton bt_hatgiong6;
	private JButton bt_hatgiong7;
	private JButton bt_hatgiong8;
	private JButton bt_hatgiong9;
	private JButton bt_hatgiong10;
	private JButton bt_hatgiong11;
	private JButton bt_hatgiong12;
	private JButton bt_hatgiong13;
	private JButton bt_hatgiong14;
	private JButton bt_hatgiong15;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Crop frame = new Home_Crop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void ChooseCrop(JFrame parentFrame) {
		JDialog dialog = new JDialog(parentFrame, "Chọn giống cây trồng", true);
		
		JPanel pad = new JPanel(null);
		pad.setBounds(21, 10, 880, 470);
        
		JLabel anh = new JLabel("");
		anh.setBounds(194, 10, 465, 90);
		imgGiver.imgHome_Crop1(anh);
		pad.add(anh);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel1.setBounds(10, 122, 261, 45);
		pad.add(panel1);
		panel1.setLayout(null);
		
		tf_hatgiong1 = new JTextField();
		tf_hatgiong1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong1.setText("Lúa mì - 1$");
		tf_hatgiong1.setEditable(false);
		tf_hatgiong1.setBounds(10, 10, 180, 25);
		panel1.add(tf_hatgiong1);
		tf_hatgiong1.setColumns(10);
		
		bt_hatgiong1 = new JButton("ok\r\n");
		bt_hatgiong1.setBounds(193, 10, 58, 25);
		bt_hatgiong1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel1.add(bt_hatgiong1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBounds(10, 187, 261, 45);
		pad.add(panel2);
		
		tf_hatgiong2 = new JTextField();
		tf_hatgiong2.setText("Dưa hấu - 7$\r\n");
		tf_hatgiong2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong2.setEditable(false);
		tf_hatgiong2.setColumns(10);
		tf_hatgiong2.setBounds(10, 10, 180, 25);
		panel2.add(tf_hatgiong2);
		
		bt_hatgiong2 = new JButton("ok\r\n");
		bt_hatgiong2.setBounds(193, 10, 58, 25);
		bt_hatgiong2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel2.add(bt_hatgiong2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel3.setBounds(10, 242, 261, 45);
		pad.add(panel3);
		
		tf_hatgiong3 = new JTextField();
		tf_hatgiong3.setText("Cà tím - 40$");
		tf_hatgiong3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong3.setEditable(false);
		tf_hatgiong3.setColumns(10);
		tf_hatgiong3.setBounds(10, 10, 180, 25);
		panel3.add(tf_hatgiong3);
		
		bt_hatgiong3 = new JButton("ok\r\n");
		bt_hatgiong3.setBounds(193, 10, 58, 25);
		bt_hatgiong3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel3.add(bt_hatgiong3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel4.setBounds(10, 302, 261, 45);
		pad.add(panel4);
		
		tf_hatgiong4 = new JTextField();
		tf_hatgiong4.setText("Cà rốt - 240$");
		tf_hatgiong4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong4.setEditable(false);
		tf_hatgiong4.setColumns(10);
		tf_hatgiong4.setBounds(10, 10, 180, 25);
		panel4.add(tf_hatgiong4);
		
		bt_hatgiong4 = new JButton("ok\r\n");
		bt_hatgiong4.setBounds(193, 10, 58, 25);
		bt_hatgiong4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel4.add(bt_hatgiong4);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel5.setBounds(10, 358, 261, 45);
		pad.add(panel5);
		
		tf_hatgiong5 = new JTextField();
		tf_hatgiong5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong5.setText("Nho - 1200$\r\n");
		tf_hatgiong5.setEditable(false);
		tf_hatgiong5.setColumns(10);
		tf_hatgiong5.setBounds(10, 10, 180, 25);
		panel5.add(tf_hatgiong5);
		
		bt_hatgiong5 = new JButton("ok\r\n");
		bt_hatgiong5.setBounds(193, 10, 58, 25);
		bt_hatgiong5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel5.add(bt_hatgiong5);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel6.setBounds(293, 122, 261, 45);
		pad.add(panel6);
		
		tf_hatgiong6 = new JTextField();
		tf_hatgiong6.setText("Iron - 15000$");
		tf_hatgiong6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong6.setEditable(false);
		tf_hatgiong6.setColumns(10);
		tf_hatgiong6.setBounds(10, 10, 180, 25);
		panel6.add(tf_hatgiong6);
		
		bt_hatgiong6 = new JButton("ok\r\n");
		bt_hatgiong6.setBounds(193, 10, 58, 25);
		bt_hatgiong6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel6.add(bt_hatgiong6);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel7.setBounds(293, 187, 261, 45);
		pad.add(panel7);
		
		tf_hatgiong7 = new JTextField();
		tf_hatgiong7.setText("Gold - 75000$\r\n");
		tf_hatgiong7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong7.setEditable(false);
		tf_hatgiong7.setColumns(10);
		tf_hatgiong7.setBounds(10, 10, 180, 25);
		panel7.add(tf_hatgiong7);
		
		bt_hatgiong7 = new JButton("ok\r\n");
		bt_hatgiong7.setBounds(193, 10, 58, 25);
		bt_hatgiong7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel7.add(bt_hatgiong7);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel8.setBounds(293, 242, 261, 45);
		pad.add(panel8);
		
		tf_hatgiong8 = new JTextField();
		tf_hatgiong8.setText("Diamond - 600,000$");
		tf_hatgiong8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong8.setEditable(false);
		tf_hatgiong8.setColumns(10);
		tf_hatgiong8.setBounds(10, 10, 180, 25);
		panel8.add(tf_hatgiong8);
		
		bt_hatgiong8 = new JButton("ok\r\n");
		bt_hatgiong8.setBounds(193, 10, 58, 25);
		bt_hatgiong8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel8.add(bt_hatgiong8);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel9.setBounds(293, 302, 261, 45);
		pad.add(panel9);
		
		tf_hatgiong9 = new JTextField();
		tf_hatgiong9.setText("Young Buffallo - 4,200,000$\r\n");
		tf_hatgiong9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong9.setEditable(false);
		tf_hatgiong9.setColumns(10);
		tf_hatgiong9.setBounds(10, 10, 180, 25);
		panel9.add(tf_hatgiong9);
		
		bt_hatgiong9 = new JButton("ok\r\n");
		bt_hatgiong9.setBounds(193, 10, 58, 25);
		bt_hatgiong9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel9.add(bt_hatgiong9);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel10.setBounds(293, 358, 261, 45);
		pad.add(panel10);
		
		tf_hatgiong10 = new JTextField();
		tf_hatgiong10.setText("Steve - 29,400,000$\r\n");
		tf_hatgiong10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong10.setEditable(false);
		tf_hatgiong10.setColumns(10);
		tf_hatgiong10.setBounds(10, 10, 180, 25);
		panel10.add(tf_hatgiong10);
		
		bt_hatgiong10 = new JButton("ok\r\n");
		bt_hatgiong10.setBounds(193, 10, 58, 25);
		bt_hatgiong10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel10.add(bt_hatgiong10);
		
		JPanel panel11 = new JPanel();
		panel11.setLayout(null);
		panel11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel11.setBounds(571, 122, 261, 45);
		pad.add(panel11);
		
		tf_hatgiong11 = new JTextField();
		tf_hatgiong11.setText("Doraemon - 205,800,000$");
		tf_hatgiong11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong11.setEditable(false);
		tf_hatgiong11.setColumns(10);
		tf_hatgiong11.setBounds(10, 10, 180, 25);
		panel11.add(tf_hatgiong11);
		
		bt_hatgiong11 = new JButton("ok\r\n");
		bt_hatgiong11.setBounds(193, 10, 58, 25);
		bt_hatgiong11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel11.add(bt_hatgiong11);
		
		JPanel panel12 = new JPanel();
		panel12.setLayout(null);
		panel12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel12.setBounds(571, 187, 261, 45);
		pad.add(panel12);
		
		tf_hatgiong12 = new JTextField();
		tf_hatgiong12.setText("Florentino - 1,440,600,000$");
		tf_hatgiong12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong12.setEditable(false);
		tf_hatgiong12.setColumns(10);
		tf_hatgiong12.setBounds(10, 10, 180, 25);
		panel12.add(tf_hatgiong12);
		
		bt_hatgiong12 = new JButton("ok\r\n");
		bt_hatgiong12.setBounds(193, 10, 58, 25);
		bt_hatgiong12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel12.add(bt_hatgiong12);
		
		JPanel panel13 = new JPanel();
		panel13.setLayout(null);
		panel13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel13.setBounds(571, 242, 261, 45);
		pad.add(panel13);
		
		tf_hatgiong13 = new JTextField();
		tf_hatgiong13.setText("Thầy Huấn - 10,084,200,000$");
		tf_hatgiong13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong13.setEditable(false);
		tf_hatgiong13.setColumns(10);
		tf_hatgiong13.setBounds(10, 10, 180, 25);
		panel13.add(tf_hatgiong13);
		
		bt_hatgiong13 = new JButton("ok\r\n");
		bt_hatgiong13.setBounds(193, 10, 58, 25);
		bt_hatgiong13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel13.add(bt_hatgiong13);
		
		JPanel panel14 = new JPanel();
		panel14.setLayout(null);
		panel14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel14.setBounds(571, 302, 261, 45);
		pad.add(panel14);
		
		tf_hatgiong14 = new JTextField();
		tf_hatgiong14.setText("Anh Bảnh - 70,589,400,000$");
		tf_hatgiong14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong14.setEditable(false);
		tf_hatgiong14.setColumns(10);
		tf_hatgiong14.setBounds(10, 10, 180, 25);
		panel14.add(tf_hatgiong14);
		
		bt_hatgiong14 = new JButton("ok\r\n");
		bt_hatgiong14.setBounds(193, 10, 58, 25);
		bt_hatgiong14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel14.add(bt_hatgiong14);
		
		JPanel panel15 = new JPanel();
		panel15.setLayout(null);
		panel15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel15.setBounds(571, 358, 261, 45);
		pad.add(panel15);
		
		tf_hatgiong15 = new JTextField();
		tf_hatgiong15.setForeground(new Color(255, 0, 0));
		tf_hatgiong15.setText("??? - 5,576,562,600,000$");
		tf_hatgiong15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tf_hatgiong15.setEditable(false);
		tf_hatgiong15.setColumns(10);
		tf_hatgiong15.setBounds(10, 10, 180, 25);
		panel15.add(tf_hatgiong15);
		
		bt_hatgiong15 = new JButton("ok\r\n");
		bt_hatgiong15.setBounds(193, 10, 58, 25);
		bt_hatgiong15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		panel15.add(bt_hatgiong15);
		
        // Set the content of the dialog to the panel
        dialog.getContentPane().add(pad);

        // Set dialog properties
        dialog.setSize(900, 500);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
		
	}
	

	public Home_Crop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		// nếu muốn xem cấu trúc như thế nào thì gỡ "/* ... */, sử dụng GuiBuilder hoặc Netbean.
		
		/*
		JPanel pad = new JPanel(null);
		pad.setBounds(21, 10, 880, 470);
        
		JLabel anh = new JLabel("");
		anh.setBounds(194, 10, 465, 90);
		imgGiver.imgHome_Crop1(anh);
		pad.add(anh);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel1.setBounds(10, 122, 261, 45);
		pad.add(panel1);
		panel1.setLayout(null);
		
		tf_hatgiong1 = new JTextField();
		tf_hatgiong1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong1.setText("Lúa mì - 1$");
		tf_hatgiong1.setEditable(false);
		tf_hatgiong1.setBounds(10, 10, 180, 25);
		panel1.add(tf_hatgiong1);
		tf_hatgiong1.setColumns(10);
		
		bt_hatgiong1 = new JButton("ok\r\n");
		bt_hatgiong1.setBounds(193, 10, 58, 25);
		bt_hatgiong1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel1.add(bt_hatgiong1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBounds(10, 187, 261, 45);
		pad.add(panel2);
		
		tf_hatgiong2 = new JTextField();
		tf_hatgiong2.setText("Dưa hấu - 7$\r\n");
		tf_hatgiong2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong2.setEditable(false);
		tf_hatgiong2.setColumns(10);
		tf_hatgiong2.setBounds(10, 10, 180, 25);
		panel2.add(tf_hatgiong2);
		
		bt_hatgiong2 = new JButton("ok\r\n");
		bt_hatgiong2.setBounds(193, 10, 58, 25);
		bt_hatgiong2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel2.add(bt_hatgiong2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel3.setBounds(10, 242, 261, 45);
		pad.add(panel3);
		
		tf_hatgiong3 = new JTextField();
		tf_hatgiong3.setText("Cà tím - 40$");
		tf_hatgiong3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong3.setEditable(false);
		tf_hatgiong3.setColumns(10);
		tf_hatgiong3.setBounds(10, 10, 180, 25);
		panel3.add(tf_hatgiong3);
		
		bt_hatgiong3 = new JButton("ok\r\n");
		bt_hatgiong3.setBounds(193, 10, 58, 25);
		bt_hatgiong3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel3.add(bt_hatgiong3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel4.setBounds(10, 302, 261, 45);
		pad.add(panel4);
		
		tf_hatgiong4 = new JTextField();
		tf_hatgiong4.setText("Cà rốt - 240$");
		tf_hatgiong4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong4.setEditable(false);
		tf_hatgiong4.setColumns(10);
		tf_hatgiong4.setBounds(10, 10, 180, 25);
		panel4.add(tf_hatgiong4);
		
		bt_hatgiong4 = new JButton("ok\r\n");
		bt_hatgiong4.setBounds(193, 10, 58, 25);
		bt_hatgiong4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel4.add(bt_hatgiong4);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel5.setBounds(10, 358, 261, 45);
		pad.add(panel5);
		
		tf_hatgiong5 = new JTextField();
		tf_hatgiong5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong5.setText("Nho - 1200$\r\n");
		tf_hatgiong5.setEditable(false);
		tf_hatgiong5.setColumns(10);
		tf_hatgiong5.setBounds(10, 10, 180, 25);
		panel5.add(tf_hatgiong5);
		
		bt_hatgiong5 = new JButton("ok\r\n");
		bt_hatgiong5.setBounds(193, 10, 58, 25);
		bt_hatgiong5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel5.add(bt_hatgiong5);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel6.setBounds(293, 122, 261, 45);
		pad.add(panel6);
		
		tf_hatgiong6 = new JTextField();
		tf_hatgiong6.setText("Iron - 15000$");
		tf_hatgiong6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong6.setEditable(false);
		tf_hatgiong6.setColumns(10);
		tf_hatgiong6.setBounds(10, 10, 180, 25);
		panel6.add(tf_hatgiong6);
		
		bt_hatgiong6 = new JButton("ok\r\n");
		bt_hatgiong6.setBounds(193, 10, 58, 25);
		bt_hatgiong6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel6.add(bt_hatgiong6);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel7.setBounds(293, 187, 261, 45);
		pad.add(panel7);
		
		tf_hatgiong7 = new JTextField();
		tf_hatgiong7.setText("Gold - 75000$\r\n");
		tf_hatgiong7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong7.setEditable(false);
		tf_hatgiong7.setColumns(10);
		tf_hatgiong7.setBounds(10, 10, 180, 25);
		panel7.add(tf_hatgiong7);
		
		bt_hatgiong7 = new JButton("ok\r\n");
		bt_hatgiong7.setBounds(193, 10, 58, 25);
		bt_hatgiong7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel7.add(bt_hatgiong7);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel8.setBounds(293, 242, 261, 45);
		pad.add(panel8);
		
		tf_hatgiong8 = new JTextField();
		tf_hatgiong8.setText("Diamond - 600,000$");
		tf_hatgiong8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_hatgiong8.setEditable(false);
		tf_hatgiong8.setColumns(10);
		tf_hatgiong8.setBounds(10, 10, 180, 25);
		panel8.add(tf_hatgiong8);
		
		bt_hatgiong8 = new JButton("ok\r\n");
		bt_hatgiong8.setBounds(193, 10, 58, 25);
		bt_hatgiong8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel8.add(bt_hatgiong8);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel9.setBounds(293, 302, 261, 45);
		pad.add(panel9);
		
		tf_hatgiong9 = new JTextField();
		tf_hatgiong9.setText("Young Buffallo - 4,200,000$\r\n");
		tf_hatgiong9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong9.setEditable(false);
		tf_hatgiong9.setColumns(10);
		tf_hatgiong9.setBounds(10, 10, 180, 25);
		panel9.add(tf_hatgiong9);
		
		bt_hatgiong9 = new JButton("ok\r\n");
		bt_hatgiong9.setBounds(193, 10, 58, 25);
		bt_hatgiong9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel9.add(bt_hatgiong9);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel10.setBounds(293, 358, 261, 45);
		pad.add(panel10);
		
		tf_hatgiong10 = new JTextField();
		tf_hatgiong10.setText("Steve - 29,400,000$\r\n");
		tf_hatgiong10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong10.setEditable(false);
		tf_hatgiong10.setColumns(10);
		tf_hatgiong10.setBounds(10, 10, 180, 25);
		panel10.add(tf_hatgiong10);
		
		bt_hatgiong10 = new JButton("ok\r\n");
		bt_hatgiong10.setBounds(193, 10, 58, 25);
		bt_hatgiong10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel10.add(bt_hatgiong10);
		
		JPanel panel11 = new JPanel();
		panel11.setLayout(null);
		panel11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel11.setBounds(571, 122, 261, 45);
		pad.add(panel11);
		
		tf_hatgiong11 = new JTextField();
		tf_hatgiong11.setText("Doraemon - 205,800,000$");
		tf_hatgiong11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong11.setEditable(false);
		tf_hatgiong11.setColumns(10);
		tf_hatgiong11.setBounds(10, 10, 180, 25);
		panel11.add(tf_hatgiong11);
		
		bt_hatgiong11 = new JButton("ok\r\n");
		bt_hatgiong11.setBounds(193, 10, 58, 25);
		bt_hatgiong11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel11.add(bt_hatgiong11);
		
		JPanel panel12 = new JPanel();
		panel12.setLayout(null);
		panel12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel12.setBounds(571, 187, 261, 45);
		pad.add(panel12);
		
		tf_hatgiong12 = new JTextField();
		tf_hatgiong12.setText("Florentino - 1,440,600,000$");
		tf_hatgiong12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong12.setEditable(false);
		tf_hatgiong12.setColumns(10);
		tf_hatgiong12.setBounds(10, 10, 180, 25);
		panel12.add(tf_hatgiong12);
		
		bt_hatgiong12 = new JButton("ok\r\n");
		bt_hatgiong12.setBounds(193, 10, 58, 25);
		bt_hatgiong12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel12.add(bt_hatgiong12);
		
		JPanel panel13 = new JPanel();
		panel13.setLayout(null);
		panel13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel13.setBounds(571, 242, 261, 45);
		pad.add(panel13);
		
		tf_hatgiong13 = new JTextField();
		tf_hatgiong13.setText("Thầy Huấn - 10,084,200,000$");
		tf_hatgiong13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong13.setEditable(false);
		tf_hatgiong13.setColumns(10);
		tf_hatgiong13.setBounds(10, 10, 180, 25);
		panel13.add(tf_hatgiong13);
		
		bt_hatgiong13 = new JButton("ok\r\n");
		bt_hatgiong13.setBounds(193, 10, 58, 25);
		bt_hatgiong13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel13.add(bt_hatgiong13);
		
		JPanel panel14 = new JPanel();
		panel14.setLayout(null);
		panel14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel14.setBounds(571, 302, 261, 45);
		pad.add(panel14);
		
		tf_hatgiong14 = new JTextField();
		tf_hatgiong14.setText("Anh Bảnh - 70,589,400,000$");
		tf_hatgiong14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tf_hatgiong14.setEditable(false);
		tf_hatgiong14.setColumns(10);
		tf_hatgiong14.setBounds(10, 10, 180, 25);
		panel14.add(tf_hatgiong14);
		
		bt_hatgiong14 = new JButton("ok\r\n");
		bt_hatgiong14.setBounds(193, 10, 58, 25);
		bt_hatgiong14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel14.add(bt_hatgiong14);
		
		JPanel panel15 = new JPanel();
		panel15.setLayout(null);
		panel15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel15.setBounds(571, 358, 261, 45);
		pad.add(panel15);
		
		tf_hatgiong15 = new JTextField();
		tf_hatgiong15.setForeground(new Color(255, 0, 0));
		tf_hatgiong15.setText("??? - 5,576,562,600,000$");
		tf_hatgiong15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tf_hatgiong15.setEditable(false);
		tf_hatgiong15.setColumns(10);
		tf_hatgiong15.setBounds(10, 10, 180, 25);
		panel15.add(tf_hatgiong15);
		
		bt_hatgiong15 = new JButton("ok\r\n");
		bt_hatgiong15.setBounds(193, 10, 58, 25);
		bt_hatgiong15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel15.add(bt_hatgiong15);
        
		
		
        contentPane.add(pad);
        
        */
        		
		setContentPane(contentPane);
	}

}