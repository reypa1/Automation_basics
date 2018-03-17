package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_dropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.ksrtc.in/oprs-web/");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys("gun");
	
		//Javascript executor to extract hidden elements in dom
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		
		int i=0;
		
		while(!text.equalsIgnoreCase("Guntur"))
		{
			i++;
		driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(script);
		System.out.println(text);
		
		if(i>10)
		{
			break;
		}		
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found");
		}
		driver.close();
	}
}
