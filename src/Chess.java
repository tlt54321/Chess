import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chess extends JFrame {
	private JPanel panel;
	
	public static void main(String[] args) {
		Chess game = new Chess();
	}
	
	public Chess(){
		this.add(new LaunchScreen()); //test
		this.setTitle("1337 Chess");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setVisible(true);
	}
	
	public void setPanel(JPanel panel){
		this.panel = panel;
	}
}
