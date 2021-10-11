import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	Timer timer = new Timer(5,this);
	private int x = 0,y = 0,xVel = 2,yVel = 2;
	public MainPanel() {
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillOval(x, y, 50, 50);
		
		timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x >= MainFrame.WIDTH - 50 || x < 0) {
			xVel = -xVel;
		}
		if(y >= MainFrame.HEIGHT - 50 || y < 0) {
			yVel = -yVel;
		}
		x += xVel;
		y += yVel;
		repaint();
	}
}
