

// Swap all the elements of the array. 0 and the last position should be swapped, 1 and the second to the last position should be swapped. Do for the entire array. Use a loop. This means for your array of ints position 0 will now hold 9801 (99 squared) and position 97 will hold 4, 98 will hold 1 and 99 will hold 0.
//for one direction, for other direction array[1]=array[j] 

public class Homework {
	public static void main(String[] arg) {
		System.out.println("Hello There");
		
		// Create an array of 10 strings and set each element to something unique.
		
		String [] foo = { "UNo", "Dos", "Tres","Cuatro",  "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez" };
		for (int i = 0; i < 10; i++ ){
			System.out.println(foo[i]);
		}
		
// Create an array of 100 integers. Use a for loop to set the value of each element to the value of the index parameter of the loop. Element 10 would be set to 10, element 0 would be set to 0.

		int numArray[] = new int[100];
		
		for (int  i = 0; i<100; i++) {
			numArray[i] = i;
			System.out.println("numArray position " + i + " = " + numArray[i]);
		}

// With your array of integers use a for loop to change each element to be the square of the number that it contains.  Element 5 should originally hold the value of 5, your code will change it to be 25.

		for (int  i = 0; i<100; i++) {
			numArray[i] = i*i;
			System.out.println("numArray position " + i + " = " + numArray[i]);
		}
// Set the second to the last value of your arrays to some new value. DO NOT hard code the index, use the length of the array to figure out the second to the last position.  array.length - 2
		
		int i = numArray.length - 2;
		 numArray[i] = 42;
		 System.out.println ("numArray position " + i + " The 2nd to last position  = " + numArray[i]);
		 
 // Swap all the elements of the array. 0 and the last position should be swapped, 1 and the second to the last position should be swapped. Do for the entire array. Use a loop. This means for your array of ints position 0 will now hold 9801 (99 squared) and position 97 will hold 4, 98 will hold 1 and 99 will hold 0.
//for one direction, for other direction array[1]=array[j] 

		int tempArray[] = new int[100];
		
		for (int k = 0; k < 100; k++) {
				tempArray[k] = numArray[k];
		}
		for(int j = 1; j < 100; j++) {
			int x = numArray.length - j;
			numArray[j] = tempArray[x];
			System.out.println ("the new value of numarray position " + j + " = " + numArray[j]);
		
		}
		
	}
}