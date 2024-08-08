package Exceptionhandlig;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 try {
					System.out.println(10/0);
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("handled exception");
					//e.printStackTrace();
				}
          
		
		
		
	}

}
