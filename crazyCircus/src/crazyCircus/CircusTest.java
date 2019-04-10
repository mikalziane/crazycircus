package crazyCircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircusTest {

	@Test
	void test() {
		Circus c = new Circus("OL-E");
		assertEquals("OL-E", ""+c);
		c.lo();
		assertEquals("O-EL", ""+c);
		c.ni();
		assertEquals("O-LE", ""+c);
		c.so();
		assertEquals("E-LO", ""+c);
		c.ki();
		assertEquals("EO-L", ""+c);
		c.ma();
		assertEquals("OE-L", ""+c);
	}

}
