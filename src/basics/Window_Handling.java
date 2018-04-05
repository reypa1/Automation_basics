package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Window_Handling 
{
@Test
public void window_handling()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/SignUp?hl=en-GB");
	String parent_win=driver.getWindowHandle();
	System.out.println("Title of parent window is : "+driver.getTitle());
	driver.findElement(By.linkText("Learn more")).click();
	Set<String>child_win=driver.getWindowHandles();
	for (String str : child_win) 
	{
	driver.switchTo().window(str);
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Why Google asks for certain info to create an account - Google Account Help"))
	{
	driver.findElement(By.linkText("Sign in")).click();
	System.out.println("Title of child win is : "+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(parent_win);
	driver.findElement(By.id("FirstName")).sendKeys("Pavan muppa");
	}	
	}
	driver.quit();
}
}