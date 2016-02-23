public class QueenBoard{
    private int[][]board;
    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    /**
     *precondition: board is filled with 0's only.
     *postcondition: 
     *-return false, and board is still filled
     *with 0's for a board that cannot be solved.
     *-return true, and board is filled with the 
     *final configuration of the board after adding 
     *all n queens.
     */
    public boolean solve(){
	return solveHelper(0);
    }

    private boolean solveHelper(int col){
	if (col < 0) return false;
        if (col >= board.length) return true;
	for(int row = 0; row < board.length; row ++){
	    if(addQueen(row, col)){
		addQueen(row, col);
		printSolution();
		if(solveHelper(col + 1)){
		    return true;
		}
		removeQueen(row, col);
	    }
	}
	return false;
    }
	
    public void printSolution(){
        String ans = "";
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if (board[r][c] <= 0) ans+= "_\t";
		if (board[r][c] == 1) ans+= "Q\t";
            }
            ans+="\n";
        }
        System.out.println(ans);

	/**Print the board like toString, except
	   all negative numbers, and 0's are replaced with '_'
	   and all 1's are replaced with 'Q'
	 */
    }

    private boolean addQueen(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	board[row][col] = 1;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]--;
	    if(row - offset >= 0){
		board[row-offset][col+offset]--;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]--;
	    }
	    offset++;
	}
	return true;
    }

    private boolean removeQueen(int row, int col){
	if(board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]++;
	    if(row - offset >= 0){
		board[row-offset][col+offset]++;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]++;
	    }
	    offset++;
	}
	return true;
    }

    public String  toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c]+"\t";
	    }
	    ans+="\n";
	}
	return ans;
    }
    
    /*
    public static void main(String[]args){
	QueenBoard b = new QueenBoard(4);
        System.out.println(b);
	b.addQueen(3,0);
	b.addQueen(0,1);
        System.out.println(b);
	b.removeQueen(3,0);
        System.out.println(b);
	b.printSolution();
	System.out.println(b.solve());
        b.printSolution();
	QueenBoard b1 = new QueenBoard(1);
	QueenBoard b2 = new QueenBoard(2);
        System.out.println(b1.solve());
        b1.printSolution();
        System.out.println(b2.solve());
        b2.printSolution();

    }
    */

}
