package javasession;

public class Superclass {

	    static void display()
	    {
	        System.out.println("Superclass's static method");
	    }
	}

	class Subclass extends Superclass
	{
	    static void display() 
	    {
	        System.out.println("Subclass's static method");
	    }
	


	    public static void main(String[] args) {
	        
             Superclass.display();
             Subclass.display();
	    }
	}


	

