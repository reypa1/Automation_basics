package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio_Button {

	@Test
	public void radio_btn() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/registration/");
		List<WebElement> radio_btn=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radio_btn.size();i++)
		{
			WebElement radio=radio_btn.get(i);
			String text=radio.getAttribute("value");
			if(text.equalsIgnoreCase("Divorced"))
			{
			radio.click();
			break;
			}
		}
		driver.close();
	}
}
