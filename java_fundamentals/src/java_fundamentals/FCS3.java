package java_fundamentals;
import java.util.Scanner;

public class FCS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("No values");
			String s = sc.nextLine();
			if(s=="") {
				System.out.println("No Values");
			}
			else {
				String[] words=s.split(" " );
				String result = String.join("," , words);
				System.out.println(result);
			}
			sc.close();
	}

}
