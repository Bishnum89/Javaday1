package One;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for and while

		// for loop
		// for(initialization ; conditionCheck , increment/ decrement){
		for (int i = 1; i <= 4; i++) {// 2//3//4
			System.out.println(i);// 1//2//3//4
		}
		for (int i = 5; i >= 2; i--) {// 4//3//2
			System.out.println(i);// 5//4//3//2
		}
		// table of 2
		for (int i = 2; i <= 20; i = i + 2) {// 2//4/6//8
			System.out.println(i); // 4//6//8//10//12//14//16/18//20
		}

		// reverse //10 to1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);

		}
		// continue with while
		int i2 = 1;
		while (i2 <= 5) {
			if (i2 == 2) {
				i2++;
				continue;
			}
			System.out.println(i2);
			i2++;
		}
		
	}

}
