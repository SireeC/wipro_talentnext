package collection;

import java.util.ArrayList;

public class Lambda_Expression3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("apple");
        al.add("banana");
        al.add("grape");
        al.add("orange");
        al.add("kiwi");
        al.add("melon");
        al.add("papaya");
        al.add("berry");
        al.add("peach");
        al.add("plum");

        al.stream()
          .filter(word -> word.length() % 2 != 0)
          .forEach(System.out::println);
    }
}
