//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
          Map<String,Integer> pb = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            pb.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer pn = pb.get(s);
            if(pn != null){
                System.out.println(s + "=" + pn );
            }else{
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}