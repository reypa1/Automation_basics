package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
public class Links_validation 
{
@SuppressWarnings("deprecation")
@Test
public void Links()
{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	//Accept SSL errors & Insecure connections
	capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
	ChromeOptions options=new ChromeOptions();
	options.merge(capabilities);
	//To maximize the window
	options.addArguments("start-maximized");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(options);
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
	List<WebElement> count=driver.findElements(By.tagName("a"));
	System.out.println("Total links present in current page is : "+count.size());
	WebElement footer=driver.findElement(By.xpath("//footer[@id='glbfooter']"));
	System.out.println("Total links present in footer section is : "+footer.findElements(By.tagName("a")).size());
	WebElement col=driver.findElement(By.xpath(".//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
	String beforeclick=null;
	String afterclick;
	for (int i=0;i<col.findElements(By.tagName("a")).size();i++) 
	{
	if(col.findElements(By.tagName("a")).get(i).getText().contains("Bidding & buying help"))
	{
		System.out.println(beforeclick=driver.getTitle());
		col.findElements(By.tagName("a")).get(i).click();
		break;
	}
	}
	System.out.println(afterclick=driver.getTitle());
	if(beforeclick!=afterclick)
	    {
		System.out.println("Pass");
	    }
	else
	    {
		System.out.println("Fail");	
		}
	driver.close();
}
}