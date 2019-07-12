import java.util.Scanner;

public class homework5 {
	public  static void main(String[] args) {
		
// write an application that asks the user to enter two integers.  obtains them from the user and prints their sum, product, difference, and quotient
	
		Scanner input = new Scanner(System.in);
		

	String answer1;
	do{
		System.out.println("Please enter a number: ");
		answer1 = input.nextLine();
	} while (answer1.length() == 0);
	
	String answer2;
	do{
		System.out.println("Please enter another number: ");
		answer2 = input.nextLine();
	} while (answer2.length() == 0);
	
	int answerInt1 = Integer.parseInt(answer1);
	int answerInt2 = Integer.parseInt(answer2);
	
	System.out.println( answerInt1 + " + " + answerInt2	+ " = " + (answerInt1 + answerInt2));
	System.out.println( answerInt1 + " - " + answerInt2	+ " = " + (answerInt1 - answerInt2));
	System.out.println( answerInt1 + " x " + answerInt2	+ " = " + (answerInt1 * answerInt2));
	System.out.println( answerInt1 + " / " + answerInt2	+ " = " + (answerInt1 / answerInt2));
		
	
	}
}
		
		