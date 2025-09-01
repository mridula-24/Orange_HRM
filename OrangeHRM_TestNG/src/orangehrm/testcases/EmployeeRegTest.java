package orangehrm.testcases;

import org.testng.annotations.Test;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest extends AppUtils{
      
	
	@Test
	
	
	public static void checkEmpReg()
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.addEmployee("Richards", "Demo");
		if(res)
		{
			System.out.println("Employee Reg Test Pass");
		}else
		{
			System.out.println("Employee Reg Test Fail");
		}
		lp.logout();
		AppUtils.closeApp();
	}

}
