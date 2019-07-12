public class homework3 {
	public static void main(String[] args) {

	int [] myArray = new int[100];

	for(int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}

// Swap all the elements of the array. 0 and the last position should be swapped, 1 and the second to the last position should be swapped. Do for the entire array. Use a loop. This means for your array of ints position 0 will now hold 99 and position 97 will hold 2, 98 will hold 1 and 99 will hold 0.

	for(int i = 0; i < myArray.length; i++) {
		System.out.println(i  + " -> " + myArray[i]);
		}
	
	/*
	for (int i = 0, j = myArray.length - 1; i < myArray.length; i++, j--) {
		int temp = myArray[i];
		myArray[j] = myArray[i];
		myArray[i] = temp;
		System.out.println( i + " -> " + myArray[i]);
		
		}
		*/
		for(int i = 0, j = myArray.length - 1; i < myArray.length / 2; i++, j--) {
			int temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " -> " + myArray[i]);
		}
	}
}