package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GetTitle_of_page {

	@Test
	public void getTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.F5);	
		driver.findElement(By.id("email")).sendKeys("Pavan");
		String text=driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(text);
		driver.navigate().to("https://www.google.com");
		String title=driver.getTitle();
		Capture_scrShot.Screenshot(driver, "fb_homepage");
		System.out.println("Title of page is : " +title);
		driver.close();
	}
}
