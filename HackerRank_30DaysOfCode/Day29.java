import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int max = 0;
            int j = n - 1;
            while(j-- > 0) {
                for(int i=j+1; i<=n;i++){
                    int p=j&i;
                    if(p<k&&p>max){
                        max=p;
                    }
                }
            }
            System.out.println(max);
            }

        scanner.close();
    }
}
