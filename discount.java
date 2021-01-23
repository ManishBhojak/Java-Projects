import java.util.*;
class discount{
    public static void main(String args[])
    {
        int p,d,net;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the price: ");
        p=in.nextInt();
        if(p>1000)
        {
            d=p*10/100;
        }
        else {
         d=0;
        }
        net=p-d;
        System.out.println("Discount of Rs: "+d);
        System.out.println("Net Amount: Rs "+net);
        
    }
}