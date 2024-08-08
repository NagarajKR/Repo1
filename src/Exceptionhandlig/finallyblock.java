package Exceptionhandlig;

public class finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("come to finally book");
		}
		System.out.println("executed");

	}

}
