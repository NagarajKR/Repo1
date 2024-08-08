package Exception1;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("A");
      try
      {
    	  int i=9/0;
    	  System.out.println(i);
    	  
      }
      catch (Throwable e) {
		e.printStackTrace();
	}
	System.out.println("Bye");
	}
}
