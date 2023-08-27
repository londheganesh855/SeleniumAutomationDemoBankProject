package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatement {
	 @FindBy(name = "accountno")private WebElement accountno;
	 public WebElement getAccountno() {
		return accountno;
	}


	public WebElement getAccsubmit() {
		return accsubmit;
	}


	public WebDriver getReset() {
		return reset;
	}


	@FindBy(name = "AccSubmit")private WebElement accsubmit;
	 @FindBy(name ="reset")private WebDriver reset;
	 
	 
	 public MiniStatement(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
}
