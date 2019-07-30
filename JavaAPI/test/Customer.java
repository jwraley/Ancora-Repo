
public class Customer {

		private String customerName;
		private String customerEmail;

		private int orderCount;
		private int orderValueTotal;

		private String billingName;
		private String billingAddress;
		private String billingPhoneNumber;

		private String shippingName;
		private String shippingAddress;
		private String shippingPhoneNumber;
		
		public static void main(String[] args) {
		
			Customer c = new Customer();
			System.out.println(c.toString());
		}
		
		public Customer() {}
		
public Customer(String customerName, String customerEmail, String billingName, 
		String billingAddress, String billingPhoneNumber) {
			this.customerName = customerName;
			this.customerEmail = customerEmail;
			this.billingName = billingName;
			this.billingAddress = billingAddress;
			this.billingPhoneNumber = billingPhoneNumber;
		}
// gets the count of orders placed
public void incrementOrderCount() {
	orderCount++;
}

//adds new order value to the customer's account
public void newOrderTotal(double value) {
	this.orderValueTotal += value;
}

//returns average value of each order over the life of the account
//returns -1 if no orders placed
public float orderAverage() {
	if (orderCount == 0) {return -1; }
	return orderValueTotal / orderCount;
}


		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public int getOrderCount() {
			return orderCount;
		}

		public void setOrderCount(int orderCount) {
			this.orderCount = orderCount;
		}

		public int getOrderValueTotal() {
			return orderValueTotal;
		}

		public void setOrderValueTotal(int orderValueTotal) {
			this.orderValueTotal = orderValueTotal;
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

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Customer [customerName=");
			builder.append(customerName);
			builder.append(", customerEmail=");
			builder.append(customerEmail);
			builder.append(", orderCount=");
			builder.append(orderCount);
			builder.append(", orderValueTotal=");
			builder.append(orderValueTotal);
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
			builder.append("]");
			return builder.toString();
		}
		
}
