class Const_2{
 Const_2(){
 System.out.println("This is constructor of parent class");
 }
}
public class Const_1 extends Const_2{
   Const_1(){
        System.out.println("This is Constructor of child class");
}
  Const_1(int a){
	  System.out.println("This is parameterised Constructor");
  }
public static void main(String[] args){
Const_1 obj=new Const_1(6);
}

}