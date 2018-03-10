package demoSite_practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static WebDriver driver;
	
	public static void screenshot(String screenshot_name) 
	{
		try 
		{
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("E:\\workspace\\Automation_new\\Screenshot"+screenshot_name+".png"));
		} 
		catch (IOException e) 
		{
		System.out.println(e.getMessage());
		}
	}
}