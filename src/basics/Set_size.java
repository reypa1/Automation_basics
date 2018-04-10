package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://book.spicejet.com/");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(480, 640);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
        driver.close();
	}

}
