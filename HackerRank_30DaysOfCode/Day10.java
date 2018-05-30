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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int c = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            c = (binary[i] == '0') ? 0 : c + 1; 
            if(c > maxCount){
                maxCount = c;
            }
        }
        System.out.println(maxCount);
        scanner.close();
        
    }
}
