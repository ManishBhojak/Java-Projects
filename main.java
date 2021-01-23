import java.util.*;
class fact{ Scanner in = new Scanner(System.in); int pr;
public void get(){
System.out.print("Enter Price in Factory: ");
pr=in.nextInt();}}
class shop extends fact{int x;
public void set(){x=pr+10;
System.out.println("Price on shop: "+x);}}
class cust extends shop{int y;
public void show(){y=x+10;
System.out.println("Price for Customer: "+y);
}
}
class main{
public static void main(String[] args){
cust ob=new cust();
ob.get();
ob.set();
ob.show();}}