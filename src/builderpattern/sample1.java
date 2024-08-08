package builderpattern;

public class sample1 {

	public sample1  login()
	{
		System.out.println("user should be login");
		return this;
	}
	public sample1 search()
	{
		System.out.println("User can secrh");
		return this;
		
	}
	public sample1 search(String productname)
	{
		System.out.println("User can secrh"+ productname);
		return this;
	}
	public sample1 search(String productname,int price)
	{
		System.out.println("User can secrh productname price"+ productname +price);
		return this;
	}
	public sample1 payement(int productname)
	{
		System.out.println("User can dopayment"+productname);
		return this;
	}
	
}
