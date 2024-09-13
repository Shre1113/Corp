package page_objects.Corp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Emp_creation_page extends Base_page
{
	public WebDriver driver;
	public Emp_creation_page(WebDriver driver)
	{
		super(driver);
	}
	//Employee details
	@FindBy(xpath="//p[normalize-space()=\"Employee Management\"]")
	WebElement Emp_man;
	@FindBy(xpath="//p[normalize-space()=\"Employee On-Board\"]")
	WebElement Emp_onboard;
	@FindBy(xpath="//button[.='Add New Employee']")	
	WebElement Add_new;
	@FindBy(name="first_name")
	WebElement First_name;
	@FindBy(name="middle_name")
	WebElement Middle_name;
	@FindBy(name="last_name")
	WebElement Last_name;
	@FindBy(name="role_profile")
	WebElement Role;
	@FindBy(name="company_email")
	WebElement Email;
	@FindBy(name="cell_number")
	WebElement Mobile_number;
	@FindBy(name="employee_id")
	WebElement Emp_id;
	@FindBy(name="status")
	WebElement Status;
	@FindBy(name="date_of_joining")
	WebElement doj;
	@FindBy(name="date_of_birth")
	WebElement dob;
	@FindBy(name="gender")
	WebElement Gender;
	@FindBy(name="marital_status")
	WebElement Marital_status;
	@FindBy(name="blood_group")
	WebElement blood_group;
	@FindBy(name="default_shift")
	WebElement Default_shift;
	@FindBy(name="holiday_list")
	WebElement Holiday_list;
	@FindBy(name="grade")
	WebElement Grade;
	//Company Details
	@FindBy(name="leave_policy")
	WebElement Leave_policy;
	@FindBy(xpath="//span[@id=\"react-select-2-live-region\"]")
	WebElement Reports_to;
	@FindBy(name="designation")
	WebElement Designation;
	@FindBy(name="branch")
	WebElement Branch;
	@FindBy(name="department")
	WebElement Department;
	@FindBy(xpath="//input[@name='branch']")
	WebElement Employee_branch;
	@FindBy(name="employment_type")
	WebElement Employment_type;
	//Bank details
	@FindBy(name="bank_name")
	WebElement Bank_name;
	@FindBy(name="bank_ac_no")
	WebElement Bank_ac_no;
	@FindBy(name="ifsc_code")
	WebElement Ifsc_code;
	//Salary
	@FindBy(name="pan_number")
	WebElement Pan_number;
	@FindBy(name="provident_fund_account")
	WebElement Provident_fudn_account;
	@FindBy(name="custom_pf_uan")
	WebElement Pf_uan;
	@FindBy(name="ctc")
	WebElement Ctc;
	//Employee Wages
	@FindBy(xpath="//span[.='Based on Hourly Shift Wages']")
	WebElement Wages;
	@FindBy(name="custom__regular_hourly_rate")
	WebElement Re_rate;
	@FindBy(name="custom_employee_hourly_rate_for_overtimeot")
	WebElement R_over;
	@FindBy(name="custom__employee_hourly_rate_for_holiday")
	WebElement R_Holiday;
	//Attachments
	//Id Proofs
	@FindBy(name="id_proof_type")
	WebElement Id_proof_type;
	@FindBy(name="id_proof_no")
	WebElement Id_proof_no;
	@FindBy(xpath="//input[@id=\"field-:r4g:\"]")
	WebElement Attach_file_upload_id;
	//Address
	@FindBy(name="address_proof_type")
	WebElement Address_proof_type;
	@FindBy(name="address_proof_no")
	WebElement Address_proof_no;
	@FindBy(id="field-:r4j:")
	WebElement Attach_file_upload_adress;
	//Save
	@FindBy(xpath="//button[.='Save'])")
	WebElement Save;
	
	
	

}
