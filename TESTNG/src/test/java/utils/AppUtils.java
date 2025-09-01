package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

	@BeforeTest
	public void login() 
	{
		System.out.println("login to gmail");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("logout to gmail");
	}
	
	@BeforeSuite
	public void launchapp ()
	{ 
		System.out.println("launch gmail app");
	}
	@AfterSuite
	public void closeapp()
	
	{
		System.out.println("close gmail app");
		
	}
	}


