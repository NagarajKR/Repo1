package Exception1;

public class Testing 
{

	public static void main(String[] args)
			 {
  int a[]=new int[4];

 try {
	 a[10]=10;
	  System.out.println(a[10]);
	
} catch (Exception e) {
	
	System.out.println("Handled");
	e.printStackTrace();
}
	  
  }
}
  

