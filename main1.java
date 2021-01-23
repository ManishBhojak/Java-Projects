import java.util.*;
class stud{ Scanner in=new Scanner(System.in); int p;
public void get(){
System.out.print("Enter your Percentage: "); p=in.nextInt();
}
}
class result extends stud{
void show(){
if(p>=36)
System.out.println("Pass");
else
System.out.println("Fail");
}
}
class main1{
public static void main(String[] args){
result ob=new result();
ob.get();
ob.show();
}
}