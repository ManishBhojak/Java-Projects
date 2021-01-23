package bill;
import java.util.Scanner;
public class Bill {
    double price,quant,net,bill;
    double disc;
   
    void net_bill(){
        bill=price*quant;
        net=bill-disc;
        System.out.println("Total_Bill: "+bill);
        System.out.println("Discount: "+disc);
       System.out.println("Net bill"+net);
    }
    
}
class disc{
    public static void main(String[] args){
        Bill  m1=new Bill();
        System.out.print("Enter the price of the product: ");
        Scanner in=new Scanner(System.in);
        m1.price=in.nextDouble();
        
        System.out.println("Enter the Quantity: ");
        m1.quant=in.nextDouble();
     if(m1.price>2000)
     {
        m1.disc=0.10;        
     }
     else
         m1.disc=0.0;
  
    //Printing the values
     m1.net_bill();
    
    }
}
