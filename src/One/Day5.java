package One;

public class Day5 {

	public static void main(String[] args) {

//switch without break
		int week = 3;
		switch (week) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Please enter the valid number");

			// Switch with break
			int planets = 10;
			switch (planets) {
			case 1:
				System.out.println("Mercury");
				
				break;
			case 2:
				System.out.println("Venus");
				break;
			case 3:
				System.out.println("Earth");
			case 4:
				System.out.println("Mars");
				break;
			case 5:
				System.out.println("Jupiter");
				break;
			case 6:
				System.out.println("Saturn");
				break;
			case 7:
				System.out.println("Uranus");
				break;
			case 8:
				System.out.println("Neptune");
				break;
			default:
				System.out.println("Please enter the valid number");

			}
		}

	}
}

