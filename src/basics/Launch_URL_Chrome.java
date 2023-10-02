package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_URL_Chrome {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {

		String driverpath = "C://Users//Pavan Kumar Muppa//eclipse-workspace//Drivers//chromedriver-win64//chromedriver-win64//chromedriver.exe/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		System.out.println("Browser launched url succesfully");
		driver.close();
	}

}
