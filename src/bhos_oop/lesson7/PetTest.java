package lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet pet;

    @BeforeEach
    void setUp() {
        pet = new Pet(Species.CAT, "Whiskers", 3, 5, new String[]{"Play", "Sleep"});
    }

    @Test
    void testConstructorWithSpeciesAndNickname() {
        Pet pet = new Pet(Species.DOG, "Rex");
        assertNotNull(pet);
        assertEquals(Species.DOG, pet.getSpecies());
        assertEquals("Rex", pet.getNickname());
    }

    @Test
    void testConstructorWithFullDetails() {
        Pet pet = new Pet(Species.BIRD, "Tweety", 2, 4, new String[]{"Sing", "Fly"});
        assertNotNull(pet);
        assertEquals(Species.BIRD, pet.getSpecies());
        assertEquals("Tweety", pet.getNickname());
        assertEquals(2, pet.getAge());
        assertEquals(4, pet.getTrickLevel());
        assertArrayEquals(new String[]{"Sing", "Fly"}, pet.getHabits());
    }

    @Test
    void testGetAndSetNickname() {
        pet.setNickname("Fluffy");
        assertEquals("Fluffy", pet.getNickname());
    }

    @Test
    void testGetAndSetAge() {
        pet.setAge(4);
        assertEquals(4, pet.getAge());
    }

    @Test
    void testGetAndSetTrickLevel() {
        pet.setTrickLevel(6);
        assertEquals(6, pet.getTrickLevel());
    }

    @Test
    void testGetAndSetHabits() {
        pet.setHabits(new String[]{"Play", "Run"});
        assertArrayEquals(new String[]{"Play", "Run"}, pet.getHabits());
    }

    @Test
    void testEat() {
        pet.eat();
        assertDoesNotThrow(() -> pet.eat());
    }

    @Test
    void testRespond() {
        pet.respond();
        assertDoesNotThrow(() -> pet.respond());
    }

    @Test
    void testFoul() {
        pet.foul();
        assertDoesNotThrow(() -> pet.foul());
    }

    @Test
    void testToString() {
        String expected = "CAT{nickname='Whiskers', age=3, trickLevel=5, habits=[Play, Sleep]}";
        assertEquals(expected, pet.toString());
    }

    @Test
    void testFinalize() throws Throwable {

        assertDoesNotThrow(() -> {
            pet.finalize();
        });
    }
}
