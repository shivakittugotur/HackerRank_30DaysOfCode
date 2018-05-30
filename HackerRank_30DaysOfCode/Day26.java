import java.io.*;
import java.util.*;
class DateOfReturn{
    public int day;
    public int month; 
    public int year;
    
    DateOfReturn(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        Date actualDate=new Date(y, m-1, d);
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        Date expectedDate=new Date(y, m-1, d);
        if(actualDate.compareTo(expectedDate)<=0)
            System.out.println(0);
        else{
            if(actualDate.getMonth()==expectedDate.getMonth()&&actualDate.getYear()==expectedDate.getYear())
                System.out.println(15*(actualDate.getDate()-expectedDate.getDate()));
            else if(actualDate.getYear()==expectedDate.getYear())
                System.out.println(500*(actualDate.getMonth()-expectedDate.getMonth()));
            else
                System.out.println(10000);

        }
        
    }
}