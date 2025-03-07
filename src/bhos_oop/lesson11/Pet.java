package lesson11;

public abstract class Pet {
    public Species species;
    public String nickname;
    final int age;
    public int trickLevel;
    public String[] habits;

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public abstract void respond();
}
