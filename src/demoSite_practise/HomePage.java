package demoSite_practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage 
{
	public WebDriver driver;
@Test
public void Homepage()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Index.html");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	System.out.println("Title of home page is : "+driver.getTitle());
	driver.findElement(By.partialLinkText("Skip")).click();
	System.out.println("Title of registration page is : "+driver.getTitle());
}

@Test
public void Sendkeys()
{
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pavan");
	System.out.println("Text field value is : "+driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("value"));
}

@Test
public void Radio_btn()
{
	driver.get("http://demo.automationtesting.in/Register.html");
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
	for (int i=0; i<radio.size(); i++)
	{
		WebElement ele=radio.get(i);
		String text=ele.getText();
		
		if(text.equalsIgnoreCase("Female"))
		{
			ele.click();
			break;
		}
		boolean btn_presence=driver.findElement(By.xpath("//input[@type='radio' and @value='FeMale']")).isSelected();
		System.out.println("Button selected : "+btn_presence);
		
	}
	{
			
	}
	
}
}
