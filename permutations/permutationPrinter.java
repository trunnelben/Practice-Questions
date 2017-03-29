import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void perm(String str, String addOn){
        if(str.length()==0){
            return;
        }
        String oneDown = str.substring(0, str.length()-1);
        String addOn1 = str.substring(str.length()-1);
        perm(oneDown, addOn1);
        String P1 = "";
        String P2 = "";
        for(int i = 0; i <= str.length(); i++){
            P1 = str.substring(0, i);
            P2 = str.substring(i);
            System.out.println(P1 + addOn + P2);
            //i need it to run on all combos
        }
    }
    public static void main(String[] args) {
        perm("ab", "c");  
        perm("ba", "c"); //currently need to pass this in as well because it will return ba from the above
        // permutation call, but it won't run the remaining perm call.
    }
}
