import java.util.*;
class result{
    public static void main(String args[])
    {
        int p;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Percentage");
        p=in.nextInt();
        if(p>=36)
        {
            System.out.println("Pass");

        }
        else{
            System.out.println("Fail");
        }
    }
}