import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Color myBlue = new Color(66, 134, 244);
	
	public DrawingPanel() {
		//setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("This is a string", 100, 200);
		
		//eyes
		g.setColor(myBlue);
		g.drawLine(100, 100, 100, 150);
		g.drawLine(150, 100, 150, 150);
		
		//mouth
		//g.fillArc(100, 75, 50, 50, 90, 180);  
		// Picture an oval with upper left corner of its rectangle at 
		//100,75 and its 50 wide and 50 high 
		g.setColor(Color.RED);
		g.fillArc(100, 200, 50, 50, 180, 180);

		
	}
	
	
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}
