package max;
public class Max {
int a,b;

    void  Max() {
        if(a>b){
            System.out.println("A is max");
            
        }
        else
            System.out.println("B is max");
    }
    
}
class demo{
    public static void main(String[] args){
        Max m1=new Max();
        m1.a=23;
        m1.b=54;
        
        m1.Max();
    }
}
