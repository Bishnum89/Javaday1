package One;

public class Revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arithmetic operations
		int x = 4;
		int y = 6;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		Addition(4, 5);
		Sub();
		Times(3, 6);

		int A = Calculator(9, 9);
		System.out.println(A + 2);
		System.out.println(A * 2);
		comp(5, 4);
		And(4, 8);
		Or(6, 8);
		Not(4, 6);
		
		// Conditional statements
		// If
		// If else
		// else

		// If condition
		int x1 = 8;
		int y1 =10;

		if(x1<y1)
		{
			System.out.println("print A");
		}if(y1>x1)
		{
			System.out.println("print B");
		}
		
		//else if
		if(x1>y1)
		{
			System.out.println("print A");
		}
		if(y1<x1)
		{
			System.out.println("print B");
		}
		else if(x1<y1) {
			System.out.println("print 3rd");
		}
		
		//else if
		int x2=5;
	    int y2=10;
	    
	    if(x2>y2)
		{
			System.out.println("print A");
		}
		else if(y2>x2)
		{
			System.out.println("print B");
		}
		else if(x2<y2) {
			System.out.println("print 3");
		}
	    
	    //else
	    int e=5;
	    int f=10;
	    
	    if(e>f)
		{
			System.out.println("print A");
		}
		else if(e>f)
		{
			System.out.println("print B");
		}
		else if(e==f) {
			System.out.println("print 3");
		}
		else {
			System.out.println("none");
		}
	    
	    //switch without break
	    int fruits = 2;
	    switch (fruits) {
	    case 1:
	    	System.out.println("apple");
	    case 2:
	    	System.out.println("pear");
	    case 3:
	    	System.out.println("peach");
	    case 4:
	    	System.out.println("mango");
	    case 5:
	    	System.out.println("orange");
	    default:
	    	System.out.println("enter valid names");
	    	
	    }
	    //switch with break
	    int week = 8;
		switch (week) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please enter the valid name");
		}

	}

	public static void Addition(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	// function without parameter and without return type
	public static void Sub() {
		System.out.println(8 - 2);
	}

	// function with parameter and without return type
	public static void Times(int x, int y) {
		System.out.println(x * y);

	}

	// function with parameter and with return type
	static int Calculator(int x, int y) {
		return (x - y);
	}

	// Comparative operations
	// < > <= >= ==
	int a = 4;
	int b = 6;

	static void comp(int a, int b) {
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);

	}
	// Logical operator
	// And &&
	// OR ||
	// NOT !

	// AND &&
	static void And(int x, int y) {
		System.out.println(x < y && x == y);
		System.out.println(x > y && x <= y);
		System.out.println(x <= y && x == y);
		System.out.println(x < y && x >= y);
		System.out.println(x < y && x <= y);

	}

	// OR ||
	static void Or(int a, int b) {
		System.out.println(a < b || a <= b);
		System.out.println(a > b || a <= b);
		System.out.println(a > b || a >= b);
		System.out.println(a < b || a == b);
		System.out.println(a < b || a >= b);

	}

	// NOT !
	static void Not(int x, int y) {
		System.out.println(!(x <= y));
		System.out.println(!(x < y));
		System.out.println(!(x > y));
		System.out.println(!(x >= y));
		System.out.println(!(x == y));

	}

}
