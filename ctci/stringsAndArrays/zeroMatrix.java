package exercises1;

import java.util.*;

public class ctciPractice {
	public static int[][] zeroMatrix(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j] == 0){
					markArray(a, i, j);
				}
			}
		}
		changeArray(a);
		return a;
	}
	
	static int[][] markArray(int[][] a, int i, int j){
		for(int rowIndex = 0; rowIndex < a.length; rowIndex++){
			if(a[i][rowIndex] == 0){
				//do nothing
			}
			else{
				a[i][rowIndex] = ' ';
			}
		}
		for(int colIndex = 0; colIndex < a[0].length; colIndex++){
			if(a[colIndex][j] == 0){
				//do nothing
			}
			else{
				a[colIndex][j] = ' ';
			}
		}	
		return a;
	}
	
	static int[][] changeArray(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j] == ' '){
					a[i][j] = 0;
				}
			}
		}
		return a;
	}

	
	public static void main (String[] args) {
		int[][] a = {{1,1,1}, {2,0,0}, {3,1,1}};
		a = zeroMatrix(a);
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				System.out.println(a[i][j]);
			}
		}
	}
}

