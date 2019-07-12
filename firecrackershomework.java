import java.util.Scanner;

public class FireworksHomework {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an Integer One : "); 
		int intOne = input.nextInt();

		System.out.println("Please enter an Integer Two: "); 
		int intTwo = input.nextInt();
		//ans +
		int answer = intOne + intTwo;
		System.out.println(intOne + " + " + intTwo + " = " + answer );
		 
		//product *
		answer = intOne * intTwo;
		System.out.println(intOne + " * " + intTwo + " = " + answer );

		//difference - 
		answer = intOne - intTwo;
		System.out.println(intOne + " - " + intTwo + " = " + answer );

		//quotient /
		answer = intOne / intTwo;
		System.out.println(intOne + " / " + intTwo + " = " + answer ); 
		
		// which is larger?
		if (intOne == intTwo) {
			System.out.println("The two numbers are equal");
		} else if (intOne > intTwo) {
			System.out.println("First Number is larger");
		} else {
			System.out.println("Second Number is larger");
		}

		input.close();
		
		
		
	}

}
