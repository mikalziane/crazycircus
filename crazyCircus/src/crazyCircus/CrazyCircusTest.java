package crazyCircus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// grace à la notation "ELO" on peut facilement écrire des tests
// on fait passer chaque test un à un

class CrazyCircusTest {
	@Test
	void test() {
		Pile p = new Pile("ELO"); // E en bas, O en haut
		assertEquals("ELO", ""+p); // ""+p provoque p.toString()
		p.remonter();
		assertEquals("LOE", ""+p);
		assertEquals(Animal.Elephant, p.dépiler());
		assertEquals("LO", ""+p);
		p.remonter();
		assertEquals("OL", ""+p);
		p.empiler(Animal.Elephant);
		assertEquals("OLE", ""+p);
	}

}
