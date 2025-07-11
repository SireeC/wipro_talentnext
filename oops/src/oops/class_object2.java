package oops;

class Calculator{
	public static int powerInt(int num1, int num2) {
		return(int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

public class class_object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intResult = Calculator.powerInt(5, 2);
		double doubleResult = Calculator.powerDouble(3.5, 2);
		
		System.out.println("powerInt value: " +intResult);
		System.out.println("powerDouble value: " +doubleResult);
	}

}
