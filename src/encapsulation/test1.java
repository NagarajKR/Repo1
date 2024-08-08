package encapsulation;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     getset1 gs1=new getset1();
     gs1.setAge(25);
    System.out.println(gs1.getAge()); 
   gs1.setName("nagaraj");
    System.out.println(gs1.getName());
    gs1.setIsactive(true);
     gs1.setSalary(25000);
    System.out.println(gs1.getSalary()); 
     
	}

}
