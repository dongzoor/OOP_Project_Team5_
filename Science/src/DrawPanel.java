

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	static double x=100;
	static double y =100;
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.blue);
		g.fillOval((int)x, (int)y, 100, 100);
		
	}

}
