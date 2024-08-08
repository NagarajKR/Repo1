package Programing;

public class forloop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int k=1;
            for(int i=0;i<=4;i++)
            {
            	//System.out.println("Outer loop is started"+i);
            	
            	
            	for (int j=1;j<=4-i;j++)
            	{

            		System.out.print(k);
            		System.out.print("\t");// to give space in btw number
            		k++;
            	}

        		System.out.println("hi ");
            }
            
	
	}
}
