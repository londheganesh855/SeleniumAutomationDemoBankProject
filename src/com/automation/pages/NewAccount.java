package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	@FindBy(xpath = "//a[.='New Account']")private WebElement newacclink;
	@FindBy(name ="cusid")private WebElement cusid;
	@FindBy(name ="selaccount")private WebElement selaccount;
	@FindBy(name ="inideposit")private WebElement inideposit;
	@FindBy(name ="button2")private WebElement submit;
	@FindBy(name ="reset")private WebElement reset;
	@FindBy(xpath = "//div[@id='dismiss-button']")private WebElement addvertise;
	@FindBy(xpath = "//div[@class='btn skip']")private WebElement skipbtn;


	public WebElement getSkipbtn() {
		return skipbtn;
	}
	public void skipAdd()
	{
        skipbtn.click();
	}

	public void closeAdd()
	{
		addvertise.click();
	}


	public WebElement getAddvertise() {
		return addvertise;
	}
	public void submit()
	{
		submit.click();
	}
	public void reset()
	{
		reset.click();
	}
	public void initialDiposite(String amount)
	{
		inideposit.sendKeys(amount);
	}
	public void customerId(String id)
	{
		cusid.sendKeys(id);

	}
	public void selectaccType()
	{
		Select sel = new Select(selaccount);
		sel.deselectByValue("Savings");
	}
	public void clickOnAcclink()
	{
		newacclink.click();
	}

	public NewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getNewacclink() {
		return newacclink;
	}


	public WebElement getCusid() {
		return cusid;
	}


	public WebElement getSelaccount() {
		return selaccount;
	}


	public WebElement getInideposit() {
		return inideposit;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getReset() {
		return reset;
	}


}
