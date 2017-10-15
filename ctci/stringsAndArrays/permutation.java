package exercises1;

import java.util.*;

public class ctciPractice {
	public static boolean isPermutation(String a, String b){
		int[] countA = permCount(a);
		if(a.length() - b.length() != 0) return false;
		for(int i = 0; i < b.length(); i++){
			countA[b.charAt(i)]--;
			if(countA[b.charAt(i)] < 0) return false;
		}
		return true;
	}
	
	static int[] permCount(String s){
		int[] count = new int[256];
		for(char c : s.toCharArray()){
			count[c]++;
		}
		return count;
	}

	
	public static void main (String[] args) {
		boolean result = isPermutation("testaaing", "tebsating");
		System.out.println(result);
	}
}

