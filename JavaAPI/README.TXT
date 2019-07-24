Your assignment for today is stored on the master branch of your homework repo.

Start by going to the homework repo in git bash:

Open Git Bash from the windows start menu.

cd homework.git

git pull origin master

Instructions for running JUnit tests in Eclipse.

Each test suite is stored in the "test" folder in the JavaAPI located at this path "JavaAPI\test".

Each suite of tests will be run independently.

The tests are started by opening the Test java file, then right click on a given test, then click "Run As" and then "JUnit Test"

Each of the tests are marked as "@Test".

As each of the classes under test are not present in the repo, running the tests will fail.  
This is the correct behavior for JUnit.

Individual tests in tests classes are able to run regardless of the missing methods in other tests.
For example, in the WidgetWranglerTest class, a developer can still run "void testAddUpToPi() " despite the other methods missing from the class.

Create an Invoice class in the src folder.
	Make sure it has a "main" method.

The invoice class should have all these fields but they should not be visible to other classes.

	int number;

	Date invoiceDate;
	Date shipDate;

	String billingName;
	String billingAddress;
	String billingPhoneNumber;

	String shippingName;
	String shippingAddress;
	String shippingPhoneNumber;

	float minimumDue;
	float taxRate;

Implement the following API for the Invoice Class:

public Invoice();
public Invoice( Date invoiceDate, String billingName, String billingAddress, String billingPhoneNumber );

Generate Getters and Setters for the other fields.

Make each of the Unit Tests for Invoice Class pass correctly.

Create a Customer class in the src folder.
	Make sure it has a "main" method.

	String customerName;
	String customerEmail;

	int orderCount;
	int orderValueTotal;

	String billingName;
	String billingAddress;
	String billingPhoneNumber;

	String shippingName;
	String shippingAddress;
	String shippingPhoneNumber;

Generate Getters and Setters for the other fields.

Implement the following API for the Customer Class:

public Customer();
public Customer(String customerName, String customerEmail, String billingName, String billingAddress, String billingPhoneNumber);

// gets the count of orders placed
public void incrementOrderCount();

// adds new order value to the customer's account
public void newOrderTotal(double value);

// returns average value of each order over the life of the account
// returns -1 if no orders placed
public float orderAverage();

Make each of the Unit Tests for Customer Class pass correctly.

Create a WidgetWrangler class in the src folder.
	Make sure it has a "main" method.
	You will need to be able to call any method in this class without creating an instance of the class.
	No need for any fields in this class.  :)

Implement the following API for the WidgetWrangler Class:

// set all even numbers to -1 for array regardless of size of input data.
public int removeEvens(int data[]);

// determines if all the data is sorted or not in the array regardless of size of input data.
public int isSorted(int data[]);

// determines if all letters in string are UPPER CASE regardless of size of input data.
public boolean allUppercase(String s);

// if numbers add up to PI returns true, else false
// HINT: Remember to use epsilon value
public boolean addsUpToPi(float one, float two, float three);

Once all the tasks above are completed, please commit these to the master branch of the repository.
