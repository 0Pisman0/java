public class Student{
    public String name;
    public String surname;
    private String email;
    public int age;
    private int id;
    private double GPA;


    public Student(String name, String surname, String email, int age,int id, double GPA){
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.age = age;
            this.id = id;
            this.GPA = GPA;

    }
    public String CheckGPA(double GPA){
        if(GPA >= 2){
            return " passed";
        }
        else{
            return " failed";
        }
    }
    public void displayInfo() {
        System.out.println("Name : " + name + ",Surname : " + surname + ",Age : " + age);
    }
    public void isAdult(int age){
        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Young");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bro","Bros","bros@gmail.com",20,4324,3.5);
        Student student2 = new Student("Samwell","Tarly","samwell@gmail.com",17,3231,4.0);
        student1.displayInfo();
        System.out.println("Result of " + student1.name + ":" + student1.CheckGPA(student1.GPA));
        student1.isAdult(student1.age);
        student2.displayInfo();
        System.out.println("Result of " + student2.name + ":" + student2.CheckGPA(student2.GPA));
        student2.isAdult(student2.age);
    }

}


