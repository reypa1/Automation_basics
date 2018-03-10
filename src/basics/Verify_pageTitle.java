package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_pageTitle {

	@Test
	public void Verify_Title()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	String Act_title=driver.getTitle();
	String Exp_title="Facebook – log in or sign up";
	if(Act_title.equals(Exp_title))
	{
		System.out.println("Actual title is : "+Act_title);
	}
	else{
		System.out.println("Expected title is : "+Exp_title);
	}
	driver.close();
	}
}
