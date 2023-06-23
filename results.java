package javaproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class results extends defaultFrame{
	
	results(){
		F.setTitle("RESULTS PAGE");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setTitle("RESULTS");
		F.setSize(800,600);
		F.setLayout(null);
		
		JTextField txtCbseBordOf = new JTextField();
		txtCbseBordOf.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		txtCbseBordOf.setText("CBSE BORD OF EXAMINATION");
		txtCbseBordOf.setBounds(237, 48, 247, 43);
		F.add(txtCbseBordOf);
		txtCbseBordOf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("HALLTICKET NUMBER");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(133, 181, 170, 38);
		F.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE OF BIRTH");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(133, 261, 170, 27);
		F.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(368, 181, 209, 32);
		F.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText(" ");
		textArea_1.setBounds(368, 261, 209, 31);
		F.add(textArea_1);
		
		JButton btnNewButton = new JButton("CHECK RESULTS");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection c = null;
				Statement stmt = null;
			      try {
			         Class.forName("org.postgresql.Driver");
			         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "1793");
			         stmt = c.createStatement();
			         String id = textArea.getText();
			         String dob = textArea_1.getText();
			         String sql = "select * from hall_ticket,student where hall_ticket.hall_ticket_num ='"+id+"' and student.date_of_birth ='"+dob+"' ";
			         ResultSet rs = stmt.executeQuery(sql);
			         
			         if(rs.next()) {
			        	 String name = rs.getString("first_name");
			        	 int id1 = rs.getInt("student_roll");
			        	 String stid = Integer.toString(id1);
			        	 Connection c1 = null;
							Statement stmt1 = null;
						      try {
						         Class.forName("org.postgresql.Driver");
						         c1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "1793");
						         stmt1 = c1.createStatement();
						         
						         String sql1 = "select * from evaluation where student_roll ='"+id1+"' ";
						         ResultSet rs1 = stmt.executeQuery(sql1);
						         
						         while(rs1.next()) {
						        	 
						        	 String ansbo = rs1.getString("ans_booklet_num");
						        	 int marks = rs1.getInt("marks");
						        	 String marks1 = Integer.toString(marks);
						        	 String grades = rs1.getString("grade");
						        	 JFrame l = new JFrame();
						        	 l.getContentPane().setBackground(new Color(255, 182, 193));
						           		l.setSize(800,600);
						           		l.setLayout(null);
						           		
						           		JLabel lblNewLabel = new JLabel("");
						           		lblNewLabel.setIcon(new ImageIcon("imgs\\photo.png"));
						           		lblNewLabel.setBounds(823, 52, 200, 182);
						           		l.add(lblNewLabel);
						           		
						           		JLabel lblNewLabel_1 = new JLabel("");
						           		lblNewLabel_1.setIcon(new ImageIcon("imgs\\cbse name.png"));
						           		lblNewLabel_1.setBounds(123, 63, 527, 129);
						           		l.add(lblNewLabel_1);
						           		
						           		JLabel lblNewLabel_2 = new JLabel("STUDENT ID     :");
						           		lblNewLabel_2.setBounds(287, 224, 128, 27);
						           		l.add(lblNewLabel_2);
						           		
						           		JLabel lblNewLabel_3 = new JLabel(stid);
						           		lblNewLabel_3.setBounds(414, 231, 101, 20);
						           		l.add(lblNewLabel_3);
						           		
						           		JLabel lblNewLabel_4 = new JLabel("STUDENT NAME :");
						           		lblNewLabel_4.setBounds(287, 282, 138, 27);
						           		l.add(lblNewLabel_4);
						           		
						           		JLabel lblNewLabel_5 = new JLabel(name);
						           		lblNewLabel_5.setBounds(414, 289, 109, 20);
						           		l.add(lblNewLabel_5);
						           		
						           		
						           		JLabel lblNewLabel_6 = new JLabel("MARKS");
						           		lblNewLabel_6.setBounds(287, 329, 150, 20);
						           		l.add(lblNewLabel_6);
						           		
						           		JLabel lblNewLabel_7 = new JLabel(marks1);
						           		lblNewLabel_7.setBounds(414, 329, 114, 20);
						           		l.add(lblNewLabel_7);
						           		
						           		
						           		JLabel lblNewLabel_8 = new JLabel("GRADE");
						           		lblNewLabel_8.setBounds(287, 373, 109, 20);
						           		l.add(lblNewLabel_8);
						           		
						           		JLabel lblNewLabel_9 = new JLabel(grades);
						           		lblNewLabel_9.setBounds(414, 377, 101, 16);
						           		l.add(lblNewLabel_9);
						           		
						           		JButton btnNewButton = new JButton("OK");
						           		btnNewButton.addActionListener(new ActionListener() {
						        			public void actionPerformed(ActionEvent e) {
						        				l.setVisible(false);
						        			}
						        		});
						           		btnNewButton.setBounds(379, 436, 101, 20);
						           		l.add(btnNewButton);
						           		JButton btnNewButton_1 = new JButton("BACK");
						        		btnNewButton_1.addActionListener(new ActionListener() {
						        			public void actionPerformed(ActionEvent e) {
						        				l.setVisible(false);
						        			}
						        		});
						        		btnNewButton_1.setBounds(10, 24, 85, 21);
						        		l.add(btnNewButton_1);
						           		l.setVisible(true);
						           		
						         }
						         
						      } catch (Exception e2) {
							         e2.printStackTrace();
							         System.err.println(e2.getClass().getName()+": "+e2.getMessage());
							         System.exit(0);
							      }
						      
			         }
			         else {
			        	 JOptionPane.showMessageDialog(F, "INVALID CREDITCS");
			         }
			         c.close();
			         stmt.close();
			         
			      } catch (Exception e1) {
				         e1.printStackTrace();
				         System.err.println(e1.getClass().getName()+": "+e1.getMessage());
				         System.exit(0);
				      }
			}
			
		});
		btnNewButton.setBounds(298, 390, 158, 38);
		F.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 24, 85, 21);
		F.add(btnNewButton_1);
		
		F.setVisible(true);
	}

}
