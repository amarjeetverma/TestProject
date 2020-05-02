package testpackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{	
		System.out.println("Exception will be handled.");
		int i = 1/0;
		System.out.println("Completed"+i);
		}
		
		catch(Exception e)
		{
			System.out.println("\nError is using try catch method : "+e);
		}
		
		finally
		{
			System.out.println("\nFinally Block");
		}
		
	}

}
