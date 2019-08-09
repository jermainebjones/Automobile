// This is the first example of an inheritance program in Java
	
public class automobile {  //defined  a public class called automobile
	protected String brand = "Hyundai"; // automobile attribute
	public void honk() { // automobile method
		System.out.println("Beep, Beep!"); // The printed output on the console
	}
}
class Car extends automobile { // created a subclass of automobile called Car
	private String modelName = "Sonata"; // car attribute 
	
	public static void main(String[] args) {  // entry point of any java program
		Car myFastCar = new Car(); // Create a myFastCar object
		myFastCar.honk(); // Call the honk() method from the automobile class
		System.out.println(myFastCar.brand + " " + myFastCar.modelName); // Show the value of the brand attribute modelName
		

		
		

	}

}
