package encapsulation;

public class sample2 {
String name;
int age;
private double salary;
  public static void main(String[] args) {
	sample2 s2=new sample2();
	System.out.println(s2.age=25);
	System.out.println(s2.name="peter");
	
	///Private variable can access inside the class that's there is no complie error
	System.out.println(s2.salary=200);
	
	
}
}
 
