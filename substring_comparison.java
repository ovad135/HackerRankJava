import java.util.Scanner;

public class substring_comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String seq = s.substring(0,k);
        String smallest = seq;
        String largest = seq;
        for (int i = 1; i <= (s.length() - k); i ++) {
            seq = s.substring(i, (i+k));
            if (seq.compareTo(smallest) < 0) {
                smallest = seq; 
            }
            if (seq.compareTo(largest) > 0) {
                largest = seq;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
    
        System.out.println(getSmallestAndLargest(s, k));
    }
}