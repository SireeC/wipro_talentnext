package collection;

import java.util.*;

public class Lambda_Expression2 {
    public static void main(String[] args) {

    	ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("C++");
        al.add("JavaScript");
        al.add("Ruby");
        al.add("Swift");
        al.add("Go");
        al.add("Kotlin");
        al.add("Scala");
        al.add("Rust");

        System.out.println("Words in reverse order:");
        Collections.reverse(al);  
        al.forEach(word -> System.out.println(word));  
    }
}
