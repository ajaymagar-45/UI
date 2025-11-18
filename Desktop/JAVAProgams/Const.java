public class Const{
Const(){
 System.out.println("This is Constructor");
}
Const(int a){ 
System.out.println("Parameterised Constructor");
}
public static void main(String[] args){
Const obj=new Const(10);
Const o=new Const();

}
}