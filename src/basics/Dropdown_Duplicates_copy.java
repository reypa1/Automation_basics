package basics;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Duplicates_copy 
{
@Test
public void Dropdown()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement element=driver.findElement(By.id("month"));
	Select select = new Select(element);
	
	List<WebElement>list=select.getOptions();
	System.out.println("Total number of elements present in a dropdown is :" +list.size());
	
	Set<WebElement> set=new HashSet<WebElement>();
	
	for(WebElement ele :list)
	{
	set.add(ele);
	}
	System.out.println("After removing duplicates total number of elements present in a dropdown is :" +set.size());
	driver.close();
	}	
}