package Exceptionhandlig;

public class printstacktrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("start");
		}
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
