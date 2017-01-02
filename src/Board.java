import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Board extends JPanel {
	static Tile[][] tiles;

	public Board() {
		tiles = new Tile[8][8];
		this.setLayout(new GridLayout(8,8));
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				tiles[i][j] = new Tile();
				this.add(tiles[i][j], i, j);
			}
			
		}
	}
	static Tile[][] getTiles() {
		return tiles;
	}
}
