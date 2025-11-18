class AA1{
void aa(){
System.out.println("This is First method");
}
void test(){
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
	
}
}
class BB1 extends AA1{
public static void main(String [] args){	
BB1 obj=new BB1();
obj.aa();
obj.test();
}
}