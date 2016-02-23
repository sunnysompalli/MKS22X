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
	for(int i = 0; i < knightboard.length; i++){
	    for(int j = 0; j < knightboard[0].length; j++){
		if(solveH(i, j, 1)){
		    return true;
		}
	    }
	}
	return false;
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
	if(knightboard[row][col] != 0){
	    return false;
	}
	if(n == (knightboard.length * knightboard[0].length)){
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
		return true;
	    }
	    else{
		remove(row, col);
	    }
	}
	return false;
    }

    private void remove(int row, int col){
	knightboard[row][col] = 0;
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

    /*
    //Tests
    public static void main(String[]args){
	KnightBoard A = new KnightBoard(5);
	System.out.println(A.solve());
	A.printSolution();

	KnightBoard B = new KnightBoard(2);
	System.out.println(B.solve());
	B.printSolution();

	KnightBoard C = new KnightBoard(3);
	System.out.println(C.solve());
	C.printSolution();

	KnightBoard D = new KnightBoard(6);
	System.out.println(D.solve());
	D.printSolution();

    }
    */

}
