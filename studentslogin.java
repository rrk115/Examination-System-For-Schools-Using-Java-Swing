package javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;




public class studentslogin extends defaultFrame{
	
	studentslogin(){
		
		F.setTitle("STUDENTS LOGIN");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setSize(800,600);
		F.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT ID");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(169, 171, 155, 33);
		F.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE OF BIRTH");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(169, 268, 155, 44);
		F.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(389, 171, 252, 33);
		F.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(389, 280, 252, 32);
		F.add(textArea_1);
		
		
		JTextArea txtrCbseBoardOf = new JTextArea();
		txtrCbseBoardOf.setForeground(new Color(0, 0, 0));
		txtrCbseBoardOf.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		txtrCbseBoardOf.setLineWrap(true);
		txtrCbseBoardOf.setWrapStyleWord(true);
		txtrCbseBoardOf.setText("               CBSE BOARD OF EXAMINATION");
		txtrCbseBoardOf.setBounds(209, 25, 432, 44);
		F.add(txtrCbseBoardOf);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection c2 = null;
				Statement stmt2 = null;
			      try {
			         Class.forName("org.postgresql.Driver");
			         c2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "1793");
			         stmt2 = c2.createStatement();
			         int id = Integer.parseInt(textArea.getText());
			         String dob = textArea_1.getText();
			         String sql = "select * from student where student_roll ='"+id+"' and date_of_birth ='"+dob+"' ";
			         ResultSet rs2 = stmt2.executeQuery(sql);
			         
			         if(rs2.next()) {
			        	 
			        	 
			        	 new studentspage();
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
		btnNewButton.setBounds(311, 442, 155, 33);
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
