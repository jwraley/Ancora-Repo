import java.util.Scanner;

public class UnitTestHomework {

	public static void main(String[] args) {
		// "and"  two integers returns the AND value
		// "or" two integers returns the OR value
		// "nor"  two integers returns the NOR value

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an Integer One : "); 
		int intOne = input.nextInt();

		System.out.println("Please enter an Integer Two: "); 
		int intTwo = input.nextInt();
		// "add"  two integers returns two integers added together

		static int add(int x, int y) {
			return (x+y);
		}
	
		// "sub"  two integers returns 
		static int sub(intx, int y) {
			return x-y;
		}
		// "factoral" take in an integer and return integer factorial
		static int factoral(int x) {
			if (x==0) {return 1;}
			int sum = 1;
			while (x > 0) {
				sum *= x;
				x--;
			}
			return sum;
		}
		
		// "not"  two integers returns the NOT value
		static int not(int x) { 
			if (x != 0) {return 0;} 
			else {
				return 1;
				}
			}
		// "and"  two integers returns the AND value
		static int and(int x, int y) {
			if (x == 1) 
				if (x == y){return 1;}
				else {return 0; }
		}
		
	}

}
