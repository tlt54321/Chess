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

		settingsFont = new Font("Arial", Font.BOLD, 30);
		playerFont = new Font("Arial", Font.ITALIC, 25);
		
		welcome = new JLabel("Welcome to 1337 Chess");
		welcome.setFont(new Font("Arial", Font.BOLD, 40));

		player1 = new JLabel("Player 1: ");
		player2 = new JLabel("Player 2: ");

		settings = new JLabel("Settings:");

		checkerColor1 = new JLabel("Color 1: ");
		checkerColor2 = new JLabel("Color 2: ");

		enterPlayer1 = new JTextField();
		enterPlayer2 = new JTextField();

		enterColor1 = new JTextField();
		enterColor2 = new JTextField();

		play = new JButton("START");

		// Settings

		settings.setFont(settingsFont);

		player1.setFont(playerFont);
		player2.setFont(playerFont);
		
		checkerColor1.setFont(playerFont);
		checkerColor2.setFont(playerFont);


		this.setLayout(null);

		play.setForeground(Color.GREEN);
		play.addActionListener(this);
		play.setBackground(Color.GREEN);
		play.setOpaque(true);

		// Adding Components to Each Other

		this.add(welcome);
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

		welcome.setBounds(180, 20, 500, 50);
		player1.setBounds(30, 85, 140, 70);
		enterPlayer1.setBounds(135, 100, 200, 40);
		player2.setBounds(400, 85, 140, 70);
		enterPlayer2.setBounds(505, 100, 200, 40);
		settings.setBounds(10, 200, 300, 40);
		checkerColor1.setBounds(30, 260, 100, 20);
		checkerColor2.setBounds(30, 300, 100, 20);
		enterColor1.setBounds(130, 250, 130, 40);
		enterColor2.setBounds(130, 290, 130, 40);
		play.setBounds(250, 450, 300, 60);

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