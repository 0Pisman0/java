package lesson6;

public abstract class Human {
    protected String name;
    protected int age;
    protected String gender;
    protected String id;
    protected String email;
    public Human(String name, int age, String gender, String id, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.email = email;
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
