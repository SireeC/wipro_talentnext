package java_fundamentals;

public class FCS13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			boolean isPrime=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
		
			if(isPrime && i>1) {
				System.out.println(i+ " ");
			}
		}
	}

}
