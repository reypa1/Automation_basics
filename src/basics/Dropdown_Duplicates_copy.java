package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown_Duplicates_copy 
{
@Test
public void Dropdown()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("url");
	Select slctCountry = new Select(driver.findElement(By.id("select_id")));
	// create an empty List
	List<String> optionsList = new ArrayList<String>();
	// a Set naturally removes duplicates!
	Set<String> optionsSet = Collections.emptySet();
	for (WebElement option : slctCountry.getOptions()) 
	{
	    // fill both from the same source
	    optionsList.add(option.getText());
	    optionsSet.add(option.getText());
	}
	// compare the two
	Assert.assertEquals(optionsSet.size(), optionsList.size());
}	
}
