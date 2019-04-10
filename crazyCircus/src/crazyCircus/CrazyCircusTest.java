package crazyCircus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// grace � la notation "ELO" on peut facilement �crire des tests
// on fait passer chaque test un � un

class CrazyCircusTest {
	@Test
	void test() {
		Pile p = new Pile("ELO"); // E en bas, O en haut
		assertEquals("ELO", ""+p); // ""+p provoque p.toString()
		p.remonter();
		assertEquals("LOE", ""+p);
		assertEquals(Animal.Elephant, p.d�piler());
		assertEquals("LO", ""+p);
		p.remonter();
		assertEquals("OL", ""+p);
		p.empiler(Animal.Elephant);
		assertEquals("OLE", ""+p);
	}

}
