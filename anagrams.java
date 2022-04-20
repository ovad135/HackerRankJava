import java.util.Scanner;
// import java.io.*;
// import java.util.Arrays;

public class anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] chArrayA = a.toLowerCase().toCharArray();
        char[] chArrayB = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(chArrayA);
        java.util.Arrays.sort(chArrayB);
        if (chArrayA.length != chArrayB.length) {
            return false;
        }
        for (int i = 0; i < chArrayB.length; i++) {
            if (chArrayA[i] != chArrayB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}