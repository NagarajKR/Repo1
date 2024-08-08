package Exception1;

import Exceptionhandlig.printstacktrace;

public class Sample3 {
  String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.out.println("A");
  System.out.println("B");
  Sample3 ex=new Sample3();
  ex=null;
  try {
	  ex.name="Nagaraj";
	  
	  System.out.println("Name printed");
	
} catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	System.out.println("ArrayIndexOutOfBoundsException come");
	
}
  catch (NullPointerException e) {
	System.out.println("NPE");
	e.printStackTrace();
}
  catch (Exception e) {
	System.out.println("Exception wil come");
}
  
	}

}
