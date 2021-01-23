import java.util.*;
class negpos{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}