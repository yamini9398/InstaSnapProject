package com.project.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
@BeforeClass
	public void BroswerSetUp() {
	Reporter.log("Browser launched succesfully",true);

	}
@BeforeMethod
public void Login()
{
Reporter.log("Login succesfully",true);
}
@AfterMethod
public void Logout()
{
Reporter.log("LOgout succesfully",true);
}

@AfterClass
public void TerminateBrowser()
{
Reporter.log("Browser launched succesfully",true);
}


}
