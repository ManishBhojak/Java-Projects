import java.util.*;
class mresult{
    int p,c,m,t,per;
    Scanner in=new Scanner(System.in);
    void get(){
        System.out.print("Enter physics marks: ");
        p=in.nextInt();
        System.out.print("Enter Chemistry marks: ");
        c=in.nextInt();
        System.out.print("Enter Maths marks: ");
        m=in.nextInt();
    }
    void show(){
        t=p+c+m;
        per=t/3;
        System.out.println("Total Marks: "+t);
        System.out.println("Percentage: "+per);
    }
    public static void main(String[] args) {
        mresult ob=new mresult();
        ob.get();
        ob.show();
    }
}