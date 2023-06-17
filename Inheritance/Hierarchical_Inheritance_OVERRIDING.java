package Inheritance;

class Bank{   //Parent 
	
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{ //Child
	
	@Override
	int getRateOfInterest() {    //Override
		return 15;
	}
}

class ICICI extends Bank{ //Child
	
	@Override
	int getRateOfInterest() {   //Override
		return 20;
	}
}
 
class Axis extends Bank{ //Child 
	
	@Override
	int getRateOfInterest() {  //Override
		return 35;
	}
}




public class Hierarchical_Inheritance_OVERRIDING {
	
	public static void main(String[] args) {
		
		SBI s1 = new SBI();
		System.out.println(s1.getRateOfInterest());
		
		ICICI i1 = new ICICI();
		System.out.println(i1.getRateOfInterest());
		
		Axis a1 = new Axis();
		System.out.println(a1.getRateOfInterest());
	}
}
