package java_fundamentals;

public class FCS17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=557755;
		int temp=num, rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		if(temp == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
