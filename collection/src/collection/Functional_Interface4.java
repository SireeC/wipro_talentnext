package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StaffMember {
    private int id;
    private String name;
    private double salary;

    public StaffMember(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Functional_Interface4 {
    public static void main(String[] args) {

        ArrayList<StaffMember> staffList = new ArrayList<>();
        staffList.add(new StaffMember(1, "Ravi", 9500));
        staffList.add(new StaffMember(2, "Sneha", 12000));
        staffList.add(new StaffMember(3, "Amit", 8500));
        staffList.add(new StaffMember(4, "Kiran", 10000));
        staffList.add(new StaffMember(5, "Divya", 7200));
        staffList.add(new StaffMember(6, "Priya", 13500));

        Predicate<StaffMember> lowSalaryPredicate = staff -> staff.getSalary() < 10000;

        List<StaffMember> lowSalaryStaff = staffList.stream()
                .filter(lowSalaryPredicate)
                .collect(Collectors.toList());

        System.out.println("Staff members with salary less than 10000:");
        for (StaffMember staff : lowSalaryStaff) {
            System.out.println(staff.getName());
        }
    }
}
