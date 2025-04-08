package lesson6;
import java.util.*;

public class Student extends Human{
    private List<Course> courses = new ArrayList<>();
    private Map<String, Integer> grades = new HashMap<>();
    public Student(String name, int age, String gender, String id, String email) {
        super(name, age, gender, id, email);
    }
    public void joinCourse(Course course) {
        courses.add(course);
    }
    public void addGrade(String courseCode, int grade) {
        grades.put(courseCode, grade);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
