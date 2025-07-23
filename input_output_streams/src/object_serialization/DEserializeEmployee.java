package object_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DEserializeEmployee {
    public static void main(String[] args) {
        Employee emp = null;

        try (FileInputStream fileIn = new FileInputStream("data");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            emp = (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (emp != null) {
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + emp.getName());
            System.out.println("Date of Birth: " + emp.getDateOfBirth());
            System.out.println("Department: " + emp.getDepartment());
            System.out.println("Designation: " + emp.getDesignation());
            System.out.println("Salary: " + emp.getSalary());
        }
    }
}

