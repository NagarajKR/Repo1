package Exception1;

public class Myexception {
	
 public static void main(String[] args)
 {
	 String data="test";
		if(data==null)
		{
			throw new RuntimeException("data not found");
			
		}
		System.out.println("fill the form");
}
	
}
