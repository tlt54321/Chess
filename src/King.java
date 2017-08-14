
public class King extends Piece{
	String name;
	
	boolean captured = false;
	boolean white;
	
	int[] startingLocation;//{x, y}
	public King(int[] startingLocation, boolean white, String name) {
		super(startingLocation, white, name);
		Board.getTiles()[startingLocation[0]][startingLocation[1]].setTileStatus(6);
	}

	@Override
	public void move(int[][] moveToThisLocation) {
		//Move to where clicked
		
	}

	@Override
	public void lightMovableLocations(Tile t) {
		// Given (a,b) light: (a +/- 1, b), (a, b +/- 1), (a +/- 1, b +/- 1)
		
	}

}
