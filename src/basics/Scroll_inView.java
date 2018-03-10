package basics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Scroll_inView 
{
	@Test
	public void scroll_IN()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	    JavascriptExecutor je=(JavascriptExecutor)driver;
	    WebElement ele=driver.findElement(By.xpath("//div[@class='rhf-header']"));
	    je.executeScript("arguments[0].scrollIntoview(true);", ele);
	    System.out.println(ele.getText());
	    driver.close();	
	}
}