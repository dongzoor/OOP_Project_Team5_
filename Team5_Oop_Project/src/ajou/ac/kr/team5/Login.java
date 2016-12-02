package ajou.ac.kr.team5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Login implements ActionListener{
	
	JLabel label1 = new JLabel("  Moon and Constellation");
	JLabel label2 = new JLabel("ID");
	JLabel label3 = new JLabel("PASSWORD:");

	
	JTextField tf1 = new JTextField(null,10);
	JTextField tf2 = new JTextField(null,10);

	
	JButton btn1 = new JButton("login");
	JButton btn2 = new JButton("Cancel");
	
	frame myFrame = new frame();
	
	String id;
	String password;
	
	boolean flag = false;
	
	public static void main(String[] args) throws Exception {
		
		Login user = new Login();
		user.UI();
	

	}
	
	public void UI() throws Exception{
	

	
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,2));
		TitledBorder border = BorderFactory.createTitledBorder("Login");		
		panel.setBorder(border);
		panel.add(label1);
		panel.add(new JPanel());
		panel.add(label2);
		panel.add(tf1);
		panel.add(label3);
		panel.add(tf2);

		panel.add(btn1);
		panel.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		myFrame.add(panel);
		myFrame.setSize(350,450);
		myFrame.setVisible(true);

		
	}
	
	public void checkUser(){
	
			
		id = tf1.getText();
		password = tf2.getText();
		File f = new File(id+".txt");
		
		if(f.exists() == true){
			
			try {
				FileReader reader = new FileReader(tf1.getText()+".txt");
				
				int i;
				String line;
				StringBuilder sb = new StringBuilder();
				
				while((i = reader.read()) != -1){
					
					sb.append((char)i);
				}
				
				line = sb.toString();
				
				
				String[] check = line.split(";");
				
				
				if(check[0].equals(id) && check[1].equals(password))
					flag = true;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}
		
		        
		   
		      
	}	
		
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if((JButton)e.getSource() == btn1){
	
			checkUser();
			
			if(flag == true)
				JOptionPane.showMessageDialog(myFrame, "***  Login! ***");
			
			else{
				int i = JOptionPane.showConfirmDialog(myFrame, " You have to join", "*** There is no ID ***",
						JOptionPane.YES_NO_OPTION);
				if(i == JOptionPane.OK_OPTION){
					
					Join join = new Join();
					try {
						
						join.UI();
						myFrame.setVisible(false);
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
					
			
			}
			
			
		}
		if((JButton)e.getSource() == btn2){ 
	
			int i = JOptionPane.showConfirmDialog(myFrame, "Are you sure to close the app ?", "Exit",  JOptionPane.YES_NO_OPTION);
		
			if( i == JOptionPane.OK_OPTION ) System.exit(0); 
			
		}
	
	}	
}
