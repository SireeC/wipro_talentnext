package java_fundamentals;

public class FCS16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int reverse=0;
		
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println(reverse);

	}

}
