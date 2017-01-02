public abstract class Piece {

	String name;

	boolean captured = false;
	boolean white;

	int[][] startingLocation;

	public Piece(int[][] startingLocation, boolean white, String name) {
		this.name = name;
		this.white = white;
		this.startingLocation = startingLocation;
	}

	public void setCaptured(boolean b) {
		captured = b;
	}

	public String getName() {
		return name;
	}

	public boolean getWhite() {
		return white;
	}

	public int[][] getStartingLocation() {
		return startingLocation;
	}

	public abstract void move(int[][] moveToThisLocation);
}