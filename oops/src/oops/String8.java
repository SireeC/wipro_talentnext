package oops;
import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            result.append(str.charAt(i));
        }

        System.out.println("Result: " + result.toString());
    }
}