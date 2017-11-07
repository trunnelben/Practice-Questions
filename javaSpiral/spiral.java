
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ctciPractice {



	public static String[][] spiral(int width, int height) {
		String[][] res = new String[width][height];
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				res[i][j] = " ";
			}
		}
		int rowBegin = 0;
		int rowEnd = width-1;
		int colBegin = 0;
		int colEnd = height-1;
		while(colEnd > colBegin && rowEnd > rowBegin){//some base case to figue out youre done?
			for(int i = rowBegin; i < rowEnd; i++){
				res[i][colBegin] = "1";
			}
			rowBegin+=2;
			for(int i = colBegin; i < colEnd; i++){
				res[rowEnd][i] = "1";
			}
			colBegin+=2;
			for(int i = rowEnd; i > rowBegin; i--){
				res[i][colEnd] = "1";
			}
			rowEnd-=2;
			for(int i = colEnd; i > colBegin; i--){
				res[rowBegin][i] = "1";
			}
			colEnd-=2;
		}
		return res;
	    
	}
	    public static void main(String[] args) {
	    	String[][] ans = spiral(15, 5);
	    	for(int i = 0; i < ans.length; i++){
	    		for(int j = 0; j < ans[0].length; j++){
	    			System.out.print(ans[i][j]);
	    		}
	    		System.out.println();
	    	}
	    }
}
