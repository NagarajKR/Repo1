package Exceptionhandlig;

public class classcast {

	public static void main(String[] args) 
{
		System.out.println("started");	
try 
{  
	System.out.println(10/0);
} 
catch (ClassCastException e)
{
	System.out.println("Invalid");
}
catch (Exception e) {
	System.out.println("Exception");
}
finally
{
	System.out.println("inside finally block");
}
System.out.println("end");
	}
	

}
