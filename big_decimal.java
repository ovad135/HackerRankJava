import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        // BigDecimal bdArray[] = new BigDecimal[s.length];
        for (int i = 0; i < n; i++) {
            // bdArray[i] = new BigDecimal(s[i]);
            BigDecimal max = new BigDecimal(s[i]);
            int idx = i;
            for (int j = i+1; j < n; j++) {
                BigDecimal curr = new BigDecimal(s[j]);
                
                if (curr.compareTo(max) == 1) {
                    max = curr;
                    idx = j;
                }
            }
            String temp = s[i];
            s[i] = s[idx];
            s[idx] = temp;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

// Sample Input

// 9
// -100
// 50
// 0
// 56.6
// 90
// 0.12
// .12
// 02.34
// 000.000

// Sample Output

// 90
// 56.6
// 50
// 02.34
// 0.12
// .12
// 0
// 000.000
// -100