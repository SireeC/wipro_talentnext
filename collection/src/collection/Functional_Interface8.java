package collection;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Functional_Interface8 {
    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2; 

            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        ArrayList<Integer> primeList = primeSupplier.get();
        System.out.println("First 10 prime numbers: " + primeList);
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
