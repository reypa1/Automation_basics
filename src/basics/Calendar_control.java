package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendar_control {

	@Test
	public void calendar_control() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		WebElement datePick=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String text=datePick.getText();
		
		while(!text.contains("April"))
		{
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	
		}
		
		List<WebElement>date_picker=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(int i=0;i<date_picker.size();i++)
		{
			String text1=date_picker.get(i).getAttribute("value");
			if(text1.equalsIgnoreCase("12"))
			{
				date_picker.get(i).click();
				break;	
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
}
