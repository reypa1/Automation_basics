package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class Actions_class 
{
	@Test
	public void action_class() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		
		//moving mouse to specific element
		WebElement ele=driver.findElement(By.id("nav-link-yourAccount"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
	    //Enter CAPS letters into a text box using actions class
		WebElement ele1=driver.findElement(By.id("ap_email"));
		act.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("pavanmuppa").doubleClick();
		act.build().perform();
		driver.close();
	}
}