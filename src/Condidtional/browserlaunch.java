package Condidtional;

public class browserlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String Browser="Chrome  ";
       if(Browser.toLowerCase().equals("safari"))
       {
    	   System.out.println("safari browser launched");
       }
       if (Browser.trim().toLowerCase().equals("chrome")) {
		System.out.println("chrome Browser launched");
	}
       if(Browser.endsWith("Firefox"))
       {
    	   System.out.println("Firefox browser launched");
       }
	}

}
