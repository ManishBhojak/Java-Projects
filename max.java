import java.util.*;
class max{
    public static void main(String args[])
    {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First number: ");
        a=in.nextInt();
        System.out.println("Enter Second number: ");
        b=in.nextInt();
        if(a>b){
            System.out.println("A is max");
        }
        else{
            System.out.println("B is max");
        }
    }
}