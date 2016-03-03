import java.util.*;
import java.io.*;

public class Silver{
    private char[][] map;
    private int[][] grid;
    private int startx, starty, endx, endy, steps;

    public Silver(String file){
	try{
	    Scanner in = new Scanner(new File(file));
	    int rows = in.nextInt();
	    int cols = in.nextInt();
	    steps = in.nextInt();
	    map = new char[rows][cols];
	    for (int i = 0; i < rows; i++){
		String line = in.next();
		for (int j = 0; j < cols; j++){
		    map[i][j] = line.charAt(j);;
		}
	    }
	    startx = in.nextInt();
	    starty = in.nextInt();
	    endx = in.nextInt();
	    endy = in.nextInt();

	    grid = new int[rows][cols];
	    for (int i = 0; i < rows; i++){
		for (int j = 0; j < cols; j++){
		    if (map[i][j] == '.'){
			grid[i][j] = 0;
		    }
		    if (map[i][j] == '*'){
			grid[i][j] = -1;
		    }
		}
	    }
	    
	} catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
    }


    public int solve(){
	grid[startx - 1][starty - 1] = 1;
	while (steps > 0){
	    int[][]holder = new int[grid.length][grid[0].length];
	    for (int i = 0; i < grid.length; i++){
		for (int j = 0; j < grid[0].length; j++){
		    holder[i][j] = grid[i][j];
		    if (grid[i][j] != -1){
			grid[i][j] = 0;
		    }
		}
	    }
	    for (int i = 0; i < grid.length; i++){
		for (int j = 0; j < grid[0].length; j++){
		    if (grid[i][j] != -1){
			if (i < grid.length - 1){
			    if (holder[i + 1][j] >= 1){
				grid[i][j] += holder[i + 1][j];
			    }
			}
			if (j < grid[0].length - 1){
			    if (holder[i][j + 1] >= 1){
				grid[i][j] += holder[i][j + 1];
			    }
			}
			if (i > 0){
			    if (holder[i - 1][j] >= 1){
				grid[i][j] += holder[i - 1][j];
			    }
			}
			if (j > 0){
			    if (holder[i][j - 1] >= 1){
				grid[i][j] += holder[i][j - 1];
			    }
			}
		    }
		}
	    }
	    steps --;
	}
	return grid[endx - 1][endy - 1];
    }
    

    public static void main(String[]args){
	Silver s1 = new Silver("ctravel.in");
	System.out.println(s1.solve() + ",6,Sompalli,Sunny");
    }

}
