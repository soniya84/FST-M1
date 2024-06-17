
public class Car {
	//public class Car {
	    String color;
	    String transmission;
	    int make;
	    int tyres;
	    int doors;

	    // Constructor to initialize tyres and doors
	    public Car() {
	        this.tyres = 4;
	        this.doors = 4;
	    }

	    // Method to display the characteristics of the car
	    public void displayCharacteristics() {
	        System.out.println("Color: " + color);
	        System.out.println("Transmission: " + transmission);
	        System.out.println("Make: " + make);
	        System.out.println("Tyres: " + tyres);
	        System.out.println("Doors: " + doors);
	    }

	    // Method to simulate car acceleration
	    public void accelerate() {
	        System.out.println("Car is moving forward.");
	    }

	    // Method to simulate car braking
	    public void brake() {
	        System.out.println("Car has stopped.");
	    }
	//}
}