package lesson11;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public String[] schedule = new String[DayOfWeek.values().length];


    public Human(String name, String surname, int year, int iq, Pet pet, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        initializeSchedule();
    }

    private void initializeSchedule() {
        for (DayOfWeek day : DayOfWeek.values()) {
            schedule[day.ordinal()] = "Task for " + day.name();
        }
    }

    public void greetPet() {
        System.out.println("Hello, " + (pet != null ? pet.nickname : "no pet") + "!");
    }
}