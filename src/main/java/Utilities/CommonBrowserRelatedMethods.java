package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HybridFramework.BaseFile;


public class CommonBrowserRelatedMethods extends BaseFile
{
	public static WebDriver d = driver;
	public static WebDriver browser(String browsername) throws Exception		// It will return the browser, which one we want to invoke
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./src/main/resources/drivers/geckodriver.exe");
			d = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
			d = new ChromeDriver();
		}
		return driver;
	}
	
	public void navigateto(String browser, String url) throws Exception
	{
		browser(browser);
		d.navigate().to(url);
	}
	
	public void urlcontains(String browser, String url, String title) throws Exception
	{
		browser(browser);
		driver.get(url);
		String browsertitle = driver.getTitle();
		if(browsertitle.contains(title))
		{
			System.out.println("Url Verified");
		}
		else
		{
			System.out.println("Url Verified Failed");
		}
	}
	
	public void waitfor(String seconds) throws Exception
	{
		try
		{
			Thread.sleep(Integer.parseInt(seconds));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitforelementvisible(String element) throws Exception
	{
		try
		{
			(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitforelementinvisible(String element) throws Exception
	{
		try
		{
			(new WebDriverWait(driver, 60)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
