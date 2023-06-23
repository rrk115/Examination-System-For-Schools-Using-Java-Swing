package javaproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class schools {
	
	schools(){
		JFrame s = new JFrame();	
		s.setTitle("STUDENTS LOGIN");
		s.setSize(1600,900);
		s.getContentPane().setBackground(new Color(255, 182, 193));
		s.getContentPane().setLayout(null);
		
		s.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imgs\\cbse.png"));
		lblNewLabel.setBounds(229, 21, 1025, 195);
		s.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imgs\\school2 (1).jpg"));
		lblNewLabel_1.setBounds(99, 236, 350, 208);
		s.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("imgs\\school1.jpeg"));
		lblNewLabel_2.setBounds(613, 226, 350, 208);
		s.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("imgs\\school4.jpg"));
		lblNewLabel_3.setBounds(1144, 226, 320, 195);
		s.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("imgs\\school5.jpg"));
		lblNewLabel_4.setBounds(99, 529, 350, 185);
		s.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("imgs\\school3.jpg"));
		lblNewLabel_5.setBounds(628, 529, 330, 195);
		s.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("KKR CBSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\bg1.png"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(314, 44, 526, 117);
				contentPane.add(lblNewLabel);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2011, KKR Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130340. Address of the school is: Guntur. PIN Code: 516115. Email address of the school is kkrcbse501@gmail.com. The school is being managed by V Subhash kovid, SK Educational Soceity, Guntur.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setBounds(195, 471, 115, 21);
		s.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("imgs\\school6.jpg"));
		lblNewLabel_6.setBounds(1133, 529, 344, 185);
		s.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("TSBD CBSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\school1.jpg"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2009, TSBD Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130360. Address of the school is: KOTHAGUDEM. PIN Code: 500085. Email address of the school is tsbdcbse511@gmail.com. The school is being managed by NAVEEN, NK Educational Soceity, KOTHAGUDEM.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				
				JLabel lblNewLabel = new JLabel("");
				contentPane.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(304, 86, 526, 117);
				
				JLabel lblNewLabel_1 = new JLabel("");
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\tsbd.png"));
				lblNewLabel_1.setBounds(37, 203, 354, 500);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setBounds(739, 471, 124, 21);
		s.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("KRLCLK CBSE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\best-cbse-schools-in-bangalore.jpg"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2010, KRLCLK Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130390. Address of the school is: CHALAKKUDI. PIN Code: 680307. Email address of the school is krlclkcbse682@gmail.com. The school is being managed by VISHAL, MSD Educational Soceity, Trissur.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				
				JLabel lblNewLabel_1 = new JLabel("");
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\krlclk.png"));
				lblNewLabel_1.setBounds(37, 203, 354, 500);
				
				JLabel lblNewLabel = new JLabel("");
				contentPane.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(156, 21, 526, 117);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setBounds(1227, 431, 142, 28);
		s.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("RAJU CBSE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\Downloads\\5.jpg"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2010, RAJU Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130350. Address of the school is: Rajampet. PIN Code: 516360. Email address of the school is rajucbse502@gmail.com. The school is being managed by R kowshik, RK Educational Soceity, Cuddapah.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				
				JLabel lblNewLabel_1 = new JLabel("");
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\raju.png"));
				lblNewLabel_1.setBounds(37, 203, 354, 500);
				
				JLabel lblNewLabel = new JLabel("");
				contentPane.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(469, 64, 526, 117);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 69, 0));
		btnNewButton_3.setBounds(739, 742, 124, 21);
		s.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("KRLALP CBSE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\Downloads\\4.jpg"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2012, KRLALP Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130380. Address of the school is: ALAPPUZHA. PIN Code: 688001. Email address of the school is krlalpcbse681@gmail.com. The school is being managed by MOHAN, MB Educational Soceity, ALAPPUZHA.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				
				JLabel lblNewLabel_1 = new JLabel("");
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\krlalp.png"));
				lblNewLabel_1.setBounds(37, 203, 354, 500);
				
				JLabel lblNewLabel = new JLabel("");
				contentPane.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(612, 31, 526, 117);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton_4.setBackground(new Color(255, 69, 0));
		btnNewButton_4.setBounds(195, 742, 124, 21);
		s.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("TSCISGAR CBSE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
				JLabel contentPane = new JLabel();
				contentPane.setBounds(0, 0, 1186, 763);
				contentPane.setIcon(new ImageIcon("imgs\\6.jfif"));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				f.getContentPane().add(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnFoundedIn = new JTextPane();
				contentPane.add(txtpnFoundedIn);
				txtpnFoundedIn.setForeground(new Color(255, 127, 80));
				txtpnFoundedIn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
				txtpnFoundedIn.setText("Founded in 2010, TSCIGAR Techno School is a Secondary School, affiliated to CBSE. Affiliation ID is 130370. Address of the school is: PIDUGURALA. PIN Code: 500080. Email address of the school is tscigarcbse512@gmail.com. The school is being managed by SASHANK, SR Educational Soceity, KOTHAGUDEM.");
				txtpnFoundedIn.setBounds(499, 401, 635, 147);
				
				JLabel lblNewLabel_1 = new JLabel("");
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\tscisgar.png"));
				lblNewLabel_1.setBounds(37, 203, 354, 500);
				
				JLabel lblNewLabel = new JLabel("");
				contentPane.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(660, 10, 526, 117);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(255, 127, 80));
				btnNewButton.setBounds(41, 34, 131, 33);
				contentPane.add(btnNewButton);
				f.setVisible(true);
			}
		});
		btnNewButton_5.setBackground(new Color(255, 69, 0));
		btnNewButton_5.setBounds(1227, 742, 142, 21);
		s.getContentPane().add(btnNewButton_5);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setVisible(false);
		
			}
		});
		back.setBounds(10, 20, 85, 21);
		s.add(back);
		s.setVisible(true);
	}

}
