package testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_Test 
{
	WebDriver driver;
	
	@Test
	
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		System.out.println("Title of current page is : "+driver.getTitle());
		driver.close();
	}
	@Test
	public void sample_test()
	{
		System.out.println("First test case");
	}
	@Test
	public void sample_test2()
	{
		System.out.println("second test case");
	}
	@Test
	public void sample_test3()
	{
		System.out.println("Third test case");
	}
	@Test
	public void sample_test4()
	{
		System.out.println("Fourth test case");
	}
	@Test
	public void sample_test5()
	{
		System.out.println("Fifth test case");
		
	}
}
