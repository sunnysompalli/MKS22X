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
	grid[startx][starty] = 1;
	while (steps > 0){
	    String coords = "";
	    for (int i = 0; i < grid.length; i++){
		for (int j = 0; j < grid[0].length; j++){
		    if (grid[i][j] >= 1){
			coords = coords + i + j + grid[i][j];
		    }
		}
	    }
	    for (int i = 0; i < grid.length; i++){
		for (int j = 0; j < grid[0].length; j++){
		    
		}
	    }
	    steps --;
	}

	return 1; // So it compiles
    }
    

    public static void main(String[]args){
	Silver s1 = new Silver("ctravel.in");
	System.out.println(s1.solve() + ",6,Sompalli,Sunny");
    }

}
