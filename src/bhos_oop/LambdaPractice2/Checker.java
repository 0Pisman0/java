package LambdaPractice2;
import java.util.*;
import java.util.Comparator;

public class Checker implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Comparator.comparing((Student s) -> s.getGrade()).reversed()
                .thenComparing((Student s) -> s.getBirthdate())
                .thenComparing((Student s) -> s.getGender())
                .thenComparing((Student s) -> s.getSurname())
                .thenComparing((Student s) -> s.getName(), Comparator.reverseOrder())
                .compare(s1, s2);
    }
}
