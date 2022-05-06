import java.io.*;
import java.util.*;

public class twoDimArray {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }        
        sc.close();
        System.out.println(hourGlassSum(arr));
    }
    public static int hourGlassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int width = 6;
        int length = 6;
        
        for (int i = 0; i < width-2; i++) {
            for (int j = 0; j < length-2; j++) {
                int sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}

// a b c
//   d
// e f g

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0

// sum is 19 largest hourglass
// 2 4 4
//   2
// 1 2 4