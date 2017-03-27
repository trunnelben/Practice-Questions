import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] inputArray = new int[n];
        for(int i = 0; i < n; i++){
            inputArray[i] = sc.nextInt();
        }
        int[] soln = new int[n];
        int place = 0;
        for(int i = 0; i < (n-d); i++){
            soln[i] = inputArray[d+i];
        }
        for(int i = (n-d); i < n; i++){
            soln[i] = inputArray[place];
            place++;
        }
        for(int i = 0; i < n; i++){
            System.out.print(soln[i] + " ");
        }
    }
}
