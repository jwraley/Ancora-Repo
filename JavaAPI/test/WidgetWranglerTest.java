import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WidgetWranglerTest {

	@Test
	void testRemoveEvens() {

		int[] data = {10,20,30,40};
		
		WidgetWrangler.removeEvens(data);
		assertEquals(-1, data[0]);
		assertEquals(-1, data[1]);
		assertEquals(-1, data[2]);
		assertEquals(-1, data[3]);
		
		int[] data2 = {0,1,2,3};
		assertEquals(0, data2[0]);
		assertEquals(-1, data2[1]);
		assertEquals(0, data2[2]);
		assertEquals(-1, data2[3]);
	}

	@Test
	void testIsSorted() {
		
		int[] data = {10,20,30,40};
		
		assertEquals(1, WidgetWrangler.isSorted(data));
		
		int[] data2 = {40, 39, 0, -1};
		
		assertEquals(1, WidgetWrangler.isSorted(data2));

		int[] data3 = {-1, 0, 39, 40};  // interesting...
		
		assertEquals(1, WidgetWrangler.isSorted(data3));
		
		int[] data4 = {-1, -1, -2, -1};
		
		assertEquals(0, WidgetWrangler.isSorted(data4));
	}

	@Test
	void testAllUppercase() {
		
		// determines if all letters in string are UPPER CASE	
		assertEquals(0, WidgetWrangler.allUppercase("hello"));
		assertEquals(1, WidgetWrangler.allUppercase("HELLO"));
		assertEquals(0, WidgetWrangler.allUppercase("hElLo"));
		assertEquals(0, WidgetWrangler.allUppercase("-1"));
		assertEquals(0, WidgetWrangler.allUppercase(",;:!@#$%^&*()_+"));
	}

	@Test
	void testAddUpToPi() {
		// if numbers add up to PI returns true, else false
		assertEquals(3.141592654, WidgetWrangler.addsUpToPi(0.0f, 0.0f, 3.141592654f));
		assertEquals(3.141592654, WidgetWrangler.addsUpToPi(1.0f, -1.0f, 3.141592654f));
		assertEquals(3.141592654, WidgetWrangler.addsUpToPi(0.0f, 0.0f, (float)Math.PI));
	}
}
