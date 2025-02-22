package lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    private Human mother;
    private Human father;
    private Human child1;
    private Human child2;
    private Pet pet;
    private Family family;

    @BeforeEach
    void setUp() {

        mother = new Human("Jane", "Doe", 30);
        father = new Human("John", "Doe", 32);
        child1 = new Human("Alice", "Doe", 8);
        child2 = new Human("Bob", "Doe", 6);
        pet = new Pet(Species.DOG, "Buddy");



        family = new Family(mother, father);
    }

    @Test
    void testConstructorWithMotherAndFather() {
        Family family = new Family(mother, father);
        assertNotNull(family);
        assertEquals(mother, family.getMother());
        assertEquals(father, family.getFather());
        assertEquals(0, family.getChildren().length);
        assertNull(family.getPet());
    }

    @Test
    void testConstructorWithMotherFatherChildrenAndPet() {
        Family family = new Family(mother, father, new Human[]{child1, child2}, pet);
        assertNotNull(family);
        assertEquals(mother, family.getMother());
        assertEquals(father, family.getFather());
        assertArrayEquals(new Human[]{child1, child2}, family.getChildren());
        assertEquals(pet, family.getPet());
    }

    @Test
    void testAddChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        assertEquals(child1, family.getChildren()[0]);
    }

    @Test
    void testRemoveChild() {
        family.addChild(child1);
        family.addChild(child2);
        assertTrue(family.removeChild(0));
        assertEquals(1, family.getChildren().length);
        assertEquals(child2, family.getChildren()[0]);
    }

    @Test
    void testRemoveChild_InvalidIndex() {
        family.addChild(child1);
        assertFalse(family.removeChild(2)); // Invalid index
        assertEquals(1, family.getChildren().length);
    }

    @Test
    void testCountFamily() {
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(pet);
        assertEquals(4, family.countFamily());
    }

    @Test
    void testToString() {
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(pet);
        String expected = "Family{" +
                "mother=Jane Doe, father=John Doe, children=[Human {name='Alice', surname='Doe', year=8, iq=0, pet=null, family=Exists, schedule=[Task for MONDAY, Task for TUESDAY, Task for WEDNESDAY, Task for THURSDAY, Task for FRIDAY, Task for SATURDAY, Task for SUNDAY]}, Human {name='Bob', surname='Doe', year=6, iq=0, pet=null, family=Exists, schedule=[Task for MONDAY, Task for TUESDAY, Task for WEDNESDAY, Task for THURSDAY, Task for FRIDAY, Task for SATURDAY, Task for SUNDAY]}], pet=Buddy}";
        assertEquals(expected, family.toString());
    }

    @Test
    void testHashCode() {
        Family family1 = new Family(mother, father, new Human[]{child1, child2}, pet);
        Family family2 = new Family(mother, father, new Human[]{child1, child2}, pet);
        assertEquals(family1.hashCode(), family2.hashCode());
    }

    @Test
    void testFinalize() throws Throwable {
        assertDoesNotThrow(() -> {
            family.finalize();
        });
    }
}
