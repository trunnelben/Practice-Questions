import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int factSize){
        int answer = 1;
        if(factSize == 1){
            return 1;
        }
        answer *= factSize*factorial(factSize-1);
        return answer;
    }
}
