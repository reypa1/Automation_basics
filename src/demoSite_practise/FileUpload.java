package demoSite_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload 
{
	public WebDriver driver;
@Test
public void upload_file()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\Admin\\Desktop\\Java Interview questions.txt");
	driver.close();
}
}
