import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testNewCustomer() {
		try {
		      new Customer();
		} catch (Exception e) {
		      fail(e.getMessage());
		}
	}

	@Test
	void testCustomNewCustomer() {

		try {
			Customer cust = new Customer(
					"Customer Name",
					"customer@email.com",
					"Billing Name",
					"Billing Address",
					"123-234-5678"
			);

			assertEquals(-1, cust.orderAverage());

			cust.incrementOrderCount();
			assertEquals(1, cust.getOrderCount());
			cust.incrementOrderCount();
			assertEquals(2, cust.getOrderCount());
			
			assertEquals(0, cust.getOrderValueTotal());
			
			cust.newOrderTotal(100);
			assertEquals(100, cust.getOrderValueTotal());
			cust.newOrderTotal(3.141592654);
			assertEquals(103.0, cust.getOrderValueTotal());
			
			cust.setBillingPhoneNumber("(817) 123-4567");
			assertEquals("(817) 123-4567", cust.getBillingPhoneNumber());
			
			cust.setCustomerEmail("customer@email.com");
			assertEquals("customer@email.com", cust.getCustomerEmail());			

		} catch (Exception e) {
		      fail(e.getMessage());
		}		
	}
}
