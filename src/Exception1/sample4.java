package Exception1;

public class sample4 {
 String name ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.out.println("A");
		   System.out.println("B");
		   sample4 n=new sample4();
		   n=null;
		   
		   //Thread.sleep(2000);
		   try {
			int i=9/0;
			System.out.println(i);
			n.name="Tom";
			System.out.println("stop");
			   
		} catch (Exception e) {
			
			System.out.println("some exception will come");
			e.printStackTrace();
		}
		   System.out.println("Hi");
	}

}
