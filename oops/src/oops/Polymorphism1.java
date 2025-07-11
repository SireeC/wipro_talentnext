package oops;

class Fruit{
	
	String name;
	String taste;
	String size;
	
	Fruit(String name, String taste, String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	
	public void eat() {
		System.out.println("Fruit: "+name+"\nTaste: "+taste+"\nSize: "+size);
	}
}

class Apple extends Fruit{
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
	}
	
	public void eat() {
		System.out.println("Taste of the Apple: "+taste);
	}
}

class Orange extends Fruit{
	public Orange(String name, String taste, String size) {
		super(name, taste, size);
	}
	
	public void eat() {
		System.out.println("Taste of the Orange: "+taste);
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Apple("Apple","Sweet","Medium");
		Fruit orange=new Orange("Orange","Sour","Small");
		
		apple.eat();
		orange.eat();

	}

}
