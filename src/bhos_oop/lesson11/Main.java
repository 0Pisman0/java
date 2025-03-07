package lesson11;

public class Main {
    public static void main(String[] args) {
        // Creating a family
        Man father = new Man("John", "Doe", 1985, 120, null, null);
        Woman mother = new Woman("Jane", "Doe", 1987, 115, null, null);
        Family family = new Family(mother, father);

        // Assign the family to parents
        father.family = family;
        mother.family = family;

        // Adding a pet
        Dog dog = new Dog("Buddy", 5, 80, new String[]{"barking", "fetching"});
        family.pet = dog;
        father.pet = dog;
        mother.pet = dog;

        // Creating a child
        Human child = family.bornChild(mother, father);
        family.addChild(child);

        // Displaying family details
        System.out.println("Father: " + father.name + " " + father.surname);
        System.out.println("Mother: " + mother.name + " " + mother.surname);
        System.out.println("Child: " + child.name + " " + child.surname);
        System.out.println("Pet: " + family.pet.nickname);

        // Family members greeting pet
        father.greetPet();
        mother.greetPet();
        child.greetPet();

        // Child-specific actions
        if (child instanceof Man) {
            ((Man) child).repairCar();
        } else if (child instanceof Woman) {
            ((Woman) child).makeup();
        }
    }
}
