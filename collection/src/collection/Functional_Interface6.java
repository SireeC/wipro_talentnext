package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Functional_Interface6 {
    public static void main(String[] args) {
        // Step 1: Create and populate ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cat");
        words.add("dog");
        words.add("elephant");
        words.add("fish");
        words.add("grape");
        words.add("hat");
        words.add("ice");
        words.add("jungle");

        Consumer<List<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        reverseWords.accept(words);

        System.out.println("Reversed words:");
        words.forEach(System.out::println);
    }
}
