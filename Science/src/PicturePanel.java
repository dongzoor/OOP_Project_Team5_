


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicturePanel extends JPanel{
	
	static int count=1;
	@Override
	public void paintComponent(Graphics g){
		
		Image img0 = new ImageIcon("0.jpg").getImage();
		Image img1 = new ImageIcon("1.jpg").getImage();
		Image img2 = new ImageIcon("2.jpg").getImage();
		Image img3 = new ImageIcon("3.jpg").getImage();
		Image img4 = new ImageIcon("4.jpg").getImage();
		Image img5 = new ImageIcon("5.jpg").getImage();
		Image img6 = new ImageIcon("6.jpg").getImage();
		Image img7 = new ImageIcon("7.jpg").getImage();
		Image img8 = new ImageIcon("8.jpg").getImage();
		Image img9 = new ImageIcon("9.jpg").getImage();
		Image img10 = new ImageIcon("10.jpg").getImage();
		
		if(count == 1)
		g.drawImage(img0, 0, 0, this);
		
		if(count == 2)
		g.drawImage(img1, 0, 0, this);
		
		if(count == 3)
		g.drawImage(img2, 0, 0, this);
		
		if(count == 4)
		g.drawImage(img3, 0, 0, this);
		
		if(count == 5)
		g.drawImage(img4, 0, 0, this);
		
		if(count == 6)
		g.drawImage(img5, 0, 0, this);
		
		if(count == 7)
		g.drawImage(img6, 0, 0, this);
		
		if(count == 8)
		g.drawImage(img7, 0, 0, this);
		
		if(count == 9)
		g.drawImage(img8, 0, 0, this);
		
		if(count == 10)
		g.drawImage(img9, 0, 0, this);
		
		if(count == 11)
		g.drawImage(img10, 0, 0, this);
		
				

	}

}
