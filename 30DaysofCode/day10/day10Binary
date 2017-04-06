import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0;
        Boolean noLastOne = false;
        String str = "";
        if(n%2 == 0){
            str = "1";
            n = n/2;
            noLastOne = true;
        }
        while(n > 0){
            if(n == 1 && noLastOne == true){
                str += "0";
                n = 0;
            }
            else{
                remainder = n%2;
                n = n/2;
                str += remainder;
            }
        }
        int counter = 0;
        int max = 0;
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                counter += 1; 
                if(counter > max) {
                    max = counter;
                }
                if(i == arr.length-1) break;
            }
            else {
                if(counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        System.out.println(max);
     //   System.out.println(str);
    }
}

