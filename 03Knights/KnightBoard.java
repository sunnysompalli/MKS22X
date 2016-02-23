public class KnightBoard{
    private int[][] knightboard;


    public KnightBoard(int row, int col){
	knightboard = new int[row][col];
    }

    public KnightBoard(int side){
	this(side, side);
    }

    public KnightBoard(){
	this(4);
    }

    public boolean solve(){
	return solveH(0, 0, 0);
    }

    private boolean solveH(int row, int col, int n){
	if(row < 0){
	    return false;
	}
	if(col < 0){
	    return false;
	}
	if(row >= knightboard.length){
	    return false;
	}
	if(col >= knightboard[0].length){
	    return false;
	}  
	if(knightboard[row][col] != -1){
	    return false;
	}
	if(n == (knightboard.length * knightboard[0].length - 1)){
	    knightboard[row][col] = n;
	    return true;
	}
	else{
	    knightboard[row][col] = n;
	    if(
	       solveH(row + 1, col + 2, n + 1) ||
	       solveH(row + 1, col - 2, n + 1) ||
	       solveH(row + 2, col + 1, n + 1) ||
	       solveH(row + 2, col - 1, n + 1) ||
	       solveH(row - 1, col + 2, n + 1) ||
	       solveH(row - 1, col - 2, n + 1) ||
	       solveH(row - 2, col + 1, n + 1) ||
	       solveH(row - 2, col - 1, n + 1)
	       ){
		printSolution();
		return true;
	    }
	    else{
		knightboard[row][col] = -1;
		return false;
	    }
	}
    }

    public void printSolution(){
	String ans = "";
	for(int i = 0; i < knightboard.length; i++){
	    for(int j = 0; j < knightboard.length; j ++){
		if(knightboard[i][j] < 10){
		    ans += "_";
		}
		ans += knightboard[i][j] + " ";	  
	    }
	    ans += "\n";
	}
	System.out.println(ans);
    }



    //Tests
    public static void main(String[]args){
	KnightBoard A = new KnightBoard(5);
	System.out.println(A.solve());
	A.printSolution();
    }

}
