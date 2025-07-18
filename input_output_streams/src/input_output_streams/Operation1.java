package input_output_streams;
import java.io.*;
import java.util.*;

public class Operation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = sc.nextLine().toLowerCase().charAt(0); 

        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            int c;

            while ((c = fr.read()) != -1) {
                if (Character.toLowerCase((char)c) == ch) {
                    count++;
                }
            }

            fr.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}