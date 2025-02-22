package lesson7;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet(Species.DOG, "Buddy", 3, 75,new String[]{"JUmp","Eat","Bark"});
        Pet pet2 = new Pet(Species.CAT,"Bunud",1,120,new String[]{"Jump","Eat","Meow"});

        Human mother = new Human("Alice", "Smith", 1985);
        Human father = new Human("Bob", "Smith", 1983);


        Family family = new Family(mother, father);


        Human child1 = new Human("Charlie", "Smith", 2010);
        Human child2 = new Human("Daisy", "Smith", 2013);
        child1.setPet(pet);
        child2.setPet(pet2);


        family.addChild(child1);
        family.addChild(child2);


        family.setPet(pet);


        System.out.println("\nInitial Family State:");
        System.out.println(family);


        System.out.println("\nChild's Family Reference:");
        System.out.println("Child 1's family: " + child1.getFamily());
        System.out.println("Child 2's family: " + child2.getFamily());


        System.out.println("\nChild interacting with pet:");
        child1.greetPet();
        child1.describePet();


        System.out.println("\nFeeding pet:");
        child1.feedPet(false);
        child1.feedPet(true);


        System.out.println("\nRemoving child by index (0)...");

        System.out.println("Family after removing first child:");
        System.out.println(family);
        family.deleteChild(child1);
        System.out.println(family.toString());
        for (int i = 0; i < 1000000; i++) {
            new Human("Child" + i, "surname", 14, 50, pet2, mother, father);
        }

        System.gc();




    }
}
