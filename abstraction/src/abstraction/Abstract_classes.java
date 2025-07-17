package abstraction;

abstract class Compartment{
	public abstract void notice();
}

class firstClass extends Compartment{
	public void notice() {
		System.out.println("Notice: You are in a first class compartment.");
	}
}

class ladies extends Compartment{
	public void notice() {
		System.out.println("Notice: You are in a ladies class compartment.");
	}
}

class general extends Compartment{
	public void notice() {
		System.out.println("Notice: You are in a general class compartment.");
	}
}

class luggage extends Compartment{
	public void notice() {
		System.out.println("Notice: You are in a luggage class compartment.");
	}
}
public class Abstract_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] a = new Compartment[10];
		for(int i=0;i<a.length;i++) {
			int r=1+(int)(Math.random()*4);
			switch(r) {
			case 1:
				a[i]=new firstClass(); break;
			case 2:
				a[i]=new ladies(); break;
			case 3:
				a[i]=new general(); break;
			case 4:
				a[i]=new luggage(); break;
			}
		}
		for(Compartment c:a) {
			c.notice();
		}

	}

}
