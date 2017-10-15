package exercises1;

import java.util.*;

public class ctciPractice {
	static boolean paliPerm(String s){
		int[] stringCount = new int[26];
		//s = unCapitalize(s);
		int a = Character.getNumericValue('a');
		for(char c : s.toCharArray()){
			int letter = Character.getNumericValue(c)-a;
			if(letter < 0 || letter > 25) return false;
			stringCount[letter]++;
		}
		boolean result = maxOneOdd(stringCount);
		return result;
	}
	
	static boolean maxOneOdd(int[] a){
		int counter = 0;
		for(int index : a){
			if(a[index] % 2 != 0){
				if(counter > 0) return false;
				counter++;
			}
		}
		return true;
	}
	
	
	public static void main (String[] args) {
		boolean result = paliPerm("tacocat");
		System.out.println(result);
	}
}

