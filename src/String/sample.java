package String;



public class sample 
{
 public static int getmarks(String name)
 {    
	 System.out.println("geeting the marks :"+ name);
	 if(name.equals("ravi")) 
	 {
		 try {
			 int a=9/0;
			 return 50;
		}
		 catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
		return 80;
		}
		 finally 
		 {
			System.out.println("finally block");
			return 100;
		 }
	 }
		 else if(name.equals("tom"))
		 {
			 return 100;
		 }
		 else {
			System.out.println("student not found");
			return -1;
		}
		 
	
 }
	
	public static void main(String[] args) {
		 int m=getmarks("ravi");
		 System.out.println( m); 	 	
	}
}
