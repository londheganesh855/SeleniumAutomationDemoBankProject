package com.automation.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utility.BaseTest;
import com.automation.utility.Flib;

public class LoginTest_001 extends BaseTest {

	@BeforeMethod
	public void openbrowser() throws IOException
	{   
		BaseTest bt = new BaseTest();
		bt.setup();
	}
	@Test
	public void login() throws IOException
	{ 
		LoginPage lp = new LoginPage(driver);
		Flib fb = new Flib();
		String username = fb.readPropertFile(PROP_PATH, "username");
		String password = fb.readPropertFile(PROP_PATH, "password");
	    lp.validlogin(username,password);
	}
	@AfterMethod
	public void closebrowser()
	{
		BaseTest bt = new BaseTest();
		bt.closeBrowser();

	}

}
