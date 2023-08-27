package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewCustomer {
	WebDriver driver;
	@FindBy(xpath = "//a[.='New Customer']")private WebElement newcustomer;
	@FindBy(name = "name")private WebElement customername;
	@FindBy(name = "rad1")private WebElement male;
	@FindBy(name = "rad2")private WebElement female;
	@FindBy(name = "dob")private WebElement dateofbirth;
	@FindBy(name = "addr")private WebElement address;
	@FindBy(name = "city")private WebElement custcity;
	@FindBy(name = "state")private WebElement state;
	@FindBy(name = "pinno")private WebElement pin;
	@FindBy(name = "telephoneno")private WebElement telephono;
	@FindBy(name="emailid")private WebElement emailid;
	@FindBy(name = "sub")private WebElement submit;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath = "//iframe[@id='ad_iframe']")private WebElement frame;
	@FindBy(xpath = "//div[@id='dismiss-button']")private WebElement dismiss;

	public void closeAdd() throws InterruptedException
	{
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		dismiss.click();
	}
	
	
	public WebElement getDismiss() {
		return dismiss;
	}

	
	public void dimiss()
	{
		driver.switchTo().alert().dismiss();
	}

	//Reusable method
	public void clickCustLink()
	{
		newcustomer.click();
	}
	
	public WebElement getFrame() {
		return frame;
	}


	public void customername(String custname)
	{
		customername.sendKeys(custname);
	}
	public void male()
	{
		male.click();
	}
	public void female()
	{
		female.click();
	}
	public void dateofbirt(String mm,String dd,String yy)
	{
		dateofbirth.sendKeys(mm);
		dateofbirth.sendKeys(dd);
		dateofbirth.sendKeys(yy);
	}
	public void address(String add)
	{
		address.sendKeys(add);
	}
	public void city(String city)
	{
		custcity.sendKeys(city);
	}
	public void state(String statename)
	{
		state.sendKeys(statename);
	}
	public void pin(String pincode)
	{

		pin.sendKeys(pincode.toString());
	}
	public void telephone(String mobileno)
	{
		telephono.sendKeys(mobileno);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void emailid(String email)
	{
		emailid.sendKeys(email);
	}
	public void submit()
	{
		submit.click();
	}
	//Initialization
	public NewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getDateofbirth() {
		return dateofbirth;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return custcity;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getTelephono() {
		return telephono;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getSubmit() {
		return submit;
	}


}