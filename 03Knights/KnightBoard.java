public class KnightsBoard{
    private int[][] knightboard;


    public KnightsBoard(int row, int col){
	col += 4; //I made these two += 4 because I am going to use the method 
	row += 4; //of solving this that adds two spaces on each side.
	knightboard = new int[row][col];
    }

    public KnightsBoard(int side){
	this(side, side);
    }

    public KnightsBoard(){
	this(4);
    }


}
