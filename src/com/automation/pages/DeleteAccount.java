package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount {
	@FindBy(name = "accountno")private WebElement accountno;
	 @FindBy(name = "AccSubmit")private WebElement accsubmit;
	 @FindBy(name ="reset")private WebDriver reset;
	 
	 public DeleteAccount(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }

	public WebElement getAccountno() {
		return accountno;
	}

	public WebElement getAccsubmit() {
		return accsubmit;
	}

	public WebDriver getReset() {
		return reset;
	}
}
