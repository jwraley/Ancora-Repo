import java.util.Date;

public class Invoice {
	
	private int number;

	private Date invoiceDate;
	private Date shipDate;

	private String billingName;
	private String billingAddress;
	private String billingPhoneNumber;

	private String shippingName;
	private String shippingAddress;
	private String shippingPhoneNumber;

	private float minimumDue;
	private float taxRate;
	
	
	public static void main(String[] args) {

	}

	public Invoice() {}
	public Invoice( Date invoiceDate, String billingName, String billingAddress, 
			String billingPhoneNumber ) {
		this.invoiceDate = invoiceDate;
		this.billingName = billingName;
		this.billingAddress = billingAddress;
		this.billingPhoneNumber = billingPhoneNumber;
	}
	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getInvoiceDate() {
		return invoiceDate;
	}


	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}


	public Date getShipDate() {
		return shipDate;
	}


	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}


	public String getBillingName() {
		return billingName;
	}


	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}


	public String getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getBillingPhoneNumber() {
		return billingPhoneNumber;
	}


	public void setBillingPhoneNumber(String billingPhoneNumber) {
		this.billingPhoneNumber = billingPhoneNumber;
	}


	public String getShippingName() {
		return shippingName;
	}


	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}


	public String getShippingAddress() {
		return shippingAddress;
	}


	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


	public String getShippingPhoneNumber() {
		return shippingPhoneNumber;
	}


	public void setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
	}


	public float getMinimumDue() {
		return minimumDue;
	}


	public void setMinimumDue(float minimumDue) {
		this.minimumDue = minimumDue;
	}


	public float getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [number=");
		builder.append(number);
		builder.append(", invoiceDate=");
		builder.append(invoiceDate);
		builder.append(", shipDate=");
		builder.append(shipDate);
		builder.append(", billingName=");
		builder.append(billingName);
		builder.append(", billingAddress=");
		builder.append(billingAddress);
		builder.append(", billingPhoneNumber=");
		builder.append(billingPhoneNumber);
		builder.append(", shippingName=");
		builder.append(shippingName);
		builder.append(", shippingAddress=");
		builder.append(shippingAddress);
		builder.append(", shippingPhoneNumber=");
		builder.append(shippingPhoneNumber);
		builder.append(", minimumDue=");
		builder.append(minimumDue);
		builder.append(", taxRate=");
		builder.append(taxRate);
		builder.append("]");
		return builder.toString();
	}

}
