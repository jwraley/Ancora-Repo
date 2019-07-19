import java.util.Scanner;

public class branching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String monthString; 
		Boolean leapCheck = false;
		int monthNumber;
		
		System.out.println("please enter an integer");
		monthNumber = input.nextInt();
		// calling a Method / function
		monthString =getMonth(monthNumber);
		System.out.println("please enter a year");
		int year = input.nextInt();
		leapCheck =leapYear(year);

		System.out.println(monthString);
		//System.out.println(leapCheck);
		if (leapCheck == false) {
			System.out.println(year + " is not a leap year");
		} else
			System.out.println(year + " is a leap year");
				
	}
	// definition of Method / Function
	public static String getMonth(int monthNumber) {
		String monthString;
		switch (monthNumber) {
		case 1:  monthString = "January"; break;
		case 2:  monthString = "February"; break;
		case 3:  monthString = "March"; break;
		case 4:  monthString = "April"; break;
		case 5:  monthString = "May"; break;
		case 6:  monthString = "June"; break;
		case 7:  monthString = "July"; break; 
		case 8:  monthString = "August"; break;
		case 9:  monthString = "September"; break;
		case 10: monthString = "October"; break;
		case 11: monthString = "November"; break;
		case 12: monthString = "December"; break;
		default:  monthString = "Invalid=Month";
	}
		return monthString;
	
		
		
	
	}
	
	public static Boolean leapYear(int year) {
		Boolean retVal = false;
		
		if (year % 4 != 0) {retVal = false;}
		else if (year % 100 != 0) {retVal = true;}		
		else if (year % 400 != 0) {retVal = false;}
		else {retVal = true;}
				
		return retVal;
		
	}

	/*write a method to calculate leap year
if (year is not divisible by 4) then (it is a common year)
else if (year is not divisible by 100) then (it is a leap year)
else if (year is not divisible by 400) then (it is a common year)
else (it is a leap year)  

int intYear;
System.out.println("please enter a year");
intYear = input.nextInt();

public static boolean leapYear(int leapYear ) {
	boolean leapYear = false;
	if intYear % 4 != 0 {
		if intYear % 100 != 0 {
			if intYear % 100 != 0 {
				if intYear % 400 != 0 {
					
				}
			}
		 } leapYear = true;
		 			
	}
} */
	
	
}