package lesson6;

import java.util.*;

public class Exam {
    private String courseCode;
    private Map<String, Integer> studentGrades = new HashMap<>();

    public Exam(String courseCode) {
        this.courseCode = courseCode;
    }

    public void assignGrade(Student student, int grade) {
        studentGrades.put(student.getId(), grade);
        student.addGrade(courseCode, grade);
    }

    public String getCourseCode(){
        return courseCode;

    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
}

