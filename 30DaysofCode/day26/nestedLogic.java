import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();
        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();
        int fine = 0;
        if(returnYear > dueYear){
            fine = 10000;
        }
        else{
            if((returnMonth > dueMonth) && (returnYear == dueYear)){
                fine = 500*(returnMonth-dueMonth);
            }
            else{
                if(returnDay > dueDay && (returnYear == dueYear) && (returnMonth == dueMonth)){
                    fine = (15*(returnDay-dueDay));
                }
                else{
                    fine = 0;
                }
            }
        }
        System.out.println(fine);
    }
}
