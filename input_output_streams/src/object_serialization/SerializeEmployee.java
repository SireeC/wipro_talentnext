package object_serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Sireesha", new Date(95, 4, 15), "IT", "Software Developer", 75000.0);

        try (FileOutputStream fileOut = new FileOutputStream("data");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(emp);
            System.out.println("Serialized data is saved in data file.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
