package oops;
import java.util.*;

public class StringJoiner1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            joiner.add(name);
        }

        System.out.println("Output: " + joiner.toString());

        sc.close();
    }
}