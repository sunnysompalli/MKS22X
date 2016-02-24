import java.util.*;
import java.io.*;

public class Bronze{
    private int[][] pasture;

    public void stomp(int R_s, int C_s, int D_s){
	R_s -= 1;
	C_s -= 1;
	int max = pasture[R_s][C_s];
	for(int i = R_s; i < Math.min(pasture.length - 1, R_s + 3); i++){
	    for(int j = C_s; j < Math.min(pasture[0].length - 1, C_s + 3); j++){
		max = Math.max(max, pasture[i][j]);
	    }
	}
	int new = max - D_s;
	for(int i = R_s; i < Math.min(pasture.length - 1, R_s + 3); i++){
	    for(int j = C_s; j < Math.min(pasture[0].length - 1, C_s + 3); j++){
		if(pasture[i][j] > new){
		    pasture[i][j] = new;
		}
	    }
	}
    }

    public String final(int E){
	int sum = 0;
	for(int i = 0; i < pasture.length; i++){
	    for(int j = 0; j < pasture[0].length; j++){
		pasture[i][j] = E - pasture[i][j];
		if(pasture[i][j] < 0){
		    pasture[i][j] = 0;
		}
		sum += pasture[i][j];
	    }
	}
	return (sum * 72 * 72) + ",6,Sompalli,Sunny";
    }


    public static void main(String[args]){
	try{
	    File f = new File("makelake.in");
	    Scanner in = new Scanner(f);
	    int R = f.nextInt();
	    int C = f.nextInt();
	    int E = f.nextInt();
	    int N = f.nextInt();
	    pasture = new int[R][C];
	    for(int i = 0; i < R; i++){
		for(int j = 0; j < C; j++){
		    pasture[i][j] = f.nextInt();
		}
	    }

	    while(N > 0){
		stomp(f.nextInt(), f.nextInt(), f.nextInt());
		N -= 1;
	    }

	    System.out.println(final(E));

	}
	catch (FileNotFoundException e){
	    System.out.println("File not found");
	}

    }


}
