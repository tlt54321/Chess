import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Piece> pieces;
	private ArrayList<Piece> capturedPieces;

	public Player(String name) {
		setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
