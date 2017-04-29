import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int maxPermutation(int n, int k){
        int max = Integer.MIN_VALUE;
        int x = n; //what the perm value will actually be;
        if(x > max){
            max = x;
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

