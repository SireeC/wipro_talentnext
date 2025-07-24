package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class EmployeeDetails {
    int id;
    String name;
    String location;
    double salary;

    public EmployeeDetails(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Functional_Interface1 {
    public static void main(String[] args) {

        ArrayList<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails(1, "Abhi", "Pune", 50000));
        employees.add(new EmployeeDetails(2, "Siree", "Mumbai", 60000));
        employees.add(new EmployeeDetails(3, "Ajay", "Delhi", 55000));
        employees.add(new EmployeeDetails(4, "Chandu", "Pune", 52000));
        employees.add(new EmployeeDetails(5, "Praneeth", "Chennai", 58000));

        Function<EmployeeDetails, String> getLocation = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();
        for (EmployeeDetails e : employees) {
            locations.add(getLocation.apply(e));
        }

        System.out.println("Employee Locations:");
        for (String loc : locations) {
            System.out.println(loc);
        }
    }
}