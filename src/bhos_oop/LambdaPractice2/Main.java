package LambdaPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", "Smith", 'F', 92, "1994-05-20"));
        students.add(new Student(1, "Vector", "Brown", 'M', 85, "2005-07-15"));
        students.add(new Student(2, "Charlie", "Davis", 'M', 92, "1994-05-20"));
        students.add(new Student(4, "Sandy", "Evans", 'F', 85, "1994-05-19"));
        students.add(new Student(5, "Emma", "Clark", 'F', 92, "1994-05-19"));
        students.add(new Student(6, "Frank", "Clark", 'F', 92, "1994-05-19"));
        Collections.sort(students);
        System.out.println("Students sorted in ascending order by id:");
        students.forEach(s -> System.out.println(s.toString()));

        students.sort(new Checker());
        System.out.println("Students are sorted:");
        students.forEach(s -> System.out.println(s.toString()));
    }
}
