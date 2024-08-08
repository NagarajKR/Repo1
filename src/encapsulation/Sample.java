package encapsulation;

public class Sample {

	public void launchbrowser()
	{
		System.out.println("launch browser");
		checkRAM();
		checkbrowserupgrade();
		checkbrowserversion();
		checkCPUutilization();
	}
	
	private void checkRAM()
	{
		System.out.println("checkedRAM");
	}
	private void checkCPUutilization()
	{
		System.out.println("checkCPUutilization");
	}
	private void  checkbrowserversion() {
		System.out.println("checkedbrowserversion");
	}
	private void checkbrowserupgrade() {
		System.out.println("browser update done");
	}
	
}
