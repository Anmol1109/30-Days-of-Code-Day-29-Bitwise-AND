import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
    
    public static int maximum(int n,int k){
        int max = 0;
        int a = n - 1;
        while(a--  > 0){
            for(int b = a + 1;b <= n;b++){
                int test = a & b;
                if(test < k && test > max)
                    max = test;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            System.out.println(maximum(n,k));
        }

        scanner.close();
    }
}
