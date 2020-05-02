package testpackage;

public class ThrowsException {
	
	public static void main(String[] args) throws Exception 
	
	{
		
		System.out.println("Exception will be handled.");
		
		int i = 1/0;
		System.out.println("Completed "+i);
		
		System.out.println("Exception is handled.");

	}

}
