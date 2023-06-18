package Exception_Handling;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		
		//Try-catch-finally 
		
				String st ="abcede";
				
				
				try {
					int i = Integer.parseInt(st);  
					System.out.println(i);   //NumberFormatException

				}
				
				catch(NumberFormatException e) {
					System.out.println("Exception Message " + e.getMessage());
				}
				
				finally {
					
					System.out.println("You are into Finally block");
				}
	}
}	
