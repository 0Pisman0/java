package lesson6;

import java.util.*;

public class Exam implements Gradable {
    private String courseCode;
    private Map<String, Integer> studentGrades = new HashMap<>();

    public Exam(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
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

    public Map<String, Integer> getStudentGrades() {
        return studentGrades;
    }
}


