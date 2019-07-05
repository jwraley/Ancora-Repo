/* This program prints "hello world' to the terminal.

written by:  Darth Vader
Date:  7/2/19

*/

public class Hello {
	 
	static int foo;
	static float pi = 3.141592654f;
	static Boolean awesomeClass = true;
	static int texasPopulation = 27_470_000;
	
	// int localToHello = 
	
	// This is the main function.ja
	
	public static void main(String[] args) {
		System.out.println("Im just a poor boy nobody loves me");
		System.out.println(foo);
		System.out.println(pi);
		System.out.println(awesomeClass);
		System.out.println(texasPopulation);
		System.out.print("\007");
		System.out.flush();
		
		char[] thisIsUgly = { 't', 'h', 'i', 's', '!' };
		System.out.println(thisIsUgly);
		
		thisIsUgly[0] = 'z';
		thisIsUgly[4] = 'x';
		
		char uniChar = '\u03A9'; 
		System.out.println(uniChar);
		System.out.println(thisIsUgly);
		
		int[] arrayOfINt; //size is 
		arrayOfINt = new int[10];
			System.out.println(arrayOfINt[0]);
	
	
	String[] december = new String[31];
		for (int day = 0; day < december.length; day++ )
		System.out.println("What I am doing in December " +  (day+1) + " = " + december[day] );
		

// 12 x 31 array of arrays

	int [][] daysInTheYear = new int[12][31];
		int month = 3;
		int day = 27;
		daysInTheYear[month][day] = 10;
		 
		for(int months = 0; months < 12; months++) {
			for (int days = 0; days < 31; days++) {
			System.out.print(daysInTheYear[months][days] + "\t");
			}
			System.out.println();
		}


		
	}
}
