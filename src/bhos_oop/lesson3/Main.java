public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog","Rock",5,75,new String[]{"eat","drink","sleep"});
        Human mother = new Human("Jane", "Karleone", 1975, 90, pet1, null, null);
        Human father = new Human("Vito", "Karleone", 1972, 95, pet1, null, null);
        Human human1 = new Human("Michale","Karleone",1977,90,pet1,mother,father);
        pet1.eat();
        pet1.respond(pet1.nickname);
        pet1.foul();
        human1.greetPet();
        human1.describePet();
        System.out.println(human1.toString());
        human1.feedPet(true);
        human1.feedPet(false);
    }
}
