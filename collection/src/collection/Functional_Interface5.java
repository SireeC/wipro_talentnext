package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functional_Interface5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(16);
        numbers.add(18);
        numbers.add(25);
        numbers.add(28);
        numbers.add(36);
        numbers.add(40);

        List<Integer> perfectSquares = numbers.stream()
                .filter(n -> isPerfectSquare(n))
                .collect(Collectors.toList());

        System.out.println("Perfect square numbers:");
        for (int num : perfectSquares) {
            System.out.println(num);
        }
    }

    private static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
