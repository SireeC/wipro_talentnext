package twoWheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle{
	String ModelName;
	String RegistrationNumber;
	String OwnerName;
	int speed;
	
	public Honda(String ModelName, String RegistrationNumber, String OwnerName, int speed) {
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
		this.speed=speed;
	}
	
	public String getModelName() {
		return ModelName;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public int getspeed() {
		return speed;
	}
	public void cdplayer() {
		System.out.println("Honda");
	}

}
