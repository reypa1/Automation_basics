package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Duplicates 
{
@Test
public void Dropdown()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("url");
	String[] exp={"JAVA","C","C#","C++","PYTHON","R",".NET","PHP","RUBY"};
	int count=0;
	WebElement dropdown=driver.findElement(By.id(""));
	Select select=new Select(dropdown);
	List<WebElement>dd=select.getOptions();
	for (WebElement webElement : dd) 
	{
	for(int i=0;i<exp.length;i++)
	{
		if(webElement.getText().equals(exp[i]))
		{
			count++;
		}
	}
}
	    if(count==exp.length)
	    {
			System.out.println("Matched and duplicacy is not present");
		}
		else
		{
			System.out.println("Matched and duplicacy is present");	
		}
	}	
}