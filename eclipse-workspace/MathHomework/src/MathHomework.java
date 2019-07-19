public class MathHomework {
	
	public static void main(String[] args) {
		byte myByte = 8;
		Byte x = new Byte("127");
		int myInt = 4;
	//	System.out.println(x,toString()  );
	//	System.out.println(Byte.MIN_VALUE);
	//	System.out.println(Byte.MAX_VALUE);
	//	x++;
	//	System.out.println(x,toString()  );	
		int y = 0;
		
		double pi = Math.PI;
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		long pilong = (long) Math.PI;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(pilong);
		int i = 12345;
		System.out.format("%d%n", i);
		double zero = 45.0f; // radians
		System.out.println(Math.cos(Math.toDegrees(zero)));
		System.out.println(Math.sin(Math.toDegrees(zero)));
		System.out.println(Math.tan(Math.toDegrees(zero)));
		System.out.println(Math.cos(zero));
		
		int negative = -10;
		double floatingPoint = 10.99999999;
		System.out.println(Math.abs(negative));
		System.out.println(Math.ceil(floatingPoint));
		System.out.println(Math.floor(floatingPoint));
		System.out.println(Math.max(floatingPoint, 9.999999999));
		System.out.println(Math.pow(negative, 4)); // takes the value of 'negative' to x power
													// can use a negative power to get the root, cube root, etc
		System.out.println(Math.sqrt(Math.abs(negative)));
		int randomnumber = (int) (Math.random() *10);
		System.out.println(randomnumber);
		
		int z = 8 + 10 * 3 / 6 % 4 - 3;
		System.out.println(z);
		
		int x1 = 10;
		int y1 = 5;
		int z1 = --x1 + --y1;
		System.out.println("z1 = " + z1 );
		x1 = 10;
		y1 = 5;
		int a = x1-- + y1--;
		System.out.println("a = " + a );
		
		z1+= y1; // same as z1 = z1 + y1
		
		double counter = 10.1f;
		double epsilon = 0.00005;
		 
		for(double j = 1.0f; j < counter; j++) {
			if (j <= counter+ epsilon || j >= counter + epsilon) {
				System.out.println(j);
			}
		}

		int foo = 0;
		int bar = 1;
		int baz = 0;
		
		if(foo++ == 0 || bar == 1 || baz == 0) {
			System.out.println("ok");
			System.out.println("Foo =" + foo);
			
		} else {
			System.out.println("not ok");
		}


	}
}