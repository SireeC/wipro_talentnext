package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(-6);
        numbers.add(7);
        numbers.add(-3);
        numbers.add(-8);
        numbers.add(2);
        numbers.add(-5);
        numbers.add(-10);

        List<Integer> negativeEvenNumbers = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative even numbers: " + negativeEvenNumbers);
    }
}
