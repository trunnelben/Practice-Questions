import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> names = new LinkedList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            String myRegExString = "@gmail.com";
            Pattern p = Pattern.compile(myRegExString);
            Matcher m = p.matcher(emailID);
            if( m.find() ) {
                names.add(firstName);
            }        
        }
        Collections.sort(names);
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}



