class pro{
String nm;
int pr,q;
void get(){
nm="Shampoo";
pr=150;
q=3;
}
void show(){
System.out.println("Name of Product: "+nm);
System.out.println("Price : "+pr);
System.out.println("Quantity: "+q);
}
public static void main(String[] args){
pro ob=new pro();
ob.get();
ob.show();
}
}