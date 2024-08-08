
public class Returnarray {

	int[] array=new int[4];
	public int[] fillarray()
	{
		for (int i = 0; i < 4; i++) 
		{
			array[i]=i+2;
			System.out.println(array[i]);
		}
		return array;
	}
	
	public static void main(String[] args) {
		 Returnarray r=new Returnarray();
		int b[]= r.fillarray();
	}

	

}
