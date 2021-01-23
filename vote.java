import java.util.Scanner;
class vote{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        a=in.nextInt();
        if(a>=18)
        {
        System.out.println("You are eligible to vote");

        }
        else{
        System.out.println("You are not eligible to vote");
        }
    }
}