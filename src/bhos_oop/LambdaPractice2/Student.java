package LambdaPractice2;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    int grade;
    char gender;
    LocalDate birthdate;

    public Student(int id, String name, String surname, char gender, int grade, String birthdate) {
        this.id = id;
        this.name = name;
        this.surname = "";
        this.gender = gender;
        this.grade = grade;
        this.birthdate = LocalDate.parse(birthdate);

    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", grade=" + grade + ", birthday=" + birthdate + "]";
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getGrade() { return grade; }
    public char getGender() { return gender; }
    public LocalDate getBirthdate() { return birthdate; }




}
