

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Simulation implements ActionListener{
	static int i;
	static DrawPanel dp;
	static JButton button;
	public static void main(String[] args){
		Simulation s = new Simulation();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		
		dp = new DrawPanel();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.getContentPane().add(dp);
		
		button = new JButton();
		button.setText("Dd");
		button.addActionListener(s);
		panel.add(button);
		frame.add(BorderLayout.SOUTH, button);
		frame.add(BorderLayout.CENTER, dp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			i++;
			DrawPanel.x=(1+Math.cos(i*0.1))*200;
			DrawPanel.y=(1-Math.sin(i*0.1))*200;
			dp.repaint();
			
		

		
	}
}

