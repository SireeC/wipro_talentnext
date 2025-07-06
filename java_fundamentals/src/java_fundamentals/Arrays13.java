package java_fundamentals;

public class Arrays13 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		if(arr.length<4) {
			System.out.println("Please provide 4 integer numbers.");
			return;
		}
		System.out.println("The reverse of the array is: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			if((arr.length-i)%2==0) {
				System.out.println();
			}
		}

	}

}
