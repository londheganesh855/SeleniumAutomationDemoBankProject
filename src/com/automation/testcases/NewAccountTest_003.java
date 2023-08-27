package com.automation.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.pages.NewAccount;
import com.automation.utility.BaseTest;
import com.automation.utility.CustomLisener;
import com.automation.utility.Flib;
@Listeners(CustomLisener.class)
public class NewAccountTest_003 extends BaseTest {
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

	}
	@Test
	public void createNewAccount()
	{
		NewAccount newacc = new NewAccount(driver);
		newacc.clickOnAcclink();
		newacc.customerId("55534");
		newacc.initialDiposite("500000");
		newacc.submit();

	}
	@AfterMethod
	public void closeBrowser()
	{
		BaseTest bt = new BaseTest();
		bt.closeBrowser();
	}


}
