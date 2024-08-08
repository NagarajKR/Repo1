package Exception1;

public class Application {

public void m1() {
	System.out.println("Entered");
	m2();	
	}
public void m2() {
	System.out.println("entered to the m2");
	try {
		m3();
	} catch (Exception e) {
		System.out.println("exception handled");
	}
	
}
public void m3() throws ArithmeticException
{
	System.out.println("Enterd to m3");
	int i=9/0;
	System.out.println(i);
}
public static void main(String[] args) {
	Application a=new Application();
	a.m1();
	System.out.println("exited");
}


}
