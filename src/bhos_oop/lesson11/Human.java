package lesson11;

import java.time.DayOfWeek;

class Human {
    protected String name;
    protected String surname;
    protected int year;
    protected int iq;
    protected Pet pet;
    protected Family family;
    protected String[] schedule = new String[DayOfWeek.values().length];

    public Human(String name, String surname, int year, int iq, Pet pet, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.family = family;
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