import datatype.Int;

public class Methodoerloading {
	
	String Name ;
      int age;
    float  salary;
      
public  Methodoerloading(String Name,int age,Float salary)
{
	this.age=age;
	this.Name=Name;
	this.salary=salary;
	
}

public static void main(String[] args) {
	Methodoerloading m1=new Methodoerloading("nagaraj",26,25.64f);
	System.out.println(m1.age);
}
}
