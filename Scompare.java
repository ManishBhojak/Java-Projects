package scompare;
import java.util.*;
public class Scompare {
    public static void main(String[] args) {
       String s1,s2,s3;
       Scanner in=new Scanner(System.in);
       System.out.print("Enter First String: ");
       s1=in.nextLine();
       System.out.print("Enter Second String: ");
       s2=in.nextLine();
       System.out.print("Enter Third String: ");
       s3=in.nextLine();
       if(s1.equals(s2)&&s1.equals(s3))
           System.out.println("All Strings are Same");
       else
           System.out.println("Strings are not Same");
               
    }
    
}
