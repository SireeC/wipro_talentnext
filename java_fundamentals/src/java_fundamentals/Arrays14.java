package java_fundamentals;

public class Arrays14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int biggest=arr[0];
		
		if(arr.length<9) {
			System.out.println("Please provide 9 integer numbers.");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]>biggest) {
				biggest=arr[i];
			}
			if((i+1)%3==0) {
				System.out.println();
			}
			
		}
		System.out.println("Biggest element is: "+biggest);

	}

}
