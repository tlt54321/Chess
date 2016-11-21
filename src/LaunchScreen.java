import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaunchScreen extends JPanel{
	private String player1;
	private String player2;
	private JLabel player1Label;
	private JLabel player2Label;
	private JTextField player1Text;
	private JTextField player2Text;
	
	public LaunchScreen(){
		player1Label = new JLabel("Player 1:");
		player2Label = new JLabel("Player 2:");
		player1Text = new JTextField();
		player2Text = new JTextField();
		
		player1Text.setPreferredSize(new Dimension(130, 30));
		player2Text.setPreferredSize(new Dimension(130, 30));
		
		this.add(player1Label);
		this.add(player1Text);
		this.add(player2Label);
		this.add(player2Text);
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
}
