
public class sample {

	public sample(String name, int age, float salary) {
		
		this.Name = name;
		this.age = age;
		this.salary = salary;
	}
	String Name ;
    int age;
  float  salary;
  public static void main(String[] args) {
	
	  sample a=new  sample("N", 25, 25.55f);
	  System.out.println(a.age);
}
}
