package demoSite_practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox 
{
	public WebDriver driver;
@Test
public void checkbox()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	List<WebElement>checkbox=driver.findElements(By.xpath("//input[@id='checkbox2']"));
	for(int i=0; i<checkbox.size(); i++)
	{
		WebElement ele=checkbox.get(i);
		String text=ele.getAttribute("value");
		if(text.equalsIgnoreCase("Movies"))
		{
			ele.click();
			break;
		}
	}
	driver.close();
}
}
