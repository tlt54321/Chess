import javax.swing.JButton;

public class Tile extends JButton{
	public static final int EMPTY = 0;
	public static final int PAWN = 1;
	public static final int BISHOP = 2;
	public static final int KNIGHT = 3;
	public static final int ROOK = 4;
	public static final int QUEEN = 5;
	public static final int KING = 6;
	private int tileStatus;//number 0-6 defines what piece is on this tile
	private int X;//x co-ordinate 0-7
	private int Y;//y co-ordinate 0-7
	public Tile(int tileNum, int x, int y) {
		this.tileStatus = tileNum;
		this.X = x;
		this.Y = y;
	}
}
