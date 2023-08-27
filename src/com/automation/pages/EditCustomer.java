package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
@FindBy(name = "cusid")private WebElement custmerId;
@FindBy(name = "AccSubmit")private WebElement submit;
@FindBy(name = "res")private WebElement reset;


public EditCustomer(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getCustmerId() {
	return custmerId;
}


public WebElement getSubmit() {
	return submit;
}


public WebElement getReset() {
	return reset;
}
}
