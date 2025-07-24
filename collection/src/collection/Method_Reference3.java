package collection;

interface PrimeChecker {
	void check(int n);
}

class NumberTest {
	public NumberTest(int n) {
		if (isPrime(n)) {
			System.out.println(n + " is Prime");
		} 
		else {
			System.out.println(n + " is Not Prime");
		}
	}

	private boolean isPrime(int num) {
     	if (num <= 1) return false;
     	for (int i = 2; i <= Math.sqrt(num); i++) {
    	 	if (num % i == 0) return false;
     	}
     	return true;
 	}
}

public class Method_Reference3 {
	public static void main(String[] args) {
     	PrimeChecker pc = NumberTest::new;

     	pc.check(7);  
     	pc.check(10);  
 	}
}
