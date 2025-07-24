package collection;

import java.util.ArrayList;
import java.util.function.Function;

public class Functional_Interface2 {
    public static void main(String[] args) {

    	ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(15);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(35);
        numbers.add(50);
        numbers.add(60);

        Function<ArrayList<Integer>, Integer> calculateSum = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        int total = calculateSum.apply(numbers);
        System.out.println("Sum of all elements: " + total);
    }
}
