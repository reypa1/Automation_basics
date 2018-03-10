package demoSite_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover_actions 
{
	public WebDriver driver;
@Test
public void frame()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")));
	action.build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	
}
}
