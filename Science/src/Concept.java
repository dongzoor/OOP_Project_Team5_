

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Concept implements ActionListener{

	static PicturePanel picturePanel;
	static JFrame frame;
	static JButton button1;
	static JButton button2;
	public static void main(String[] args){
		BorderLayout layout = new BorderLayout();
		Concept c= new Concept();
		frame = new JFrame();
		frame.setLayout(layout);
		picturePanel = new PicturePanel();
		frame.add(BorderLayout.CENTER, picturePanel);
		button1 = new JButton();
		button2 = new JButton();
		button1.setText("BACK");
		button2.setText("NEXT");
		frame.add(BorderLayout.WEST, button1);
		frame.add(BorderLayout.EAST, button2);
		
		frame.setVisible(true);
		frame.setSize(1000, 800);
		button1.addActionListener(c);
		button2.addActionListener(c);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button2)
			PicturePanel.count++;
		if(e.getSource() == button1)
			PicturePanel.count--;
			
		frame.add(BorderLayout.CENTER, picturePanel);
		
		
	}
}
