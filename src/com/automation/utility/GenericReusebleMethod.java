package com.automation.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericReusebleMethod {
	public static WebDriver driver;
	Actions action = new Actions(driver);
	public void Mousehover(WebElement element)
	{
		action.moveToElement(element).build().perform();
	}
	public void doubleclick(WebElement element)
	{
		action.doubleClick(element).build().perform();
	}
	public void rightclick(WebElement element)
	{
		action.contextClick(element).build().perform();
	}
	public void dragAndDrop(WebElement source,WebElement target)
	{
		action.dragAndDrop(source, target).build().perform();
	}
	public void clickAndHold(WebElement element)
	{
		action.clickAndHold(element).build().perform();
	}
	public void alertAccept()
	{
		Alert target = driver.switchTo().alert();
		target.accept();
	}
	public void alertDismiss()
	{
		Alert target = driver.switchTo().alert();
		target.dismiss();
	}
	public void alertsendText(String text)
	{
		Alert target = driver.switchTo().alert();
		target.sendKeys(text);
	}
	public void isDisplayed(WebElement element)
	{
		boolean result = element.isDisplayed();
		System.out.println(result);
	}
	public void isEnable(WebElement element)
	{
		boolean result = element.isEnabled();
		System.out.println(result);
	}
	public void isSelected(WebElement element)
	{
		boolean result = element.isSelected();
		System.out.println(result);
	}
	public void dropDown(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void dropDown(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void dropDown1(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void Scrolldown(int x)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,"+(x)+")");
	}
	
	public void Scrollup(int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,"+(-y)+")");
	}
	public void Scrollup(int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,"+((1000)+(0))+")");
	}
	
	public void pasteText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void copyText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void getAllOptionsOfDropdown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement op:allOps)
		{
			String textOfOption = op.getText();
			System.out.println(textOfOption);
		}
		
	}


}
