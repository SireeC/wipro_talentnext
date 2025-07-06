package java_fundamentals;

public class Arrays1 {

	public static void main(String[] args) {

		int array[] = {1,3,4,5,9};
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		float avg=sum/2;
		
		System.out.println("The sum is: "+sum);
		System.out.println("The average is: "+avg);

	}

}
