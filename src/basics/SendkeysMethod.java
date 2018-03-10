package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendkeysMethod {

	@Test
	public void Send_data_int_textBox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/registration/");
		driver.findElement(By.id("name_3_firstname")).sendKeys("Pawankumar");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Muppa");
		System.out.println("Data sent to user field succesfully");
		driver.close();
		
	}
}
