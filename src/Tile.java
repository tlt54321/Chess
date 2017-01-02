import javax.swing.JButton;

public class Tile extends JButton{
	public static final int EMPTY = 0;
	public static final int PAWN = 1;
	public static final int BISHOP = 2;
	public static final int KNIGHT = 3;
	public static final int ROOK = 4;
	public static final int QUEEN = 5;
	public static final int KING = 6;
	private int tileStatus;
	
	public Tile(String title) {
		super(title);
	}
	public Tile() {
		super("");
	}
	int getTileStatus() {
		return tileStatus;
	}
	void setTileStatus(int a) {
		this.tileStatus = a;
	}
	void tileImage() {
		if(tileStatus == 6) {
			//set image to king pic
		}
	}
}
