package Abstraction;

public abstract class  Page {
     abstract void title();
     abstract void Url();
     public static final void displaylogo()
     {
    	 System.out.println("page display logo");
     }
     public void getpageinfo() {
    	 System.out.println("page --info");
     }
}
