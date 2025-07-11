package oops;

class Box{
	int width;
	int height;
	int depth;
	
	Box(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	int getvolume() {
		return width*height*depth;
	}
}

public class class_object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox = new Box(4,6,5);
		int result = mybox.getvolume();
		System.out.println("Volume of the box: \n" +result);

	}

}
