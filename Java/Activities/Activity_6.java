
public class Activity_6 {
	public static void main(String[] args ) {
		
		Plane plane = new Plane(10);
		plane.onboard("Robert");
		plane.onboard("Samantha");
		plane.onboard("Andy");
		plane.onboard("Andrew");
		plane.onboard("Natalia");
		plane.onboard("Aslyee");
		plane.onboard("Erin");
		
		//Displaying the Plane take off date.
		System.out.printf("Plane took off at: " + plane.takeOff());
		
		//Printing the list of peoples who are on board.
		System.out.printf("People on the plane: " + plane.getPassengers());
		
		
		
	}
}

