import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import images.*;

public class Home extends JFrame {
	
	// chỉnh ảnh thông qua lớp Img_PathGiver cho tiện
	private static Img_Giver imgGiver = new Img_Giver();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lb_mota1;
	private JLabel lb_anh1;
	private JPanel plot2;
	private JLabel lb_anh2;
	private JLabel lb_mota2;
	private JPanel plot3;
	private JLabel lb_anh3;
	private JLabel lb_mota3;
	private JPanel plot4;
	private JLabel lb_anh4;
	private JLabel lb_mota4;
	private JPanel plot5;
	private JLabel lb_anh5;
	private JLabel lb_mota5;
	private JPanel plot6;
	private JLabel lb_anh6;
	private JLabel lb_mota6;
	private JPanel plot7;
	private JLabel lb_anh7;
	private JLabel lb_mota7;
	private JPanel plot8;
	private JLabel lb_anh8;
	private JLabel lb_mota8;
	private JPanel plot9;
	private JLabel lb_anh9;
	private JLabel lb_mota9;
	private JPanel plot10;
	private JLabel lb_anh10;
	private JLabel lb_mota10;
	private JPanel menuPad;
	private JButton bt_Home_Crop;
	private JButton bt_Win;
	private JLabel lb_tien;
	private JLabel lb_giongCayTrong;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private static void Introduction() {
		// Chuẩn bị JFrame
		JFrame jframe = new JFrame(":3");
		
		// Chuẩn bị JLabel, để chỉnh ảnh một cách đa năng
		JLabel lb_anh = new JLabel();
		lb_anh.setBounds(10, 10, 845, 219);
		
		Introduction intro = new Introduction();
		
		imgGiver.imgNhau(lb_anh);
		intro.scene(jframe, lb_anh, "cốt truyện", "Trong 1 buổi nhậu , bạn uống 5 lon bia trong 1 quãng thời gian ngắn\r\n\r\nsau đó bạn cảm thấy người say như điếu đổ, bạn ngồi đó, từ từ khép 2 đôi mắt nặng trĩu của bạn lại...", "Tiếp tục");
		
		imgGiver.imgwhite(lb_anh);
		intro.scene(jframe, lb_anh, "...", "zzz", "Tiếp tục");
		
		imgGiver.imgwhite(lb_anh);
		intro.scene(jframe, lb_anh, "...", "zzzzzzzzzzzzzzzzzzzzzzzz", "Tiếp tục");
		
		imgGiver.imgwhite(lb_anh);
		intro.scene(jframe, lb_anh, "...", "zzzzz", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "BÙM", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "Bạn tỉnh giấc!", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "NGƯỜI BÍ ẨN: chà ngươi đã tỉnh dậy rồi sao!.", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "Bạn: Ngươi, NGƯƠI LÀ AI!", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "NGƯỜI BÍ ẨN: ta là ai không quan trọng , điều quan trọng ở đây là NGƯƠI, mắc nợ ta 9 kiếp rồi mà chưa chịu trả", "hả");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "Bạn: hả?", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "NGƯỜI BÍ ẨN: mà điều đó hiện tại không quan trọng, bây giờ ta sẽ cho ngươi 10$, đô la USA xịn xò con bò luôn !", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "Bạn: Thiệt không?", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "NGƯỜI BÍ ẨN: thiệt, đổi lại ngươi sẽ nợ ta 10000$ !!!", "NANIIIIIII");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "Bạn: NANI !!!", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		intro.scene(jframe, lb_anh, "NGƯỜI BÍ ẨN ???", "NGƯỜI BÍ ẨN: Được rồi, bây giờ hãy ĐI RA NGOÀI ĐỒNG VÀ LÀM VIỆC CHO TA, ta ngồi chờ ở trong này, ta giao nhiệm vụ cho ngươi là kiếm 10000$ và trả lại cho ta :D", "Tiếp tục");
	}

	
	// Bảo để sẵn method Win() đây, khi nào phá đảo game thì chạy.
	private static void Win() {
		// Chuẩn bị JFrame
		JFrame jframe = new JFrame(":3");
		
		// Chuẩn bị JLabel, để chỉnh ảnh một cách đa năng
		JLabel lb_anh = new JLabel();
		lb_anh.setBounds(10, 10, 845, 219);
		
		Win win = new Win();
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN: chà hãy nhìn vào ngươi xem...", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN:...", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN: Nhà người còn chờ gì nữa?, mau đưa cho ta, cái túi đó, TÚI CHỨA TIỀN !!!", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "(bạn đưa túi tiền chứa nhiều hơn 10000$ cho người bí ẩn...)", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN:...", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN:.......", "...");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "kết thúc.", "NGƯỜI BÍ ẨN: E Hèm, được rồi...", "Tiếp tục");
		
		imgGiver.imgTheDealer(lb_anh);
		win.scene(jframe, lb_anh, "???", "(Người bí ẩn dần dần lộ diện...)", "Tiếp tục");
		
		imgGiver.imgcat1(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: Nhà ngươi có thể đi...", ":3");
		
		imgGiver.imgcat1(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: Mặc dầu...", ":3");
		
		imgGiver.imgcat1(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: ...", ":3");
		
		imgGiver.imgcat1(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: Ta đã hy vọng ngươi là người có khả năng sẽ đạt tới hạt giống \"???\" thứ 15 đấy cơ", ":3");
		
		imgGiver.imgcat1(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: ...", ":3");
		
		imgGiver.imgcat2(lb_anh);
		win.scene(jframe, lb_anh, "MÈO CON !!!", "MÈO CON: TA CUỐI CÙNG CŨNG CÓ TIỀN ĐI ĐÁNH BI-DA RỒI, CẢM ƠN NHÀ NGƯƠI NHIỀU !!!", ":3");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "(Mèo con chạy mất tiêu...)", ":3");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "chạy mất tiêu...", ":3");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "mất tiêu...", ":3");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "tiêu...", "...");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "...", ".");
		
		imgGiver.imgwhite(lb_anh);
		win.scene(jframe, lb_anh, "CHÚC MỪNG BẠN ĐÃ CHIẾN THẮNG GAME", "...", "");
		
		JOptionPane.showMessageDialog(null, "Side Java project được Re-code bởi: Cao Hoàng Phước Bảo, Dương Đính, Lê Hữu Anh Tú.", "Credits", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);	
	}
	
	
	@SuppressWarnings("static-access")
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 800);
		setResizable(false);
		setIconImage((new ImageIcon(imgGiver.pathCanon + "\\src\\images\\cat2.jpeg")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel plot1 = new JPanel();
		plot1.setBounds(50, 45, 216, 221);
		contentPane.add(plot1);
		plot1.setLayout(null);
		
		lb_anh1 = new JLabel("");
		lb_anh1.setOpaque(true);
		lb_anh1.setBackground(new Color(192, 192, 192));
		lb_anh1.setBounds(10, 10, 196, 160);
		plot1.add(lb_anh1);
		
		lb_mota1 = new JLabel("waiting for input...");
		lb_mota1.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota1.setBounds(10, 180, 196, 31);
		plot1.add(lb_mota1);
		
		plot2 = new JPanel();
		plot2.setLayout(null);
		plot2.setBounds(355, 45, 216, 221);
		contentPane.add(plot2);
		
		lb_anh2 = new JLabel("");
		lb_anh2.setOpaque(true);
		lb_anh2.setBackground(Color.LIGHT_GRAY);
		lb_anh2.setBounds(10, 10, 196, 160);
		plot2.add(lb_anh2);
		
		lb_mota2 = new JLabel("waiting for input...");
		lb_mota2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota2.setBounds(10, 180, 196, 31);
		plot2.add(lb_mota2);
		
		plot3 = new JPanel();
		plot3.setLayout(null);
		plot3.setBounds(650, 45, 216, 221);
		contentPane.add(plot3);
		
		lb_anh3 = new JLabel("");
		lb_anh3.setOpaque(true);
		lb_anh3.setBackground(Color.LIGHT_GRAY);
		lb_anh3.setBounds(10, 10, 196, 160);
		plot3.add(lb_anh3);
		
		lb_mota3 = new JLabel("waiting for input...");
		lb_mota3.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota3.setBounds(10, 180, 196, 31);
		plot3.add(lb_mota3);
		
		plot4 = new JPanel();
		plot4.setLayout(null);
		plot4.setBounds(950, 45, 216, 221);
		contentPane.add(plot4);
		
		lb_anh4 = new JLabel("");
		lb_anh4.setOpaque(true);
		lb_anh4.setBackground(Color.LIGHT_GRAY);
		lb_anh4.setBounds(10, 10, 196, 160);
		plot4.add(lb_anh4);
		
		lb_mota4 = new JLabel("waiting for input...");
		lb_mota4.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota4.setBounds(10, 180, 196, 31);
		plot4.add(lb_mota4);
		
		plot5 = new JPanel();
		plot5.setLayout(null);
		plot5.setBounds(1248, 45, 216, 221);
		contentPane.add(plot5);
		
		lb_anh5 = new JLabel("");
		lb_anh5.setOpaque(true);
		lb_anh5.setBackground(Color.LIGHT_GRAY);
		lb_anh5.setBounds(10, 10, 196, 160);
		plot5.add(lb_anh5);
		
		lb_mota5 = new JLabel("waiting for input...");
		lb_mota5.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota5.setBounds(10, 180, 196, 31);
		plot5.add(lb_mota5);
		
		plot6 = new JPanel();
		plot6.setLayout(null);
		plot6.setBounds(50, 320, 216, 221);
		contentPane.add(plot6);
		
		lb_anh6 = new JLabel("");
		lb_anh6.setOpaque(true);
		lb_anh6.setBackground(Color.LIGHT_GRAY);
		lb_anh6.setBounds(10, 10, 196, 160);
		plot6.add(lb_anh6);
		
		lb_mota6 = new JLabel("waiting for input...");
		lb_mota6.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota6.setBounds(10, 180, 196, 31);
		plot6.add(lb_mota6);
		
		plot7 = new JPanel();
		plot7.setLayout(null);
		plot7.setBounds(355, 320, 216, 221);
		contentPane.add(plot7);
		
		lb_anh7 = new JLabel("");
		lb_anh7.setOpaque(true);
		lb_anh7.setBackground(Color.LIGHT_GRAY);
		lb_anh7.setBounds(10, 10, 196, 160);
		plot7.add(lb_anh7);
		
		lb_mota7 = new JLabel("waiting for input...");
		lb_mota7.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota7.setBounds(10, 180, 196, 31);
		plot7.add(lb_mota7);
		
		plot8 = new JPanel();
		plot8.setLayout(null);
		plot8.setBounds(650, 320, 216, 221);
		contentPane.add(plot8);
		
		lb_anh8 = new JLabel("");
		lb_anh8.setOpaque(true);
		lb_anh8.setBackground(Color.LIGHT_GRAY);
		lb_anh8.setBounds(10, 10, 196, 160);
		plot8.add(lb_anh8);
		
		lb_mota8 = new JLabel("waiting for input...");
		lb_mota8.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota8.setBounds(10, 180, 196, 31);
		plot8.add(lb_mota8);
		
		plot9 = new JPanel();
		plot9.setLayout(null);
		plot9.setBounds(950, 320, 216, 221);
		contentPane.add(plot9);
		
		lb_anh9 = new JLabel("");
		lb_anh9.setOpaque(true);
		lb_anh9.setBackground(Color.LIGHT_GRAY);
		lb_anh9.setBounds(10, 10, 196, 160);
		plot9.add(lb_anh9);
		
		lb_mota9 = new JLabel("waiting for input...");
		lb_mota9.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota9.setBounds(10, 180, 196, 31);
		plot9.add(lb_mota9);
		
		plot10 = new JPanel();
		plot10.setLayout(null);
		plot10.setBounds(1248, 320, 216, 221);
		contentPane.add(plot10);
		
		lb_anh10 = new JLabel("");
		lb_anh10.setOpaque(true);
		lb_anh10.setBackground(Color.LIGHT_GRAY);
		lb_anh10.setBounds(10, 10, 196, 160);
		plot10.add(lb_anh10);
		
		lb_mota10 = new JLabel("waiting for input...");
		lb_mota10.setHorizontalAlignment(SwingConstants.CENTER);
		lb_mota10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb_mota10.setBounds(10, 180, 196, 31);
		plot10.add(lb_mota10);
		
		menuPad = new JPanel();
		menuPad.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		menuPad.setBackground(new Color(243, 251, 254));
		menuPad.setBounds(30, 571, 1440, 180);
		contentPane.add(menuPad);
		menuPad.setLayout(null);
		
		bt_Home_Crop = new JButton("");
		bt_Home_Crop.setBounds(10, 10, 85, 60);
		imgGiver.imgsprout(bt_Home_Crop);
		bt_Home_Crop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
				JFrame jframe = new JFrame(":3");
				
				Home_Crop homeCrop = new Home_Crop();
				homeCrop.ChooseCrop(jframe);
				
			}
		});
		menuPad.add(bt_Home_Crop);
		
		bt_Win = new JButton("");
		bt_Win.setBounds(1340, 10, 85, 60);
		imgGiver.imgTheDealer_bt(bt_Win);
		bt_Win.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
				Win();
			}
		});
		menuPad.add(bt_Win);
		
		lb_tien = new JLabel("Tiền của bạn: ?? $");
		lb_tien.setHorizontalAlignment(SwingConstants.CENTER);
		lb_tien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lb_tien.setBounds(186, 20, 1033, 37);
		menuPad.add(lb_tien);
		
		lb_giongCayTrong = new JLabel("Giống cây trồng được chọn: None");
		lb_giongCayTrong.setHorizontalAlignment(SwingConstants.CENTER);
		lb_giongCayTrong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lb_giongCayTrong.setForeground(new Color(0, 196, 0));
		lb_giongCayTrong.setBounds(186, 67, 1033, 37);
		menuPad.add(lb_giongCayTrong);
		
		
		
		// sau UI đã load xong, bắt đầu chạy phần giới thiệu
		Introduction();
		
		
		
		
		
	}
}