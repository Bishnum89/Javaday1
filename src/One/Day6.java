package One;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for and while

		// for loop
		// for(initialization ; conditionCheck , increment/ decrement){

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int a = 1; a <= 10; a++) {
			if (a == 5)

			{
				break;
			}
			System.out.println(a);

		}

		for (int a = 1; a <= 10; a++) {
			if (a == 5)

			{
				continue;
			}
			System.out.println(a);

		}

//while with break
		int a = 10;
		while (a == 10) {
			break;
		}
		System.out.println("Print A");

		// while with continue
		int b = 10;
		while (b >= 11) {
			continue;
		}
		System.out.println("Print B");

		// while
		int a1 = 2;
		while (a1 <= 4) {
			System.out.println(a1);
			a1++;

		}
		int a2 = 2;
		while (a2 <= 4) {
			System.out.println("hello");
			a2++;

		}
		// while with break
		int a3 = 5;
		while (a3 >= 1) {
			System.out.println(a3);
			if (a3 == 2) {

				break;

			}
			a3--;

		}
		// while with break
		int a4 = 1;
		while (a4 <= 10) {
			if (a4 == 4) {
				a4++;
				continue;

			}
			System.out.println(a4);
			a4++;

		}

		{

		}

	}
}