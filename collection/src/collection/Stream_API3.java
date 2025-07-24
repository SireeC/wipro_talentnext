package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Stream_API3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rahul", 45));
        students.add(new Student(2, "Priya", 78));
        students.add(new Student(3, "Amit", 62));
        students.add(new Student(4, "Sneha", 38));
        students.add(new Student(5, "Karan", 55));

        List<Student> passedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        int passedCount = passedStudents.size();
        System.out.println("Number of students who cleared the test: " + passedCount);
    }
}
