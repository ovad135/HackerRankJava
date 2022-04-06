import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_else {



    private static final Scanner scanner = new Scanner(System.in);

    public static boolean contains(final int[] arr, final int key) {
        Arrays.sort(arr);  
        return Arrays.binarySearch(arr, key) >= 0;
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arrayA = {2,3,4,5};
        int[] arrayB = {6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(contains(arrayA,N));
        System.out.println(contains(arrayB,N));
        if (N % 2 != 0) {
            System.out.println("Weird"); // odd
        }
        else if (N % 2 == 0 && contains(arrayA,N) == true) {
            System.out.println("Not Weird");
        }
        else if (N % 2 == 0 && contains(arrayB,N) == true) {
            System.out.println("Weird");
        }
        else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
