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


}
