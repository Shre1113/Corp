package test_cases;

import org.testng.annotations.Test;

import page_objects.Corp.Emp_creation_page;
import page_objects.Corp.Login_page;
import test_base.BaseTest;

public class Employee_Creation extends BaseTest
{
	@Test
	public void Employee() throws InterruptedException
	{
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		Emp_creation_page EC= new Emp_creation_page(driver);
		EC.Employee_M();
		EC.Employee_Onb();
		EC.Add_Employee();
		EC.name();
		EC.role();
		EC.email();
		EC.mobile_number();
		EC.emp_id();
		EC.status();
		EC.doj();
		EC.dob();
		EC.gender();
		EC.marital_status();
		EC.blood_group();
		EC.default_shift();
		EC.holiday_list();
		EC.grade();
		EC.branch();
		EC.save();
		
		
		
	}

}
