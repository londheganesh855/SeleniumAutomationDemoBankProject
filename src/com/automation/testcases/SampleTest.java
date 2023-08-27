package com.automation.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
          WebDriver	driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demo.guru99.com/v3/index.php");
          Thread.sleep(2000);
          driver.findElement(By.name("uid")).sendKeys("mngr443617");
          driver.findElement(By.name("password")).sendKeys("uqYbajA");
          driver.findElement(By.name("btnLogin")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[.='New Customer']")).click();
          Thread.sleep(2000);
          // Alert alrt = driver.switchTo().alert();
          //alrt.dismiss();
          //WebElement frame = driver.findElement(By.xpath("//iframe[@id='ad_iframe']"));
          //driver.switchTo().frame(frame);
          //driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
}
}
