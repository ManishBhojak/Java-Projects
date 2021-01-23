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
void show(){
c=a+b;
System.out.println("Result: "+c);
}
}

class main3{
public static void main(String[] args){
add ob=new add();
ob.get();
ob.show();
}
}