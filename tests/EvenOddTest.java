import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {

	EvenOdd e;
	@Before
	public void setUp() throws Exception {
		e = new EvenOdd();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testEvenOddFunction() {
//		EvenOdd e = new EvenOdd();
//		assertEquals(true, e.isEven(20));
//	}
	
	@Test
	public void testNLessThan1() {
//		EvenOdd e = new EvenOdd();
		assertEquals(false,e.isEven(-999));
	}
	
	@Test
	public void testNIsEven() {
//		EvenOdd e = new EvenOdd();
		assertEquals(true,e.isEven(30));
	}
	
	@Test
	public void testNIsOdd() {
//		EvenOdd e = new EvenOdd();
		assertEquals(false,e.isEven(35));
	}

}
