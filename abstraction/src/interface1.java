interface vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class interface1 implements vehicle,FourWheeler{
	public void message() {
		vehicle.super.message();
		FourWheeler.super.message();
	}
	public static void main(String[]args) {
		interface1 obj=new interface1();
		obj.message();
	}
}