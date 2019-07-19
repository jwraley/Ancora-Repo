public class Homework2 {
	
	public static void main(String[] args) {
		int [] hundred = new int[100];
		for (int  i = 0; i< hundred.length; i++) {
			hundred[i] = i * i;
			System.out.println("Array position " + i + " = " + hundred[i]);
		}
		hundred[hundred.length - 2] = 0;
		for (int  i = 0; i< hundred.length; i++) {
			System.out.println("Array position " + i + " = " + hundred[i]);
		}
		int half_length = hundred.length / 2;

		for (int i  = hundred.length - 1; i > half_length; i--) {
			System.out.println("-> " + i);
			hundred[i] = i * i * i;
		}

		for (int i = 0; i < hundred.length; i++) {
			System.out.println(hundred[i]);
		} 
		
		// modify the array from 10 to 20 set each to a negative number
		
		for (int i = 10; i <= 20; i++) {
			hundred[i] = -(hundred[i]) ;
			System.out.println("array position " + i + " = " + hundred[i]);
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println("array position " + i + " = " + hundred[i]);
		}
	}
}