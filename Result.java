package result;
import java.util.*;
public class Result {
 double P,C,M,t,per;
    void Results() {
        t=P+C+M;
        per=t/3;
        System.out.println("Total Marks: "+t);
        System.out.println("Total Percentage: "+per);
    }
    
}
class values{
    public static void main(String[] args){
        Result r1=new Result();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Physics Marks: ");
        r1.P=in.nextDouble();
        System.out.print("Enter Chemistry Marks: ");
        r1.C=in.nextDouble();
        System.out.print("Enter Maths Marks: ");
        r1.M=in.nextDouble();
        
        r1.Results();
    }
}
