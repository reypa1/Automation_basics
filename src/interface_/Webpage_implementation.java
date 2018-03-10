package interface_;

public class Webpage_implementation implements Interface1,INTERFACE
{
	@Override
	public void launch_url() 
	{
		System.out.println("url launched succesfully");	
	}

	@Override
	public void login() 
	{
		System.out.println("login succes");
	}

	@Override
	public void getTitle() 
	{
		System.out.println("title got printed succesfully");
	}

	@Override
	public void Verify_Title() 
	{
		System.out.println("title verified succesfully");
	}

	@Override
	public void Alert_box() 
	{
		System.out.println("alert box handled succesfully");
	}
	
	
	@Override
	public void muppa() 
	{
		System.out.println("Hiiiii");
	}

	@Override
	public void pavan() 
	{
		System.out.println("Hii");	
	}
	
		public static void main(String[] args) 
		{		
			Webpage_implementation imp=new Webpage_implementation();
			imp.Alert_box();
			imp.getTitle();
			imp.Verify_Title();
			imp.login();
			imp.launch_url();
			imp.muppa();
			imp.pavan();
		}
	}