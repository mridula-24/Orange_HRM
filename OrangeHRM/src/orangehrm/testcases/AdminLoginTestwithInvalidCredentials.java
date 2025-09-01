package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidCredentials 
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.login("Admin", "xyz");
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("Login displayed appropriate error message for invalid data, Test Pass");
		}else
		{
			System.out.println("Login not displayed appropriate error message for invalid data, Test Fail");
		}
		AppUtils.closeApp();
	}
}
