package demoSite_practise;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendKeys 
{
	public WebDriver driver;
@Test
public void Sendkeys()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pavan");
	System.out.println("Text field value is : "+driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("value"));

    driver.close();	
}
}
