import java.util.Scanner;

public class NumberSorter {

	public static void main(String[] args) {
		// sort 5 numbers inputed from keyboard		
		Scanner input = new Scanner(System.in); // stdin
		
		int[] values = new int[5];	// place for values
	
		System.out.println("Please enter 5 values: ");
	
		for (int i = 0; i < values.length; i++) {
		//	System.out.println(i + " : ");
			values[i] = input.nextInt(); // get each value
		}
		System.out.print("You Entered: ");
		for (int i =0; i < 5; i++) {
			System.out.print (" " + values[i] + " ");
		}
		System.out.println(" ");

		int temp;
		Boolean changed = false;
		do {
			changed = false;
			for (int i = 0; i < values.length -1; i++) {
				if (values[i] > values[i+1]) {
					changed = true;
					temp = values[i];
					values[i] = values[i+1];
					values[i + 1] = temp;
				}
			}
		}
		while (changed);
		System.out.print("The sorted values are: ");
		for (int i = 0; i < 5; i++) {
			System.out.print ("  " + values[i] + " ");
		}
		
	input.close();	
	}
}