import java.util.*;
class bill{
    public static void main(String[] args) {
        double p,q,b;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Price of the Product: ");
        p=in.nextDouble();
        System.out.print("Enter Quantity of the Product: ");
        q=in.nextDouble();
        b=p*q;
        System.out.println("Total Bill: "+b);
    }
}