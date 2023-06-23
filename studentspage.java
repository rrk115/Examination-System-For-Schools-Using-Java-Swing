package javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class studentspage extends defaultFrame{
	
	
	
	  studentspage(){
		
		F.setTitle("STUDENTS LOGIN");
		F.getContentPane().setBackground(new Color(255, 182, 193));
		F.setSize(800,600);
		F.setLayout(null);
		
		JButton btnNewButton = new JButton("CHECK RESULTS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new results();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(50, 236, 281, 49);
		F.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOWNLOAD HALLTICKET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Hallticketpage();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(439, 236, 281, 49);
		F.add(btnNewButton_1);
		
		JTextField txtCbseBoardOf = new JTextField();
		txtCbseBoardOf.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		txtCbseBoardOf.setText("CBSE BOARD OF EXAMINATION");
		txtCbseBoardOf.setBounds(274, 51, 256, 58);
		F.add(txtCbseBoardOf);
		txtCbseBoardOf.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.setVisible(false);
		
			}
		});
		btnNewButton_2.setBounds(10, 20, 85, 21);
		F.add(btnNewButton_2);
		F.setVisible(true);
	}

}
