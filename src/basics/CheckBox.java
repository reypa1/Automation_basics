package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox 
{
	@Test
	public void Checkbox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/registration/");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for(int i=0;i<checkbox.size();i++)
	    {
	    WebElement check=checkbox.get(i);
	    String text=check.getAttribute("value");
	    if(text.equalsIgnoreCase("reading"))
	    { 
	    	check.click();
	    	break;
	    }
	    }   
	}
}