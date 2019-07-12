import java.util.Scanner;

public class homework4 {
	public  static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do {
		
		System.out.println("What do you think about this class?");
		answer = input.nextLine();
		} while (answer.length() == 0);
		System.out.println("You typed: " + answer);
	}
}