package basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links_test 
{
	@Test
	public void brokenlinks() throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		System.out.println("Title of home page is --> " +driver.getTitle());
		List<WebElement> Link_List=driver.findElements(By.tagName("a"));
		System.out.println("Total links present in webpage is --> "+Link_List.size());
		List<WebElement> Active_Links=new ArrayList<WebElement>();
		for(int i=0; i<Link_List.size(); i++)
		{
		if(Link_List.get(i).getAttribute("href")!=null && (!Link_List.get(i).getAttribute("href").contains("javascript")))
		{
			Active_Links.add(Link_List.get(i));
		}
		}
		System.out.println("Size of active links is --> "+Active_Links.size());
		for(int j=0; j<Active_Links.size(); j++)
		{
			HttpURLConnection connection=(HttpURLConnection) new URL(Active_Links.get(j).getAttribute("href")).openConnection();
			connection.connect();
			int response_code=connection.getResponseCode();
			//String response_msg=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(Active_Links.get(j).getAttribute("href")+" --> "+response_code);	
		}
		driver.close();
	} 
}