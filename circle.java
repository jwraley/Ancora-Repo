import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
 // write a program to receive the radius of a circle and print out its diameter, circumference, and area
// diameter = 2R	circumference = 2*Pi*R  area = Pi R ^2
		
	Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of a circle: "); 
		double radius = input.nextDouble();	
		
		double diameter =  radius * 2;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The diameter is : " + diameter);
		System.out.println("The circumference is : " + circumference);
		System.out.println("The area is : " + area);
		
	
		input.close();

		
		
	}

}
