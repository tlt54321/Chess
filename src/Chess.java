import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chess {
	private JFrame frame;
	private LaunchScreen launchScreen;
	private boolean isRunning;

	public static void main(String[] args) {
		Chess game = new Chess();
	}

	public Chess() {
		isRunning = true;
		launchScreen = new LaunchScreen();
		frame = new JFrame("1337 Chess");
		frame.add(launchScreen); // test
		frame.setTitle("1337 Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		frame.setVisible(true);

		new Thread(() -> {
			while (isRunning) {
				if (launchScreen.getLaunchStatus() == true) {
					JOptionPane.showMessageDialog(null, "Test");
					frame.remove(launchScreen);
					frame.add(new Board());
				}
			}
		}).start();
	}
}
