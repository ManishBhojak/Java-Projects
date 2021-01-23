import java.util.*;
class methodbill{
    double p,q,b,disc,net;
    Scanner in=new Scanner(System.in);
    void get(){
        System.out.print("Enter Price: ");
        p=in.nextDouble();
        System.out.print("Enter Quantity: ");
        q=in.nextDouble();
    }
    void show(){
        b=p*q;
        System.out.println("Bill: "+b);
        if(b>2000){
        disc=b*0.20;
        System.out.println("Discount: "+disc);
        }
        else{
        disc=b*0;
        System.out.println("Discount: "+disc);
        }
        net=b-disc;
        System.out.println("Net Bill: "+net);
    }
    public static void main(String[] args){
        methodbill ob=new methodbill();
        ob.get();
        ob.show();
    }
}