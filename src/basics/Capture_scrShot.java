package basics;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capture_scrShot 
{
	public static void Screenshot(WebDriver driver, String screenshotname)
	{
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E://workspace//Automation_new//Screenshot/"+screenshotname+".png"));
		}
		catch (Exception e) 
		{
			System.out.println("Error while capturing screenshot"+e.getMessage());
		}
	}
}
