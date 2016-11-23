import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchScreen implements ActionListener {
	
	// Field Variables
	
	private final int sideSize = 500;

	public String chessPlayer1;
	public String chessPlayer2;
	
	public Color color1;
	public Color color2;
	
	Font playerFont;
	Font settingsFont;

	JFrame frame;
	
	JPanel panel;
	
	JLabel player1;
	JLabel player2;
	
	JLabel settings;
	
	JLabel checkerColor1;
	JLabel checkerColor2;
	
	JTextField enterPlayer1;
	JTextField enterPlayer2;
	
	JTextField enterColor1;
	JTextField enterColor2;
	
	JButton play;

	LaunchScreen() {
		
		// Initializing Field Variables
		
		frame = new JFrame("Welcome to the world of Chess!");
		
		panel = new JPanel();
		
		settingsFont = new Font("Arial", Font.BOLD, 15);
		playerFont = new Font("Arial", Font.ITALIC, 12);
		
		player1 = new JLabel("Player 1: ");
		player2 = new JLabel("Player 2: ");
		
		settings = new JLabel("Settings:");
		
		checkerColor1 = new JLabel("Color 1: ");
		checkerColor2 = new JLabel("Color 2: ");
		
		enterPlayer1  = new JTextField("Enter Some Text");
		enterPlayer2  = new JTextField("Enter Some Text");
		
		enterColor1 = new JTextField("Enter Some Text");
		enterColor2 = new JTextField("Enter Some Text");
		
		play = new JButton("START");
		
		// Settings
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(sideSize, sideSize);
		
		settings.setFont(settingsFont);
		
		player1.setFont(playerFont);
		player2.setFont(playerFont);
		
		panel.setLayout(null);
		
		play.setForeground(Color.GREEN);
		play.addActionListener(this);
		
		//  Adding Components to Each Other
		
		frame.add(panel);
		
		panel.add(player1);
		panel.add(enterPlayer1);
		panel.add(player2);
		panel.add(enterPlayer2);
		panel.add(settings);
		panel.add(checkerColor1);
		panel.add(checkerColor2);
		panel.add(enterColor1);
		panel.add(enterColor2);
		panel.add(play);
		
		
		// Setting Custom Boundaries
		
		player1.setBounds(0, 3, 52, 15);
		enterPlayer1.setBounds(54, 0, 200, 20);
		player2.setBounds(0, 23, 52, 15);
		enterPlayer2.setBounds(54, 20, 200, 20);
		settings.setBounds(0, 53, 63, 40);
		checkerColor1.setBounds(0, 93, 46, 20);
		checkerColor2.setBounds(0, 113, 46, 20);
		enterColor1.setBounds(48, 90, 100, 20);
		enterColor2.setBounds(48, 110, 100, 20);
		play.setBounds(20, 150, 100, 100);
	}

	public static void main(String[] args) {
		
		// Call Constructor
		
		new LaunchScreen();
	}

	public void actionPerformed(ActionEvent e) {
		
		// Get Player Names
		
		chessPlayer1 = enterPlayer1.getText();
		chessPlayer2 = enterPlayer2.getText();
		
		// Get Colors by Calling Method
		
		color1 = initializeColors(enterColor1.getText());
		color2 = initializeColors(enterColor2.getText());
		
		// Notify User
		
		JOptionPane.showMessageDialog(null, "Let's go!");
		
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
