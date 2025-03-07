package lesson11;

final class Man extends Human {
    public Man(String name, String surname, int year, int iq, Pet pet, Family family) {
        super(name, surname, year, iq, pet, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy come here! " + (pet != null ? pet.nickname : "no pet"));
    }

    public void repairCar() {
        System.out.println("Fixing the car...");
    }
    @Override
    public String toString() {
        return "Man [Name: " + name + ", Surname: " + surname + ", Year: " + year + ", IQ: " + iq + "]";
    }
}
