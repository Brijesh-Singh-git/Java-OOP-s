package Interfaces;


interface Tester {
	
	int a =10;  // bydeafult variable is static and final
	void display(); // abstract method
}



public class Interafce_Example implements Tester{ 
		
	public void display() {
		System.out.println(a);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interafce_Example i1 = new Interafce_Example();  // instintation using sub-class name
		Tester i2 = new Interafce_Example();            //	Both are correct

		i1.display();
		i2.display();
	}

}
