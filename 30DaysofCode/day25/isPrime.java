import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void isAPrime(int num){
        if(num == 1){
            System.out.println("Not prime");
            return;
        }
        else{
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num%j == 0){
                    System.out.println("Not prime");
                    return;
                }
            }
        }
        System.out.println("Prime");
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numTestCases = sc.nextInt();
        int[] arrOfNums = new int[numTestCases];
        for(int i = 0; 0 < numTestCases; i++){
            boolean isPrime = true;
            arrOfNums[i] = sc.nextInt();
            isAPrime(arrOfNums[i]);
        }      
    }
}

