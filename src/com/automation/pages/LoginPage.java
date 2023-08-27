package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name = "uid") WebElement user;
@FindBy(name = "password") WebElement pass;
@FindBy(name = "btnLogin") WebElement login;
@FindBy(xpath = "//a[.='here']")private WebElement link;
@FindBy(name = "emailid")private WebElement email;
@FindBy(xpath = "//input[@type='submit']")private WebElement submit;
@FindBy(xpath = "//div[@id='dismiss-button']")private WebElement addvertise;
@FindBy(xpath = "//div[@class='btn skip']")private WebElement skipbtn;
public WebElement getSkipbtn() {
	return skipbtn;
}


public void closeAdd()
{
	addvertise.click();
	//skipbtn.click();
}


public WebElement getAddvertise() {
	return addvertise;
}


public WebElement getEmail() {
	return email;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
public void clickonlink(String emailid)
{
	link.click();
	email.sendKeys(emailid);
	submit.click();
}
public void validlogin(String username,String password)
{  
	user.sendKeys(username);
	pass.sendKeys(password);
	login.click();
}

public WebElement getLink() {
	return link;
}

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}



}