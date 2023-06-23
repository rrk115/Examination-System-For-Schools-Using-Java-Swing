package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class teacherspage extends defaultFrame {
	teacherspage(){
		F.setTitle("TEACHERS LOGIN");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setSize(1200,600);
		F.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imgs\\photo.png"));
		lblNewLabel.setBounds(938, 73, 190, 166);
		F.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imgs\\cbse name.png"));
		lblNewLabel_1.setBounds(159, 25, 573, 214);
		F.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("imgs\\grades.png"));
		lblNewLabel_4.setBounds(53, 227, 213, 302);
		F.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ANSWER BOOKLET NO");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_5.setBounds(351, 292, 140, 28);
		F.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(351, 333, 203, 33);
		F.add(textArea);
		textArea.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("MARKS");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6.setBounds(687, 301, 60, 13);
		F.add(lblNewLabel_6);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(672, 333, 111, 33);
		F.add(textArea_1);
		textArea_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("GRADE");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_7.setBounds(923, 301, 60, 13);
		F.add(lblNewLabel_7);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(902, 332, 102, 35);
		F.add(textArea_2);
		textArea_2.setColumns(10);
		
		JButton btnNewButton = new JButton("UPDATE MARKS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection c = null;
				Statement stmt = null;
			      try {
			         Class.forName("org.postgresql.Driver");
			         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "1793");
			         stmt = c.createStatement();
			         String ansbno = textArea.getText();
			         int marks = Integer.parseInt(textArea_1.getText());
			         String grade = textArea_2.getText();
			         String sql = "UPDATE evaluation set marks = '"+marks+"', grade = '"+grade+"' where ans_booklet_num='"+ansbno+"'";
			         stmt.executeUpdate(sql);
			         String sql1 = "select * from examination where  ans_booklet_num='"+ansbno+"'";
			         ResultSet rs = stmt.executeQuery(sql1);
			         
			         String sql2 = "select * from teacher ";
			         ResultSet rs1 = stmt.executeQuery(sql2);
			         
			         while(rs1.next()) {
			         String name = rs1.getString("teacher_name");
			         String Qualification = rs1.getString("qualification");
			         
			         JLabel lblNewLabel_2 = new JLabel("*"+name);
			 		lblNewLabel_2.setBounds(826, 110, 89, 18);
			 		F.add(lblNewLabel_2);
			 		
			 		JLabel lblNewLabel_3 = new JLabel("*"+Qualification);
			 		lblNewLabel_3.setBounds(826, 139, 102, 18);
			 		F.add(lblNewLabel_3);
			         }
			         
			         if(rs.next()) {
			        	 JOptionPane.showMessageDialog(F,"SUCUUESSFULLY UPDATED");
			         }
			         else {
			        	 JOptionPane.showMessageDialog(F,"INVALID CREDITCS");
			         }
			         
			         
			         
			         
			      } catch (Exception e1) {
				         e1.printStackTrace();
				         System.err.println(e1.getClass().getName()+": "+e1.getMessage());
				         System.exit(0);
			      }
			}
		});
		
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnNewButton.setBounds(609, 453, 123, 28);
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
