package ajou.ac.kr.team5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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

public class Join implements ActionListener{
	
	JLabel label1 = new JLabel("         Join");
	JLabel label2 = new JLabel("ID");
	JLabel label3 = new JLabel("PASSWORD:");
	JLabel label4 = new JLabel("NAME");
	JLabel label5 = new JLabel("AGE");
	
	JTextField tf1 = new JTextField(null,10);
	JTextField tf2 = new JTextField(null,10);
	JTextField tf3 = new JTextField(null,10);
	JTextField tf4 = new JTextField(null,10);
	
	JButton btn1 = new JButton("Join");
	JButton btn2 = new JButton("Cancel");
	
	frame myFrame = new frame();
	
	String id;
	String password;
	String name;
	String age;
	

	public static void main(String[] args) throws Exception {
		
		Join user = new Join();
		user.UI();
	

	}
	
	public void UI() throws Exception{
	
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,2));
		TitledBorder border = BorderFactory.createTitledBorder("User");		
		panel.setBorder(border);
		panel.add(label1);
		panel.add(new JPanel());
		panel.add(label2);
		panel.add(tf1);
		panel.add(label3);
		panel.add(tf2);
		panel.add(label4);
		panel.add(tf3);
		panel.add(label5);
		panel.add(tf4);
		panel.add(btn1);
		panel.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		myFrame.add(panel);
		myFrame.setSize(350,450);
		myFrame.setVisible(true);
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Join join = new Join();
		if((JButton)e.getSource() == btn1){
			
			id = tf1.getText();
			password = tf2.getText();
			name = tf3.getText();
			age = tf4.getText();
			
			
			try {
				FileWriter writer = new FileWriter(id+".txt",true);
				
				char a = ';';
				writer.write(id+a);
				writer.write(password+a);
				writer.write(name+a);
				writer.write(age+a);
		        
		        writer.close();
				
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
			

			
		}
		if((JButton)e.getSource() == btn2){
	
			int i = JOptionPane.showConfirmDialog(myFrame, "Are you sure to close the app ?", "Exit",  JOptionPane.YES_NO_OPTION);
		
			if( i == JOptionPane.OK_OPTION ) System.exit(0); 
			
		}
	
	}	
}
