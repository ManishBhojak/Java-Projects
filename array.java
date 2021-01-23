import java.util.Scanner;
 public class array{
    public static void main(String[] args){
        int[] myarray=new int[5];
        Scanner in=new Scanner(System.in); 
        for(int i = 0;i < myarray.length; i++)
        {
            System.out.println("Enter a Number: ");
            myarray[i]=in.nextInt();
        }
        for(int k=1;k<79;k++)
        {
            System.out.print("-");
        }
        System.out.println("Enter the value to find: ");
        int f=in.nextInt();
        for(int k=1;k<79;k++)
        {
            System.out.print("-");
        }
        for(int j=0;j<myarray.length;j++)
        {
            if(myarray[j]==f)
            {
                break;
            }
            if(j==5)
            {
                System.out.println("Sorry we couldn't found such value in records");
            }
            else{
            System.out.println("found");
            }
        }
    }
}