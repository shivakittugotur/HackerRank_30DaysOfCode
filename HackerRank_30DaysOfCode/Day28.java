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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> l1  = new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String email[] = firstNameEmailID[1].split("@");
            if(email[1].equals("gmail.com")){
                l1.add(firstName);
            }
        }
        Collections.sort(l1);
        for(String name : l1){
            System.out.println(name);
        }
        scanner.close();
        
    }
}
