import java.util.*;
import java.io.*;

public class Silver{
    private char[][] map;
    private int[][] grid;

    public Silver(String file){
	try{
	    Scanner in = new Scanner(new File(file));
	    int rows = in.nextInt();
	    int cols = in.nextInt();
	    int steps = in.nextInt();
	    map = new char[rows][cols];
	    for (int i = 0; i < rows; i++){
		String line = in.next();
		for (int j = 0; j < cols; j++){
		    map[i][j] = line.charAt(j);;
		}
	    }

	    

	    
	} catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
    }
    

    public static void main(String[]args){
	if (args.length == 0){
	    Silver s = new Silver("ctravel.in");
	} else {
	    Silver s = new Silver(args[0]);
	}
    }

}
