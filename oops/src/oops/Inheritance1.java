package oops;

class Animal{
	
	public void eat() {
		System.out.println("Animal is eating.");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping.");
	}
}

class Bird extends Animal{
	
	public void eat() {
		System.out.println("Bird can eat seeds.");
	}
	
	public void sleep() {
		System.out.println("Bird is sleeping in the nest.");
	}
	
	public void fly() {
		System.out.println("Birds are flying.");
	}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}
