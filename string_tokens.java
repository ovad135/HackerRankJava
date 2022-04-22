import java.io.*;
import java.util.*;

public class string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Write your code here.
        
        String[] arrOfStr = s.trim().split("[!,?._'@\\s]+");
        
        if (s.trim().length() == 0 || s.trim().length()>400000) {
            System.out.println(0);
            scan.close();
            return;
        }
          
        System.out.println(arrOfStr.length);
        
        for (String a : arrOfStr) {
            System.out.println(a);
        }      
        scan.close();
    }
}