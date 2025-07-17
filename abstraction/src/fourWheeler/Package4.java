package fourWheeler;
import com.automobile.Vehicle;
import twoWheeler.Hero;
import twoWheeler.Honda;
import fourWheeler.Logan;
import fourWheeler.Ford;

public class Package4 {

    private static void printInfo(Vehicle v) {
        System.out.println("Model       : " + v.getModelName());
        System.out.println("Reg Number  : " + v.getRegistrationNumber());
        System.out.println("Owner       : " + v.getOwnerName());
    }

    public static void main(String[] args) {

        Hero   bike   = new Hero("Splendor Plus", "KA‑05‑AB‑1234", "Krishna", 85);
        Honda  honda  = new Honda("City ZX",       "MH‑12‑CD‑5678", "Siva", 96);
        Logan  logan  = new Logan("Renault Logan", "DL‑01‑EF‑2468", "Raghav", 65);
        Ford   ecosport = new Ford("EcoSport",     "TN‑09‑GH‑1122", "Murari", 70);

        System.out.println("\n=== HERO BIKE ===");
        printInfo(bike);
        System.out.println("Current speed : " + bike.getspeed() + " km/h");
        bike.radio();

        System.out.println("\n=== HONDA CAR ===");
        printInfo(honda);
        System.out.println("Current speed : " + honda.getspeed() + " km/h");
        honda.cdplayer();

        System.out.println("\n=== LOGAN CAR ===");
        printInfo(logan);
        System.out.println("Current speed : " + logan.getspeed() + " km/h");
        logan.gps();

        System.out.println("\n=== FORD CAR ===");
        printInfo(ecosport);
        System.out.println("Current speed : " + ecosport.getspeed() + " km/h");
        ecosport.tempcontrol();
    }
}