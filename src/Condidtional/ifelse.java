package Condidtional;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String browser="Chrome ";
        switch(browser.toLowerCase().trim())
        {
        case  "firefox":
        System.out.println("firefoxnlaunch");
        break;
        case  "chrome":
        System.out.println("Chromelaunch");
        break;
        	default :
        	System.out.println("unsupported");
        	break;
        }
	}

}

