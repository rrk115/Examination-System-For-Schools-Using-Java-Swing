package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class teacherlogin extends defaultFrame{
	teacherlogin(){
		
		F.setTitle("TEACHERS LOGIN");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setSize(800,600);
		F.setLayout(null);
		
		JTextArea txtrCbseBoardOf = new JTextArea();
		txtrCbseBoardOf.setForeground(new Color(0, 0, 0));
		txtrCbseBoardOf.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		txtrCbseBoardOf.setLineWrap(true);
		txtrCbseBoardOf.setWrapStyleWord(true);
		txtrCbseBoardOf.setText("               CBSE BOARD OF EXAMINATION");
		txtrCbseBoardOf.setBounds(209, 25, 432, 44);
		F.add(txtrCbseBoardOf);
		
		JLabel lblNewLabel = new JLabel("TEACHER ID");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(169, 171, 155, 33);
		F.add(lblNewLabel);
		

		JTextArea textArea = new JTextArea();
		textArea.setBounds(389, 171, 252, 33);
		F.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("SCHOOL ID");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(169, 261, 139, 24);
		F.add(lblNewLabel_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(389, 252, 252, 33);
		F.add(textArea_2);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection c3 = null;
				Statement stmt3 = null;
			      try {
			         Class.forName("org.postgresql.Driver");
			         c3 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "1793");
			         stmt3 = c3.createStatement();
			         int tid = Integer.parseInt(textArea.getText());
			         int sid = Integer.parseInt(textArea_2.getText());
			         String sql = "select * from teacher where teacher_id ='"+tid+"' and school_id ='"+sid+"' ";
			         ResultSet sk = stmt3.executeQuery(sql);
			         
			         if(sk.next()) {
			        	 
			        	 
			        	 new teacherspage();
			         }
			         else {
			        	 JOptionPane.showMessageDialog(F, "INVALID CREDITCS");
			         }
			         
			         
			      } catch (Exception e1) {
				         e1.printStackTrace();
				         System.err.println(e1.getClass().getName()+": "+e1.getMessage());
				         System.exit(0);
				      }
			}
		});
		btnNewButton.setBounds(267, 360, 155, 33);
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
