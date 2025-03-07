package lesson11;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = null;
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[newChildren.length - 1] = child;
        children = newChildren;
    }

    @Override
    public Human bornChild(Human mother, Human father) {
        String[] boyNames = {"John", "Mike", "Alex"};
        String[] girlNames = {"Anna", "Emma", "Sophia"};
        Random rand = new Random();

        boolean isBoy = rand.nextBoolean();
        String name = isBoy ? boyNames[rand.nextInt(boyNames.length)] : girlNames[rand.nextInt(girlNames.length)];
        int iq = (mother.iq + father.iq) / 2;
        int birthYear = 2025;

        return isBoy ?
                new Man(name, father.surname, birthYear, iq, null, this) :
                new Woman(name, father.surname, birthYear, iq, null, this);
    }
    @Override
    public String toString() {
        StringBuilder familyDetails = new StringBuilder();
        familyDetails.append("Mother: ").append(mother).append("\n");
        familyDetails.append("Father: ").append(father).append("\n");

        if (children.length > 0) {
            familyDetails.append("Children: \n");
            for (Human child : children) {
                familyDetails.append(child).append("\n");
            }
        } else {
            familyDetails.append("No children.\n");
        }

        familyDetails.append("Pet: ").append(pet != null ? pet.nickname : "No pet").append("\n");
        return familyDetails.toString();
    }

}
