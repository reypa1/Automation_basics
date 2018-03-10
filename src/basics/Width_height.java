package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Width_height 
{
@Test
public void width_and_height()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavan.chowdary137@gmail.com");
    WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
    int width=ele.getSize().getWidth();
    int height=ele.getSize().getHeight();
    System.out.println("width of text box is  "+width);
    System.out.println("height of text box is  "+height); 
    driver.close();
}
}
