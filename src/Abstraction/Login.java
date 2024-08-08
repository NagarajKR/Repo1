package Abstraction;

public class Login extends Page{

	@Override
	void title() {
		// TODO Auto-generated method stub
		System.out.println("Title");
	}

	@Override
	void Url() 
	{
		// TODO Auto-generated method stub
		System.out.println("URl");
	}
	
	public void dologin(String UN, int Password)
	{
		System.out.println("the username and password is "+UN +Password);
	}

}
