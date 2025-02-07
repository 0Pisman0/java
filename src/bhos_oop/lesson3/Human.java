import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public Human(){

    }
    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;

    }
    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.nickname + "!");
        } else {
            System.out.println("I don't have a pet!");
        }
    }
    public void describePet(){
            if (pet.trickLevel>= 50){
                System.out.println("I have an " + pet.species + " is " + pet.age + " years old, " + "he is very sly.");
            }
           else{
                System.out.println("I have an " + pet.species + " is" + pet.age + " years old, " + "he is not sly.");
            }
        }

    public boolean feedPet(boolean isTimeForFeeding){
        Random random = new Random();
        if (isTimeForFeeding || this.pet.trickLevel> random.nextInt(101)){
            System.out.println("Hm... I will feed " + pet.nickname + "!");
            return true;
        }
        else {
            System.out.println("I think  " + pet.nickname + " is not hungry.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother='" + mother.name +" "+ mother.surname + "', father='" + father.name + " " + father.surname + ", pet=" + (pet != null ? pet.toString() : "null") + "}";
    }
}
