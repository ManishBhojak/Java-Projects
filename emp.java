interface one{ void get();}
interface two{ void show();}
class emp implements one,two{
String nm,des;
int a,sal;
public void get(){
nm="Tarun";
des="Accountant";
a=23;
sal=12000;
}
public void show(){
System.out.println("Emp Name: "+nm);
System.out.println("Emp Designation: "+des);
System.out.println("Emp Age: "+a);
System.out.println("Emp Salary: "+sal);
}
public static void main(String[] args){
emp ob=new emp();
ob.get();
ob.show();
}
}