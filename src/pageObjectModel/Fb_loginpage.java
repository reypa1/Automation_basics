package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Fb_loginpage 
{
     WebDriver driver;
	public Fb_loginpage(WebDriver driver) 
	{	
		this.driver=driver;
	}
	
	By userid=By.id("email");
	By password=By.id("pass");
	By submit=By.xpath("//input[@value='Log In']");
	
	public WebElement uid()
	{
		return driver.findElement(userid);
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
}
