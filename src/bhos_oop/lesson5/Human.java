package lesson5;

import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Family family;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = new Family(mother, father);
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.family = new Family(mother, father);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname() + "!");
        } else {
            System.out.println("I don't have a pet!");
        }
    }

    public void describePet() {
        if (pet == null) {
            System.out.println("I don't have a pet to describe!");
            return;
        }

        if (pet.getTrickLevel() >= 50) {
            System.out.println("I have a " + pet.getSpecies() + " that is " + pet.getAge() + " years old, and he is very sly.");
        } else {
            System.out.println("I have a " + pet.getSpecies() + " that is " + pet.getAge() + " years old, and he is not sly.");
        }
    }

    public boolean feedPet(boolean isTimeForFeeding) {
        if (pet == null) {
            System.out.println("I don't have a pet to feed!");
            return false;
        }

        Random random = new Random();
        if (isTimeForFeeding || this.pet.getTrickLevel() > random.nextInt(101)) {
            System.out.println("Hm... I will feed " + pet.getNickname() + "!");
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, family);
    }

    @Override
    public String toString() {
        return "Human {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + (pet != null ? pet.toString() : "null") +
                ", family=" + (family != null ? "Exists" : "None") +
                '}';
    }
}
