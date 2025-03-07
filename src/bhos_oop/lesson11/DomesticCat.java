package lesson11;

class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.CAT;
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am " + nickname);
    }

    @Override
    public void foul() {
        System.out.println("I scratched the couch...");
    }
}
