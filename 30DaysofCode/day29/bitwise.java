import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int maxPermutation(int n, int k){
        int max = Integer.MIN_VALUE;
        //computes the 2 bitwise combinations
        for(int i = 1; i <= n-1; i++){
            for(int j = i+1; j <= n; j++){
                int bitwiseValue = (i&j);
                if(bitwiseValue > max && bitwiseValue < k){
                    max = bitwiseValue;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int answer = maxPermutation(n, k);
            System.out.println(answer);
        }
    }
}

