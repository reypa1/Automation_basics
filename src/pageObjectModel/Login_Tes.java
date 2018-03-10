package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login_Tes 
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
	Fb_loginpage fb=new Fb_loginpage(driver);
    fb.uid().sendKeys("pavan.chowdary137@gmail.com");
    fb.pass().sendKeys("pa1kumar12$*");
    fb.Submit().click();
    
    String act_title=driver.getTitle();
    System.out.println(act_title);
    String Exp="Facebook";
    if(act_title.equalsIgnoreCase(Exp))
    {
    	System.out.println("Title matches");
    }
    else
    {
    	System.out.println("Title don't matches");
    }
    
	driver.close();
}
}
