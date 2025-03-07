package lesson11;

class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.ROBOCAT;
    }

    @Override
    public void respond() {
        System.out.println("Beep boop! I am a robot cat.");
    }
}
