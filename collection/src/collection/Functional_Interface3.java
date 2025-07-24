package collection;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class Functional_Interface3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("madam");
        words.add("level");
        words.add("hello");
        words.add("world");
        words.add("civic");
        words.add("java");
        words.add("noon");
        words.add("code");
        words.add("radar");
        words.add("refer");

        Predicate<String> isPalindrome = word -> 
            word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        List<String> palindromeWords = words.stream()
                .filter(isPalindrome)
                .collect(Collectors.toList());

        System.out.println("Palindrome words:");
        for (String word : palindromeWords) {
            System.out.println(word);
        }
    }
}
