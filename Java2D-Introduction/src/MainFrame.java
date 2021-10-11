import javax.swing.JFrame;

public class MainFrame extends JFrame{
	static final int HEIGHT = 500;
	static final int WIDTH = 800;
	private static final long serialVersionUID = 1L;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		
		initializeFrame();
	}
	public void initializeFrame() {
		this.setSize(WIDTH,HEIGHT);
		this.setTitle("Bouncing Balls");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(new MainPanel());
		this.setVisible(true);
	}
}
