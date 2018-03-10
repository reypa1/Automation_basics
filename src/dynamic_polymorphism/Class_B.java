package dynamic_polymorphism;

public class Class_B implements Class_A,Class_D
{	
	public void housingLoan()
	{
	System.out.println("Housing -- loan");	
	}
	
	public void CarLoan()
	{
	System.out.println("Car -- loan");	
	}
	
	public void EducationLoan()
	{
	System.out.println("Education -- loan");	
	}
	
	@Override
	public void debit() 
	{
	System.out.println("Debit");		
	}

	@Override
	public void credit() 
	{
	System.out.println("credit");	
	}

	@Override
	public void netBanking() 
	{
		System.out.println("Net -- Banking");
	}
	
	public static void main(String[] args) 
	{
		Class_B cb=new Class_B();
		cb.CarLoan();
		cb.credit();
		cb.debit();
		cb.EducationLoan();
		cb.housingLoan();
		cb.mobileBanking();
		cb.netBanking();
	}

	@Override
	public void mobileBanking() {
		System.out.println("This is mobile banking");
	}

	@Override
	public void add() 
	{
	System.out.println("This is addition method");	
	}

	@Override
	public void mul() 
	{
		System.out.println("This is multiplication method");
	}
}