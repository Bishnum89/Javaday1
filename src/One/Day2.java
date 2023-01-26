package One;

public class Day2 {

	public static void main(String[] args) {

		// Arithmetic Operations
		int x = 5;
		int y = 2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x * y);
		System.out.println(x % y);

		int k = 3;
		int b = 4;
		int l = k + b;
		System.out.println(k + b);
		System.out.println(l);
		System.out.println(l + l);
		System.out.println(l + k);

		// 1 pair = 5 lines ********** 10 pair = 50 lines

		// Calling the function
		Cal(4, 2);
		Cal1();
		CalA();
		Cal2(4, 4);
		CalB(8, 3);
		int c = Cal3(4, 6);
		System.out.println(c);
		int d=CalC (3,3);
		System.out.println(d);
	}

	static void Cal(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	// function without parameter without return
	static void Cal1() {
		System.out.println(2 + 4);

	}

	static void CalA() {
		System.out.println(6 / 2);

	}

	// function with parameter without return
	static void Cal2(int x, int y) {
		System.out.println(x * y);
	}

	static void CalB(int x, int y) {
		System.out.println(x - y);

	}

	// function with parameter with return
	static int Cal3(int x, int y) {
		return (x + y);
	}

	static int CalC(int x, int y) {
		return (x*y);

	}

}
