package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	@Test
	public void locators()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//using ID
		driver.findElement(By.id("email")).sendKeys("Pavan.chowdary137@gmail.com");
		//using Xpath
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pa1kumar12$*");
		//using css
		driver.findElement(By.cssSelector("#loginbutton")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
