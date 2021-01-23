import java.util.Scanner;
class practice{
    public static void main(String[] args){
        int n;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=in.nextInt();
        if(n%2==1&& n<20)
        System.out.println("Wierd");
        else if(n%2==0 && n>=2&&n<=5||n>20)
        System.out.println("Not Wierd");
        else if(n%2==0 && n>=6&&n<=20)
            System.out.println("Wierd");
        
        
    }
}