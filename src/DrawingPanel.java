import java.awt.Dimension;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}
}
