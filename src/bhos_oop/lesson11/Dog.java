package lesson11;

class Dog extends Pet implements Foul {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am " + nickname);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover my mess...");
    }
}
