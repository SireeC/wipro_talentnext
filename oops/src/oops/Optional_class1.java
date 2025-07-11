package oops;
import java.util.*;

public class Optional_class1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] names = new String[5];
        Optional<String> name = Optional.ofNullable(names[0]);

        if (name.isPresent()) {
            System.out.println("Length: " + name.get().length());
        } 
        else {
            System.out.println("Name is null");
        }
    }
}
