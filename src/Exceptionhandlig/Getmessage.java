package Exceptionhandlig;

public class Getmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("start");
       try {
		     System.out.println(10/0);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
		
		
	}

}
