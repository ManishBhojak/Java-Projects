import java.util.*;
class function{
    public static void main(String[] args)
    {
        int a=2;
        int b=3;
        int add=a+b;
        int add2=add(a,b);
        System.out.println(add);
        System.out.println(add2);
        boolean NumberPrime=isNumberPrime(7);
        System.out.println(NumberPrime);
        
    }
    static int add(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    static boolean isNumberPrime(int a)
    {
        for(int i=2;i<a; i++)
        {
            if(a%i==0)
            return false;
        }
        return true;
    }
}
