package Interface;

public class FortiesHospital implements USMedical,UKMedical,IndianMEdical {

	@Override
	public void peiaservices() {
		// TODO Auto-generated method stub
		System.out.println("peiaservices");
	}

	@Override
	public void neuroservices() {
		// TODO Auto-generated method stub
		System.out.println("neuroservices");
	}

	@Override
	public void gynecservices() {
		// TODO Auto-generated method stub
		System.out.println("gynecservices");
	}

	@Override
	public void gastroservices() {
		// TODO Auto-generated method stub
		System.out.println("gastroservices");
	}

	@Override
	public void Phsioservices() {
		// TODO Auto-generated method stub
		System.out.println("Phsioservices");
	}

	@Override
	public void Oncologyservices() {
		// TODO Auto-generated method stub
		System.out.println("Oncologyservices");
	}

	@Override
	public void dentalservices() {
		// TODO Auto-generated method stub
		System.out.println("dentalservices");
	}

	@Override
	public void emergencyservices() {
		// TODO Auto-generated method stub
		System.out.println("emergencyservices");
	}
	
	public void medicaltraining()
	{
		System.out.println("Medical Training");
	}

}
