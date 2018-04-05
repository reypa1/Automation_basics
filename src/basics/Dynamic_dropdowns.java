package basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamic_dropdowns 
{
	@Test
	public void Dyn_dropdown()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://book.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
	    driver.close();
	}
}