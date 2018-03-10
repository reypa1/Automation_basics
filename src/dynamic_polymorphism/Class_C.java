package dynamic_polymorphism;

public class Class_C extends Class_B
{	
	public static void main(String[] args) 
	{
		Class_B cb=new Class_B();
		cb.CarLoan();
		cb.credit();
		cb.debit();
		cb.EducationLoan();
		cb.housingLoan();
		cb.netBanking();
		cb.mobileBanking();
		cb.add();
		cb.mul();
		
		
		//Dynamic polymorphism
		//Create a child class object with a super class
		Class_A ca=new Class_B();
		ca.credit();
		ca.debit();
		ca.mobileBanking();
		ca.netBanking();

	}

}
