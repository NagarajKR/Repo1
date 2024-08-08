package Exceptionhandlig;

public class sample3 {

	public static void main(String[] args) {
		try {
			//int arr[]=new int[4];
			System.out.println(10/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException");
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("super class Exception");
		}

	}

}
