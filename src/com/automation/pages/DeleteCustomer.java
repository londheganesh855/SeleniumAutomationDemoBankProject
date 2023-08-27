package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {
@FindBy(name = "cusid")private WebDriver custmerId;
@FindBy(name = "AccSubmit")private WebDriver accsubmit;
@FindBy(name = "res")private WebDriver reset;

public DeleteCustomer(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebDriver getCustmerId() {
	return custmerId;
}

public WebDriver getAccsubmit() {
	return accsubmit;
}

public WebDriver getReset() {
	return reset;
}
}
