class Animal{
	void eat(){
		System.out.println("Eat");
		
	}


}
class cat extends Animal{
	void Meow(){
	System.out.println("Meow");
}
	
}
class Dog extends Animal{
	void Bark(){
System.out.println("Barking");
}
public static void main(String [] args){
Dog obj=new Dog();
obj.eat();
obj.Bark();

cat obj1=new cat();
obj1.eat();
obj1.Meow();
}
}