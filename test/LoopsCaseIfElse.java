import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoopsCaseIfElse {
	
	@Test
	void testNot() {
		assertEquals(1, UnitTestHomework.not(0));
		assertEquals(0, UnitTestHomework.not(1));
		assertEquals(0, UnitTestHomework.not(2));
		assertEquals(0, UnitTestHomework.not(-2));
	}

	@Test
	void testOr() {
		assertEquals(0, UnitTestHomework.or(0,0));
		assertEquals(1, UnitTestHomework.or(1,0));
		assertEquals(1, UnitTestHomework.or(0,1));
		assertEquals(1, UnitTestHomework.or(1,1));
	}	
	
	@Test
	void testAnd() {
		assertEquals(0, UnitTestHomework.and(0,0));
		assertEquals(0, UnitTestHomework.and(0,1));
		assertEquals(0, UnitTestHomework.and(1,0));
		assertEquals(1, UnitTestHomework.and(1,1));
	}
	
	@Test
	void testNor() {
		assertEquals(1, UnitTestHomework.nor(0,0));
		assertEquals(1, UnitTestHomework.nor(1,0));
		assertEquals(1, UnitTestHomework.nor(0,1));
		assertEquals(0, UnitTestHomework.nor(1,1));
	}
	
	@Test
	void testAdder() {
		assertEquals(0, UnitTestHomework.adder(0,0));
		assertEquals(3, UnitTestHomework.adder(1,2));
		assertEquals(-2, UnitTestHomework.adder(-1,-1));
	}

	@Test
	void testMultiplier() {
		assertEquals(2, UnitTestHomework.multiplier(1,2));
	}
	
	@Test
	void testCardSuit() {
		assertEquals("Ace", UnitTestHomework.cardSuit(1));
		assertEquals("Jack", UnitTestHomework.cardSuit(11));
		assertEquals("Queen", UnitTestHomework.cardSuit(12));
		assertEquals("King", UnitTestHomework.cardSuit(13));
		assertEquals("ERROR", UnitTestHomework.cardSuit(-1));
		assertEquals("ERROR", UnitTestHomework.cardSuit(0));
		assertEquals("ERROR", UnitTestHomework.cardSuit(14));
	}
	
	@Test
	void testAddRow() {
		int foo1[] = {0};
		assertEquals(0, UnitTestHomework.addRow(foo1));
		int foo2[] = {0,5};
		assertEquals(5, UnitTestHomework.addRow(foo2));
		int foo3[] = {5,-5};
		assertEquals(0, UnitTestHomework.addRow(foo3));
	}
	
	@Test
	void testFactorial() {
		assertEquals(1, UnitTestHomework.factorial(0));
		assertEquals(362880, UnitTestHomework.factorial(9));
		assertEquals(3628800, UnitTestHomework.factorial(10));
	}
}
