package pageFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class Fb_loginTest
{
WebDriver driver;
@Test
public void login()
{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("--start-maximized");
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	Fb_loginPage1 fb=PageFactory.initElements(driver, Fb_loginPage1.class);
	fb.user_id1("pavan.chowdary137@gmail.com");
	fb.pass1("pa1kumar12$*");
	fb.submit1();
	System.out.println(driver.getTitle());
	driver.close();
}
}