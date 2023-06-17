package Inheritance;

class Vehicle { //Parent
	
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{ //Child
	
	@Override
	void run() {
		System.out.println("Bike is running");
	}
}

class Truck extends Vehicle{ //Child
	
	@Override
	void run() {
		System.out.println("Truck is running");
	}
}



public class Overriding2 {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1.run();
		
		Bike b1 = new Bike();
		b1.run(); 
		
		Truck t1 = new Truck();
		t1.run();
	}
}
