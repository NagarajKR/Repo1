package Exception1;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("A");
   System.out.println("A");
   System.out.println("a");
   
   
   /// To overcome we go for try catch
   
   try {
	   int i=9/0;
} catch (Exception e) {
	e.printStackTrace();
  System.out.println("Exception Handled");
}
   
   System.out.println("bye");
	}

}
