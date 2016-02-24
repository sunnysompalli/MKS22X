import java.util.*;
import java.io.*;

public class Bronze{
    private int[][] pasture;

    public makeLake(int R, int C){
	pasture = new int[R][C];
    }

    public makeLake(int[][] ary){
	pasture = new int[ary.length][ary[0].length];
	for(int i = 0; i < ary.length; i++){
	    for(int j = 0; j < ary[0].length; j++){
		pasture[i][j] = ary[i][j];
	    }
	}
    }

    public void stomp(int R_s, int C_s, int D_s){
	
    }


}
