package lesson7;

import java.util.Arrays;

enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    BIRD(true, 2, false),
    FISH(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() { return canFly; }
    public int getNumberOfLegs() { return numberOfLegs; }
    public boolean hasFur() { return hasFur; }
}

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public Pet(){

    }
    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    void eat(){
        System.out.println("I am Eating.");
    }
    void respond(){
        System.out.println("Hello, owner. I am " + this.nickname + " . I miss you!");
    }
    void foul(){
        System.out.println("I need to cover it up.");
    }
    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }
    @Override
    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("Pet " + nickname + " is being garbage collected.");
        super.finalize();
    }

}

