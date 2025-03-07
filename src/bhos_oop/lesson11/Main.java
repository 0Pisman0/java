package lesson11;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog("Rex", 5, 7, new String[] {"fetch", "bark"});
        Pet cat = new DomesticCat("Whiskers", 3, 8, new String[] {"scratch", "meow"});
        Pet fish = new Fish("Bubbles", 1, 3, new String[] {"swim", "bubble"});
        Pet roboCat = new RoboCat("RoboWhiskers", 2, 9, new String[] {"beep", "boop"});


        Human man = new Man("John", "Doe", 30, 110, dog, null);
        Human woman = new Woman("Jane", "Doe", 28, 120, cat, null);


        Family family = new Family(woman, man);
        family.pet = dog;

        man.greetPet();
        woman.greetPet();

        Human child = family.bornChild(man,woman);
        System.out.println("New born child: " + child.name + " " + child.surname);
        family.addChild(child);


        dog.respond();
        cat.respond();
        fish.respond();
        roboCat.respond();


        ((Foul) dog).foul();
        ((Foul) cat).foul();
        System.out.println(family);
    }
}
