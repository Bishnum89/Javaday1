package One;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String is inbuilt data type
	 String fullName = "Bishnu Maya Tamang";
	 System.out.println(fullName);
	 
	 vehicle murano = new vehicle("Nissan",2023,"white");
	 System.out.println("This is my " +murano.model +" "+murano.year+" "+murano.color + " car");
	 murano.start();
	 murano.stop();
	 
			 
	}

}
//constructor
class vehicle{
	String model;
	int year;
	String color;
	public vehicle(String model, int year, String color) {
		this.model=model;
		this.year=year;
		this.color=color;
		
	}
	//method
	void start() {
		System.out.println("Engine starts");
	}
	void stop() {
		System.out.println("engine stops");
	}
}

