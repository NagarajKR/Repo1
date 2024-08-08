package Condidtional;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int marks=35;
     if(marks>90)
     {
    	 System.out.println("grade a" + marks);
     }
     if (marks>70) {
		System.out.println("grade b"+marks);
	}
     if (marks >50) {System.out.println("grade c" + marks);
		
	}
     if (marks>=35)
     {
    	 System.out.println("just pass");
     }
     else {
		System.out.println("Please enter  marks with in 100 and greater than 35");
	}
	}

}
