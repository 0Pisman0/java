package lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Exam> exams = new ArrayList<>();


        Teacher t1 = new Teacher("Coraline", 35, "F", "T001", "coraline@example.com");
        Teacher t2 = new Teacher("Murad", 40, "M", "T002", "murad@example.com");
        teachers.add(t1);
        teachers.add(t2);


        for (int i = 1; i <= 5; i++) {
            students.add(new Student("Student" + i, 20 + i, "M", "S00" + i, "student" + i + "@mail.com"));
        }


        for (Student student : students) {
            Course c1 = new Course("C" + student.getId() + "_1", "Math", t1);
            Course c2 = new Course("C" + student.getId() + "_2", "History", t2);
            c1.enrollStudent(student);
            c2.enrollStudent(student);
            student.joinCourse(c1);
            student.joinCourse(c2);
            courses.add(c1);
            courses.add(c2);


            Exam e1 = new Exam(c1.getCode());
            Exam e2 = new Exam(c2.getCode());
            e1.assignGrade(student, (int)(Math.random() * 50 + 50));
            e2.assignGrade(student, (int)(Math.random() * 50 + 50));
            exams.add(e1);
            exams.add(e2);
        }


        FileOperations.writeToFile("students.json", students);
        FileOperations.writeToFile("teachers.json", teachers);
        FileOperations.writeToFile("courses.json", courses);
        FileOperations.writeToFile("exams.json", exams);
    }
}


