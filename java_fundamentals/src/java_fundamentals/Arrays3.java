package java_fundamentals;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = {24,5,525,54,64,3,47,5};
	    int num=64;
	    int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				index=i;
				break;
			}
		}
		System.out.println(index);

	}

}
