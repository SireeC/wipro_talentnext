package collection;

interface FactorialCalculator {
	int compute(int n);
}

class MyMath {
	public int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}

public class Method_Reference1 {
	public static void main(String[] args) {
		MyMath math = new MyMath();

		FactorialCalculator fc = math::factorial;

		int num = 5;
		int result = fc.compute(num);

		System.out.println("Factorial of " + num + " is: " + result);
	}
}
