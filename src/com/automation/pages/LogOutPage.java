package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
@FindBy(xpath = "//a[.='Log out']")private WebElement logoutbtn;

public void LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);

}

public WebElement getLogoutbtn() {
  return logoutbtn;
}
}
