package multi;
import java.util.Scanner;
public class Multi {
int f;
Scanner in=new Scanner(System.in);
public void get(){
    System.out.print("Amount in Fact: ");
    f=in.nextInt();
}    
}
class shop extends Multi{
    int s;
    public void set(){
        s=f+10;
        System.out.println("Shop Cost of Object: "+s);
    }
}
class cust extends shop{
    int c;
    public void show(){
        c=s+10;
        System.out.println("Cost For Customer: "+c);
    }
}
class main{
    public static void main(String[] args){
        cust ob=new cust();
        ob.get();
        ob.set();
        ob.show();
    }
}