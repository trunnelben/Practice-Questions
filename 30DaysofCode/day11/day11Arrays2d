import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int arrSum = 0;
        int max = Integer.MIN_VALUE; //set max to the minimum value incase you have a complete negative array.
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                if(i + 1 >= 6){
                    break;
                }
                else if(j + 1 >= 6){
                    break;
                }
                arrSum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if(arrSum > max){
                    max = arrSum;
                }
            }
        }
        System.out.println(max);
    }
}

