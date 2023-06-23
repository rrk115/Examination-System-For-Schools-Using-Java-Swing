package javaproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;




public class mainpage extends defaultFrame{
	
	
	
	public mainpage() {
		F.setTitle("CBSE BOARD OF EXAMINATION");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setSize(1600,900);
		F.setLayout(null);
		
		JMenuBar mb = new JMenuBar();
		mb.setBackground(new Color(255, 182, 193));
		menu = new JMenu("CBSE SCHOOLS");
		menu.setForeground(SystemColor.windowText);
		menu.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		menu1 = new JMenu("EXAMINATIONS");
		menu1.setForeground(SystemColor.windowText);
		menu1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		menu2 = new JMenu("DASH BOARD");
		menu2.setForeground(SystemColor.windowText);
		menu2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		menu3 = new JMenu("LOG IN");
		menu3.setForeground(SystemColor.windowText);
		menu3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		menu4 = new JMenu("CONTACT US");
		menu4.setForeground(SystemColor.windowText);
		menu4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		i1 = new JMenuItem("STUDENT");
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentslogin();
			}
		});
		i2 =new JMenuItem("TEACHER");
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new teacherlogin();
			}
		});
		i3 = new JMenuItem("CBSE OFFICE");
		i3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(F, "Address : Shiksha Kendra, 2, Community Centre,Preet Vihar, Delhi - 110092\r\n"
						+ "Enquiry : 011-22509256, 22509257, 22509258, 22509259\r\n"
						+ "CBSE Helpline Number : 1800-11-8002\r\n"
						+ "Email ID : info[dot]cbse[at]gov[dot]in");
			}
		});
		i4 = new JMenuItem("CBSE HELP LINE NUMBER");
		i4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(F, "Address : Shiksha Kendra, 2, Community Centre,Preet Vihar, Delhi - 110092\r\n"
						+ "Enquiry : 011-22509256, 22509257, 22509258, 22509259\r\n"
						+ "CBSE Helpline Number : 1800-11-8002\r\n"
						+ "Email ID : info[dot]cbse[at]gov[dot]in");
			}
		});
		i5 = new JMenuItem("FOR ENQUIRY");
		i5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(F, "Address : Shiksha Kendra, 2, Community Centre,Preet Vihar, Delhi - 110092\r\n"
						+ "Enquiry : 011-22509256, 22509257, 22509258, 22509259\r\n"
						+ "CBSE Helpline Number : 1800-11-8002\r\n"
						+ "Email ID : info[dot]cbse[at]gov[dot]in");
			}
		});
		i7 = new JMenuItem("SYLLABUS");
		i8 = new JMenuItem("INSTRUCTIONS");
		i8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.getContentPane().setBackground(new Color(255, 182, 193));
				f.setSize(1200,800);
				f.getContentPane().setLayout(null);
			
				
				JLabel lblNewLabel = new JLabel("");
				f.getContentPane().add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(364, 31, 526, 117);
				
				JLabel lblNewLabel_1 = new JLabel("");
				f.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\instructions.jpg"));
				lblNewLabel_1.setBounds(51, 144, 880, 609);
				
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setBounds(51, 47, 124, 35);
				f.getContentPane().add(btnNewButton);
				f.setVisible(true);
				
			}
		});
		i9 = new JMenuItem("SCHOOLS");
		menu.add(i9);
		i9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new schools();
			}
		});
		i0 = new JMenuItem("PIE CHART");
		i0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.getContentPane().setBackground(new Color(255, 182, 193));
				f.setSize(1416,798);
				f.getContentPane().setLayout(null);
			
				
				JLabel lblNewLabel = new JLabel("");
				f.getContentPane().add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("imgs\\cbse name.png"));
				lblNewLabel.setBounds(364, 31, 526, 117);
				
				JLabel lblNewLabel_1 = new JLabel("");
				f.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("imgs\\pi.png"));
				lblNewLabel_1.setBounds(329, 185, 657, 506);
				
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
					}
				});
				btnNewButton.setBounds(51, 47, 124, 35);
				f.getContentPane().add(btnNewButton);
				f.setVisible(true);
			}
		});
		menu1.add(i7);menu1.add(i8);
		menu2.add(i0);
		menu3.add(i1);menu3.add(i2);;
		menu4.add(i3);menu4.add(i4);menu4.add(i5);
		
		mb.add(menu);
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		mb.add(menu4);
		F.setJMenuBar(mb);
		mb.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imgs\\cbse.png"));
		lblNewLabel.setBounds(277, 80, 1076, 205);
		F.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIcon(new ImageIcon("imgs\\home.png"));
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 10, 111, 39);
		F.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOWNLOAD HALLTICKET");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Hallticketpage();
			}
		});
		btnNewButton_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(41, 610, 203, 46);
		F.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
	    lblNewLabel_1.setIcon(new ImageIcon("imgs\\sb.png"));
		lblNewLabel_1.setBounds(1025, 17, 142, 78);
		F.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("imgs\\cbse logo 2.png"));
		lblNewLabel_2.setBounds(1426, 10, 104, 95);
		F.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("imgs\\75.png"));
		lblNewLabel_3.setBounds(1214, 3, 159, 107);
		F.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("imgs\\mainpage1.png"));
		lblNewLabel_4.setBounds(220, 307, 320, 231);
		F.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("imgs\\mainpage2.png"));
		lblNewLabel_5.setBounds(609, 307, 365, 231);
		F.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("imgs\\mainpage3.png"));
		lblNewLabel_6.setBounds(1082, 307, 357, 231);
		F.add(lblNewLabel_6);
		F.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainpage();

	}

}
