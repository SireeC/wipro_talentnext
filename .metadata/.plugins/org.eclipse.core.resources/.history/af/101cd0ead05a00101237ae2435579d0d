package java_fundamentals;

public class Arrays8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,2,10,3,7,9,12};
		int sum=0;
		boolean skip=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {
				skip=true;
			}
			if(!skip) {
				sum+=arr[i];
			}
			if(arr[i]==7 && skip) {
				skip=false;
			}
		}
		System.out.println(sum);
	}

}
