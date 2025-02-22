package lesson7;

import java.util.Arrays;
import java.util.Objects;

public class Family {
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

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[newChildren.length - 1] = child;
        children = newChildren;
        child.setFamily(this);
    }
    public Human[] deleteChild(Human child) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                found = true;
                index = i;
                break;
            }
        }

        if (!found) {
            System.out.println("Child not found.");
            return children;
        }

        Human[] newChildren = new Human[children.length - 1];
        int j = 0;

        for (int i = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }

        System.out.println("Child removed successfully.");
        return newChildren;
    }

    public boolean removeChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + (mother != null ? mother.getName() + " " + mother.getSurname() : "No mother") +
                ", father=" + (father != null ? father.getName() + " " + father.getSurname() : "No father") +
                ", children=" + Arrays.toString(children) +
                ", pet=" + (pet != null ? pet.getNickname() : "No pet") +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
    @Override
    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("Family is being garbage collected.");
        super.finalize();
    }
}
