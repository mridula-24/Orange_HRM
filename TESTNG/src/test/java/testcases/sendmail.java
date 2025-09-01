package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class sendmail extends AppUtils {

	@Parameters({"mailid","sub"})
	@Test
	void sendmail(String email,String sub)
	{
		System.out.println("Mail sent to "+email+"with subject"+sub);
	}

       
       }