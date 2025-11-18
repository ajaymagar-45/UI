class A3{
void a (int a){
System.out.println("Normal Method");
}
}
public class B3 extends A3{
	void a(int b){
System.out.println("Overrridden Method");
	}
public static void main(String[] args){
	B3 obj=new B3();
	obj.a(2);


}


}