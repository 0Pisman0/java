package lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class HumanTest {

    private Human human;
    private Pet pet;

    @BeforeEach
    void setUp() {
        pet = new Pet(Species.DOG, "Buddy", 3, 60, new String[]{"playing", "running"});
        human = new Human("John", "Doe", 1995, 120, pet, null, null);
    }

    @Test
    void testFeedPet_WhenTimeForFeeding_ShouldReturnTrue() {

        assertTrue(human.feedPet(true), "Hm... I will feed " + pet.getNickname() + "!");
    }
    @Test
    void testFeedPet_WhenNotTimeForFeeding_ShouldReturnTrueOrFalse() {
        Random random = new Random();
        boolean expected = pet.getTrickLevel() > random.nextInt(101);
        assertEquals(expected, human.feedPet(false), "I think "  + pet.getNickname() + " is not hungry.");
    }

    @Test
    void testEquals_SameObject_ShouldReturnTrue() {
        assertEquals(human, human, "An object should be equal to itself.");
    }



    @Test
    void testEquals_DifferentNames_ShouldReturnFalse() {
        Human differentHuman = new Human("Jane", "Doe", 1995, 120, pet, null, null);
        assertNotEquals(human, differentHuman, "Humans with different names should not be equal.");
    }

}
