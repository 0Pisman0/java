package lesson11;

final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, Pet pet, Family family) {
        super(name, surname, year, iq, pet, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my dear " + (pet != null ? pet.nickname : "no pet"));
    }

    public void makeup() {
        System.out.println("Applying makeup...");
    }
    @Override
    public String toString() {
        return "Woman [Name: " + name + ", Surname: " + surname + ", Year: " + year + ", IQ: " + iq + "]";
    }
}
