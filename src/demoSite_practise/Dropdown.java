package demoSite_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown 
{
	public WebDriver driver;
@Test
public void dropdown()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.spicejet.com");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	Select sel=new Select(dropdown);
	sel.selectByVisibleText("3");
	driver.close();
	
	
	
}
	
}
