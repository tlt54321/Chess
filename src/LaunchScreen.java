import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaunchScreen extends JPanel implements ActionListener {

	// Field Variables

	private final int sideSize = 500;

	public String chessPlayer1;
	public String chessPlayer2;

	public Color color1;
	public Color color2;

	private Font playerFont;
	private Font settingsFont;
	
	private JLabel welcome;

	private JLabel player1;
	private JLabel player2;

	private JLabel settings;

	private JLabel checkerColor1;
	private JLabel checkerColor2;

	private JTextField enterPlayer1;
	private JTextField enterPlayer2;

	private JTextField enterColor1;
	private JTextField enterColor2;

	private JButton play;

	private Chess chess;

	LaunchScreen(Chess chess) {

		// Initializing Field Variables

		this.chess = chess;

		settingsFont = new Font("Arial", Font.BOLD, 15);
		playerFont = new Font("Arial", Font.ITALIC, 12);
		
		welcome = new JLabel("Welcome to 1337 Chess");
		welcome.setFont(new Font("Arial", Font.BOLD, 32));

		player1 = new JLabel("Player 1: ");
		player2 = new JLabel("Player 2: ");

		settings = new JLabel("Settings:");

		checkerColor1 = new JLabel("Color 1: ");
		checkerColor2 = new JLabel("Color 2: ");

		enterPlayer1 = new JTextField("Enter Some Text");
		enterPlayer2 = new JTextField("Enter Some Text");

		enterColor1 = new JTextField("Enter Some Text");
		enterColor2 = new JTextField("Enter Some Text");

		play = new JButton("START");

		// Settings

		settings.setFont(settingsFont);

		player1.setFont(playerFont);
		player2.setFont(playerFont);

		this.setLayout(null);

		play.setForeground(Color.GREEN);
		play.addActionListener(this);

		// Adding Components to Each Other

		this.add(player1);
		this.add(enterPlayer1);
		this.add(player2);
		this.add(enterPlayer2);
		this.add(settings);
		this.add(checkerColor1);
		this.add(checkerColor2);
		this.add(enterColor1);
		this.add(enterColor2);
		this.add(play);

		// Setting Custom Boundaries

		player1.setBounds(50, 100, 100, 70);
		enterPlayer1.setBounds(154, 100, 200, 70);
		player2.setBounds(450, 100, 100, 70);
		enterPlayer2.setBounds(554, 100, 200, 70);
		settings.setBounds(0, 53, 63, 40);
		checkerColor1.setBounds(0, 93, 54, 20);
		checkerColor2.setBounds(0, 113, 54, 20);
		enterColor1.setBounds(48, 90, 100, 20);
		enterColor2.setBounds(48, 110, 100, 20);
		play.setBounds(20, 150, 100, 100);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == play) {

			// Get Player Names

			chessPlayer1 = enterPlayer1.getText();
			chessPlayer2 = enterPlayer2.getText();

			// Get Colors by Calling Method

			color1 = initializeColors(enterColor1.getText());
			color2 = initializeColors(enterColor2.getText());

			// Notify User

			// JOptionPane.showMessageDialog(null, "Let's go!");
			chess.changePanel(this, new Board());
		}

		// Call Another Constructor in Another Class Here
	}

	private Color initializeColors(String color) {
		if (color.equalsIgnoreCase("red")) {
			return new Color(255, 0, 0);
		} else if (color.equalsIgnoreCase("green")) {
			return new Color(0, 255, 0);
		} else if (color.equalsIgnoreCase("blue")) {
			return new Color(0, 0, 255);
		} else {
			return null;
		}
	}
}