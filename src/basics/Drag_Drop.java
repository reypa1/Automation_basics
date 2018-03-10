package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop 
{
@Test
public void dran_drop()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	Actions act=new Actions(driver);
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target=driver.findElement(By.xpath("//div[@id='droptarget']"));
	act.dragAndDrop(source, target).perform();
	System.out.println("Operation success");
	driver.close();
}
}
