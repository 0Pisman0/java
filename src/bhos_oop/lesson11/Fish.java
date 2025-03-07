package lesson11;

class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("Blub! I am a fish.");
    }
}
