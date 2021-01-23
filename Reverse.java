package reverse;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        String s;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        s=sc.nextLine();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println("Reversed String :"+reverse);
    }
    
}
