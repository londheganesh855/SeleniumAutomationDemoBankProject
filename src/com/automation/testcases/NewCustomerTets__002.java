package com.automation.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utility.BaseTest;
import com.automation.utility.Flib;

import customerdata.CreateCustomerdata;

public class NewCustomerTets__002 extends BaseTest{

	@BeforeClass
	public void openbrowser() throws IOException
	{
		BaseTest bt = new BaseTest();
		bt.setup();
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib fb = new Flib();
		lp.validlogin(fb.readExcelData(EXCEL_PATH,"validcreads",1,0),
				fb.readExcelData(EXCEL_PATH,"validcreads",1,1));
		Thread.sleep(5000);

	}
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		CreateCustomerdata create = new CreateCustomerdata();
		create.createnewCustomer();
		boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (result==true) 
		{
			Assert.assertTrue(true);
		} 
		else 
		{
			captureScreenShot("createCustomer");
		Assert.assertTrue(false);
		}
		
		
	}


	@AfterMethod
	public void closebrowser()
	{
		BaseTest bt = new BaseTest();
		bt.closeBrowser();

	}
}
