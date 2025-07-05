package java_fundamentals;

public class FCS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==0) {
			System.out.println("No value");
		}
		else {
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
				if(i<args.length -1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

	}

}
