
class oddeven{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scannner(System.in);
        System.out.println("Enter a Number: ");
        a=in.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}