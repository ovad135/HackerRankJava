import java.io.*;
import java.util.*;

public class string_reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String aBackwardsString = "";
        /* Enter your code here. Print output to STDOUT. */
        for (int j = A.length()-1; j >= 0; j--) {
            aBackwardsString += A.charAt(j);
        }
        if (A.equals(aBackwardsString) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }        
    }
}



