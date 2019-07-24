import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class InvoiceTest {

	@Test
	void testInvoice() {
		try {
		      new Invoice();
		} catch (Exception e) {
		      fail(e.getMessage());
		}
	}

	@Test
	void testInvoiceDateStringStringString() {

		Date invoiceDate = new Date(2014, 02, 11);

		try {
			Invoice inv = new Invoice(
					invoiceDate,
					"Billing Name",
					"Billing Address",
					"(817) 123-4567"
					);

			assertEquals("Billing Name", inv.getBillingName());
			assertEquals("Billing Address", inv.getBillingAddress());
			assertEquals("(817) 123-4567", inv.getBillingPhoneNumber());
			assertEquals(0, inv.getNumber());			
		} catch (Exception e) {
		      fail(e.getMessage());
		}
	}
}
