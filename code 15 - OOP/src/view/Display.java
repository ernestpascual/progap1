package view;
import model.*;

public class Display {
	
	public static void print(Vehicle sasakyan){
		
		if (sasakyan instanceof Airplane){
			Airplane eroplano = (Airplane) sasakyan;
			eroplano.printDetails();
			System.out.println("Number of wheels: "
					+ eroplano.getNumberOfWheels());
			System.out.println("Number of passengers: " 
					+ eroplano.getPassengers());
			System.out.println("Length of wingspan (meters): " 
					+ eroplano.getWingspan());
			
			eroplano.getEngine().printDetails();
		
		} else if (sasakyan instanceof Car){
			Car kotse = (Car) sasakyan;
			kotse.printDetails();
			System.out.println("Number of wheels: "
					+ kotse.getNumberOfWheels());
			System.out.println("Number of passengers: " 
					+ kotse.getPassengers());
			System.out.println("Type: "
					+ kotse.getType());
			
			kotse.getEngine().printDetails();
		} else if (sasakyan instanceof Boat){
			Boat barko = (Boat) sasakyan;
			barko.printDetails();
			System.out.println("Speed (knots): "
					+ barko.getSpeed());
			System.out.println("Number of passengers: " 
					+ barko.getPassengers());
			barko.getEngine().printDetails();
		} else if (sasakyan instanceof Bicycle){
			Bicycle bisikleta = (Bicycle) sasakyan;
			bisikleta.printDetails();
			System.out.println("Number of wheels: "
					+ bisikleta.getNumberOfWheels());
			System.out.println("Type: "
					+ bisikleta.getType());
			// no engine to print
		
		}
	}

}
