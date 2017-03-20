package controller;

import model.*;
import view.Display;


public class AccessVehicle {

	public static void main(String[] args) {
		Boat barko = new Boat();
		barko.name = "Nimitz";
		barko.manufacturer = "US Navy";
		barko.year = 2002;
		barko.setPassengers(10000);
		barko.setPurpose("Global domination");
		barko.setSpeed(50);
		barko.color = "gray";
		//boat own the engine
	    
		Engine nimitzMakina = new Engine();
		nimitzMakina.name = "2 X Westinghouse";
		
		//boat own the engine
		barko.setEngine(nimitzMakina);
		
		//perform runtine polymorphism
		Vehicle sasakyan = barko; // upcasting
		
		Display.print(sasakyan);
			
		
		
		Airplane chargerPlane  = new Airplane();
		chargerPlane.name = "Supersonic charger";
		chargerPlane.manufacturer = "Charger";
		chargerPlane.price = 200000;
		chargerPlane.color = "White";
		chargerPlane.setNumberOfWheels(8);
		chargerPlane.setPassengers (50);
		chargerPlane.setWingspan(200);
		
		Engine chargerEngine = new Engine();
		chargerEngine.name = "\nSupah fast";
		
		chargerPlane.setEngine(chargerEngine);
		Vehicle chargerPlaneUnit =  chargerPlane;
		
		Display.print(chargerPlaneUnit);
		
		
		Bicycle bikeGT = new Bicycle();
		bikeGT.name = "GT BLABLABLA";
		bikeGT.manufacturer = "GT";
		bikeGT.year = 2016;
		bikeGT.color = "Black";
		bikeGT.price = 15800;
		
		bikeGT.setEngine(null);
		bikeGT.setNumberOfWheels(2);
		
		bikeGT.setEngine(chargerEngine);
		Vehicle bike =  bikeGT;
	
		Display.print(bike);
		
	}

}
