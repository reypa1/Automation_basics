package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fb_loginPage1 
{
      WebDriver driver;
      //Constructor
	public Fb_loginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement password;
	@FindBy(xpath="//input[@value='Log In']") WebElement submit_btn;
	
	public void user_id1(String username)
	{
		uid.sendKeys(username);
	}
	
	public void pass1(String pass)
	{
	   password.sendKeys(pass);
	}
	
	public void submit1()
	{
	   submit_btn.click();
	}
}
