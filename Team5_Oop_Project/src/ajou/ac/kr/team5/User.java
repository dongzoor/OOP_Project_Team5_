package ajou.ac.kr.team5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class User implements ActionListener{
	
	JLabel label1 = new JLabel("Moon and Constellation");
	JLabel label2 = new JLabel("ID");
	JLabel label3 = new JLabel("PASSWORD:");
	JLabel label4 = new JLabel("NAME:");
	JLabel label5 = new JLabel("AGE:");
	JTextField tf1 = new JTextField(null,10);
	JTextField tf2 = new JTextField(null,10);
	JTextField tf3 = new JTextField(null,10);
	JTextField tf4 = new JTextField(null,10);
	JButton btn1 = new JButton("login");
	JButton btn2 = new JButton("Cancel");
	
	frame myFrame = new frame();
	
	String id;
	String password;
	String name;
	String age;
	ArrayList<Member> memberlist = new ArrayList();
	ArrayList<Member> checklist = new ArrayList();
	
	public void Save(ArrayList<Member> memberlist) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("user.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(memberlist);
        
        fos.close();
        oos.close();
        
	}
	
	public ArrayList<Member> Load (ArrayList<Member> memberlist) throws IOException, ClassNotFoundException{
		
	
	
		FileInputStream fis = new FileInputStream("user.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        memberlist = (ArrayList<Member>)ois.readObject();
        
        fis.close();
        ois.close();
       
        return memberlist;
	
	}
	
	public static void show(ArrayList<Member> memberlist) {
       
        System.out.println(" 전체 학생 출력");
        System.out.println("==========================================================");
        for (Member student : memberlist) {
            System.out.format("id : %s 이름 : %s 나이 : %s \n",student.getId(), student.getName(), student.getAge());
        }
        System.out.println("==========================================================");
    }
	
	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.UI();
	
		
	}
	
	public void UI() throws Exception{
	
		User user = new User();
		File f = new File("user.txt");
		if(f.isFile() == false){
		f.createNewFile();
		}
	
		
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

/*		
		checklist = user.Load(memberlist);	
		user.show(checklist);
		*/
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		User user = new User();
		if((JButton)e.getSource() == btn1){
			
			id = tf1.getText();
			password = tf2.getText();
			name = tf3.getText();
			age = tf4.getText();
			
			Member member = new Member(id,password,name,age);
			
			memberlist.add(member);

			try {
				user.Save(memberlist);
			} catch (Exception e1) {

				e1.printStackTrace();
			}
			
		}
		if((JButton)e.getSource() == btn2) 
			myFrame
	}
}
