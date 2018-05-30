import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            String s;
            if (p >= 2 && isPrime(p))
                System.out.println("Prime");
            else
                System.out.println("Not prime");   
        }
    }
}