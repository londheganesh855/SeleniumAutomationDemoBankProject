package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustmisedStatement {
@FindBy(name = "accountno")private WebElement a;
@FindBy(name = "fdate")private WebElement fdate;
@FindBy(name = "tdate")private WebElement tdate;
@FindBy(name="loweramt")private WebElement lowerlimit;
@FindBy(name = "tranno")private WebElement numoftran;
@FindBy(name = "AccSubmit")private WebElement submit;

public CustmisedStatement(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getA() {
	return a;
}

public WebElement getFdate() {
	return fdate;
}

public WebElement getTdate() {
	return tdate;
}

public WebElement getLowerlimit() {
	return lowerlimit;
}

public WebElement getNumoftran() {
	return numoftran;
}

public WebElement getSubmit() {
	return submit;
}
}
