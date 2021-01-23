import java.util.*;
class sum{
int a,b;
Scanner in=new Scanner(System.in);
void get(){
System.out.print("Enter a Number: ");
a=in.nextInt();
System.out.print("Enter second Number: ");
b=in.nextInt();
}
}

class add extends sum{
int c;
void set(){
c=a+b;
System.out.println("Result: "+c);
}
}

class oversum extends add{
int f;
void show(){
f=c+10;
System.out.println("Final Result: "+f);
}
}

class main4{
public static void main(String[] args){
oversum ob=new oversum();
ob.get();
ob.set();
ob.show();
}
}