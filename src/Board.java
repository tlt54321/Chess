import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {
	JButton[][] buttons;

	public Board() {
		buttons = new JButton[8][8];
		this.setLayout(new GridLayout(8, 8));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				buttons[i][j] = new JButton();
				this.add(buttons[i][j], i, j);
			}

		}
	}
}
