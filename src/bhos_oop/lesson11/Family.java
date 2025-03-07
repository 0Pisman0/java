package lesson11;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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

        return isBoy ? new Man(name, father.surname, iq, null, this) : new Woman(name, father.surname, iq, null, this);
    }
}
