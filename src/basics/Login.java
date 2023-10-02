package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable 
	{
		String driverpath = "C://Users//Pavan Kumar Muppa//eclipse-workspace//Drivers//chromedriver-win64//chromedriver-win64//chromedriver.exe/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("pavan.chowdary137@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pa1kumar12$*");
		WebElement element=driver.findElement(By.id("u_0_5_bY"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		System.out.println("Title of page is : "+driver.getTitle());
		driver.close();
	}
}