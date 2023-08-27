package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;



public class BaseTest implements IAutoconstant {
public static WebDriver driver;
public void setup() throws IOException
{ 
	Flib flib = new Flib();
	String browservalue = flib.readPropertFile(PROP_PATH, "browser");

	String url = flib.readPropertFile(PROP_PATH, "url");
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE );
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
}
public void captureScreenShot(String Mname) throws IOException
{
	try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(SCREENSHOT_PATH+Mname+".jpg");
		Files.copy(source, target);
		System.out.println("ScreenShot Taken");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
public void closeBrowser()
{
	driver.quit();
}


}
