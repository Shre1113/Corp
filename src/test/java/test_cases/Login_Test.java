package test_cases;

import org.testng.annotations.Test;

import page_objects.Corp.Login_page;
import test_base.BaseTest;

public class Login_Test extends BaseTest
{
	@Test
	public void login() throws InterruptedException
	{
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		
	}

}
