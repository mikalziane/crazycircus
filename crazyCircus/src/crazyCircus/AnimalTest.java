package crazyCircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void test() {
		assertEquals(Animal.Elephant, Animal.getAnimal('E'));
		assertEquals(Animal.Lion, Animal.getAnimal('L'));
		assertEquals(Animal.Ours, Animal.getAnimal('O'));
	}

}
