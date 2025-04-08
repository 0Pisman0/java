package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Teacher  extends Human implements Teachable{
    private List<Course> courses = new ArrayList<>();
    public Teacher(String name, int age, String gender, String id, String email) {
        super(name, age, gender, id, email);
    }

    @Override
    public void teach(Course course) {
        courses.add(course);
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
