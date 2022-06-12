package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(3,3);
		assertNotEquals(3,2);
		assertNull(null);
		assertNotNull("some");
		//assertArrayEquals(null, null);
		assertFalse(false);
		assertTrue(true);
	}

}
