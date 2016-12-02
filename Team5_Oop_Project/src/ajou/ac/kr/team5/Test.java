package ajou.ac.kr.team5;

import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Test {
	
	JButton btn1 = new JButton("Result");
	JButton btn2 = new JButton("Cancel");
	
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	JTextField tf6 = new JTextField();
	JTextField tf7 = new JTextField();
	JTextField tf8 = new JTextField();
	JTextField tf9 = new JTextField();
	JTextField tf10 = new JTextField();
	
	
	public Test() throws IOException{
		
		frame myFrame = new frame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(11,2));
		TitledBorder border = BorderFactory.createTitledBorder("Test");		
		panel.setBorder(border);
		
		int[] num = this.randomNumber();
		
		label1 = new JLabel(question(num[0]));
		label2 = new JLabel(question(num[1]));
		label3 = new JLabel(question(num[2]));
		label4 = new JLabel(question(num[3]));
		label5 = new JLabel(question(num[4]));
		label6 = new JLabel(question(num[5]));
		label7 = new JLabel(question(num[6]));
		label8 = new JLabel(question(num[7]));
		label9 = new JLabel(question(num[8]));
		label10 = new JLabel(question(num[9]));
	
		
		
		panel.add(label1);
		panel.add(tf1);
		panel.add(label2);
		panel.add(tf2);
		panel.add(label3);
		panel.add(tf3);
		panel.add(label4);
		panel.add(tf4);
		panel.add(label5);
		panel.add(tf5);
		panel.add(label6);
		panel.add(tf6);
		panel.add(label7);
		panel.add(tf7);
		panel.add(label8);
		panel.add(tf8);
		panel.add(label9);
		panel.add(tf9);
		panel.add(label10);
		panel.add(tf10);
		panel.add(btn1);
		panel.add(btn2);
		
		/*
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		*/
		myFrame.add(panel);
		myFrame.setSize(1500,1000);
		myFrame.setVisible(true);
		
	}
	
	public String question(int i) throws IOException{
		
		
	
			FileReader reader = new FileReader("question"+i+".txt");
			int n;
			String line;
			StringBuilder sb = new StringBuilder();
			
			while((n = reader.read()) != -1){
				
				sb.append((char)n);
			}
			
			line = sb.toString();
				
			String[] check = line.split(";");

			return check[0];
					
	}
	
	public int[] randomNumber(){
		
		int[] a = new int[10];
		Random r = new Random();
		
		for(int i=0;i<10;i++){
			
			a[i] = r.nextInt(10)+1;	
					
			for(int j=0; j<i;j++){
				
				if(a[i] == a[j]){
					
					i--;
				}
			}
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		
		try {
			Test test = new Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
