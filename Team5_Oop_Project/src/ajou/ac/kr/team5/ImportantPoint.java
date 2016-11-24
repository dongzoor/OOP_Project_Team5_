package ajou.ac.kr.team5;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ImportantPoint implements ActionListener{
	
	frame myFrame = new frame();
	JButton btn1 = new JButton("Moon Phase");
	JButton btn2 = new JButton("Constellation");
	MoonPhase mp = new MoonPhase();
    Constellation cs = new Constellation();
    JPanel panel = new JPanel();
    
	public ImportantPoint(){		
	
		
		
		myFrame.add(mp);
		panel.add(btn1);
		panel.add(btn2);
		myFrame.add(BorderLayout.SOUTH,panel);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		myFrame.setSize(1500,1500);
		myFrame.setVisible(true);
		myFrame.setResizable(true);
	}
	
	public static void main(String[] args) {
		ImportantPoint ip = new ImportantPoint();
		
	}
	
	class MoonPhase extends JPanel{
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);

			Image myImage = new ImageIcon("moon_phase.jpg").getImage();
			g.drawImage(myImage, 30, 30, this);
			
		}
		
	}
	
	class Constellation extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);

			Image myImage = new ImageIcon("constellation.jpg").getImage();
			g.drawImage(myImage, 30, 30, this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if((JButton)e.getSource() == btn1){
			
			myFrame.remove(mp);
			myFrame.remove(cs);
			myFrame.add(mp);
			panel.add(btn1);
			panel.add(btn2);
			myFrame.add(BorderLayout.SOUTH,panel);
			
		}
		if((JButton)e.getSource() == btn2){
			
			myFrame.remove(mp);
			myFrame.remove(cs);
			myFrame.add(cs);
			panel.add(btn1);
			panel.add(btn2);
			myFrame.add(BorderLayout.SOUTH,panel);
			
		}
		
	}

}
