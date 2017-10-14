package exercises1;

import java.util.*;

public class ctciPractice {
	public static boolean isUnique(String s) {
        Set<Character> unique = new HashSet<Character>();
        for(Character c : s.toCharArray()){
            if(unique.add(c) == false) return false;
            else{
                unique.add(c);
            }
        }
        return true;
    }
	
	public static boolean isUniqueSorted(String s){
		char[] sorted = s.toCharArray();
		Arrays.sort(sorted);
		for(int i = 0; i < sorted.length-1; i++){
			if(sorted[i] == sorted[i+1]) return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		boolean result = isUnique("tesing");
		boolean result1 = isUniqueSorted("abcdefghi");
		System.out.println(result);
		System.out.println(result1);
	}
}

