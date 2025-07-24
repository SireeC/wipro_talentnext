package collection;

interface DigitCounter {
	int count(int n);
}

class NumberUtils {
	public static int digitCount(int n) {
		if (n == 0) return 1;
		n = Math.abs(n); 
		return (int) Math.log10(n) + 1;
	}
}

public class Method_Reference2 {
	public static void main(String[] args) {
		DigitCounter dc = NumberUtils::digitCount;

		int num = 12345;
		int count = dc.count(num);

		System.out.println("Number of digits in " + num + " is: " + count);
	}
}
