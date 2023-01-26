package One;

public class Day3 {

	public static void main(String[] args) {

		// relational operator
		// >= <= == != < >

		System.out.println(8 >= 8);
		System.out.println(4 <= 2);
		System.out.println(2 == 2);
		System.out.println(3 != 6);
		System.out.println(4 < 8);
		System.out.println(9 > 4);

		op(12, 13);
		op(15, 20);

		// Logical operator
		// AND && OR || NOT !

		log(4, 6);
		cal(8, 8);
		arth(4, 2);
		tst(4,5);
		
	}

	static void op(int x, int y) {
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x < y);
		System.out.println(x > y);

		// AND &&
	}

	static void log(int a, int y) {
		System.out.println(a > y && a == y);
	}

	static void cal(int x, int y) {
		System.out.println(x < y && x == y);
	}

	// OR ||
	static void arth(int x, int y) {
		System.out.println(x > y || x == y);
		System.out.println(x < y || x == y);
		System.out.println(x > y || x != y);
		System.out.println(x >= y || x == y);
		System.out.println(x <= y || x == y);

	}

	// NOT!
	static void tst(int a, int b) {
		System.out.println(!(a != b));
		System.out.println(!(a == b));
		
	
	}

}
