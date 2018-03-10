package demoSite_practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio_btn 
{
	public WebDriver driver;
@Test
public void Radio()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.spicejet.com");
	List<WebElement> radio=driver.findElements(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
	for (int i=0; i<radio.size(); i++)
	{
		WebElement ele=radio.get(i);
		String text=ele.getAttribute("value");
		if(text.equalsIgnoreCase("OneWay"))
		{
			ele.click();
			break;
		}
	    }
	boolean btn_presence=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected();
	System.out.println("Button selected : "+btn_presence);
    driver.close();
    }
}
