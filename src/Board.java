import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {
	static Tile[][] tiles;

	public Board() {
		tiles = new Tile[8][8];
		this.setLayout(new GridLayout(8,8));
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				tiles[i][j] = new Tile();
				this.add(tiles[i][j], i, j);
				tiles[i][j].addActionListener(this);
			}
			
		}
	}
	static Tile[][] getTiles() {
		return tiles;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(Tile[]x : tiles) {
			for(Tile t : x) {
				if (e.getSource()==t) {
					if( t.getTileStatus()!=0) {
						//Then there's a piece so light where it can move
						
					}
				}
			}
		}
	}
}
