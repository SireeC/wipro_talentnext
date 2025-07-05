package java_fundamentals;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,14,20,17,6};
		int a=arr[0];
		int b=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			a=Math.max(a, arr[i]);
			b=Math.min(b, arr[i]);
		}
		
		System.out.println("Maximum is: "+a);
		System.out.println("Minimum is: "+b);

	}

}
