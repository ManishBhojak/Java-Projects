class board{
int PassingMarks(){ return 0;}
}
class cbse extends board{
int PassingMarks(){ return 36;}
}
class rbse extends board{
int PassingMarks(){ return 33;}
}
class main2{
public static void main(String[] args){
cbse c=new cbse();
rbse r=new rbse();
System.out.println("CBSE Passing Marks: "+c.PassingMarks());
System.out.println("RBSE Passing Marks: "+r.PassingMarks());
}
}