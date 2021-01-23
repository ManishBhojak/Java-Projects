import java.util.*;
class maxinvalues{
  
    int a,b;
    Scanner in=new Scanner(System.in);
    void get(){
    System.out.print("Enter First Value: ");
    a=in.nextInt();
    System.out.print("Enter Second Value: ");
    b=in.nextInt();
    }
    void show(){
        if(a>b)
        System.out.println("A is Max");
        else
        System.out.println("B is Max");
    }
    public static void main(String[] args){
        maxinvalues ob=new maxinvalues();
        ob.get();
        ob.show();
    }
}
    
        
    
