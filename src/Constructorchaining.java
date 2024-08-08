
public class Constructorchaining {
	
	Constructorchaining()
	{
		System.out.println("this is the argument constructor");
	}
	Constructorchaining(int y)
	{
		this();
		int var1=y;
		System.out.println("you passed one Agrument");
	}
	Constructorchaining(int a,int b)
	{
		this();
		int var2=a;
		int var3=b;
		System.out.println("you passed two Agrument");
	}
	
	public static void main(String[] args) {
		
		Constructorchaining c1=new Constructorchaining(2, 4);
	}
}
