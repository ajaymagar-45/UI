class Tree{
void a(){
System.out.println("Parent Class");
}
}
class Branch extends Tree{
	void c(){
		System.out.println("This is Another Method");
	}
}
public class Root extends Tree{
void b(){
System.out.println("Child class");
}
public static void main(String [] args){
Root obj=new Root();
obj.b();
obj.a();
Branch obj1=new Branch();
obj1.c();
obj1.a();

}

}
