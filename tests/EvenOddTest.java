import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvenOddFunction() {
		EvenOdd e = new EvenOdd();
		assertEquals(true, e.isEven(20));
	}

}
