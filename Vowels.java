package vowels;
import java.util.*;
public class Vowels {

    public static void main(String[] args) {
        String s;
        int vowels=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=in.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            vowels+=1;
           }
         }
        System.out.println("Total vowels are: "+vowels);
       } 
     }
    
    

