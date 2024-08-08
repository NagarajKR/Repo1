package Exception1;

import encapsulation.Sample;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    try {
		int i=9/3;
		System.out.println(i/0);
	} catch (Exception e) {
		
		System.out.println("If excetion came we hndled");
	}
	}

}
