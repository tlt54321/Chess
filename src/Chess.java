import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chess {
	private JFrame frame;
	private LaunchScreen launchScreen;
	private Board board;

	public static void main(String[] args) {
		Chess game = new Chess();
	}

	public Chess() {
		launchScreen = new LaunchScreen(this);
		board = new Board();
		frame = new JFrame("1337 Chess");
		frame.setLayout(new GridLayout(2,2));
		frame.add(launchScreen); // test
		frame.setTitle("1337 Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		frame.setVisible(true);
	}

	public void changePanel(JPanel removePanel, JPanel addPanel) {
		frame.remove(removePanel);
		frame.add(addPanel, 0, 0);
		frame.validate();
		frame.repaint();
	}

	public Board getBoard() {
		return this.board;
	}
}
