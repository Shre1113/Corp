package page_objects.Corp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	WebElement Doj;
	@FindBy(name="date_of_birth")
	WebElement Dob;
	@FindBy(name="gender")
	WebElement Gender;
	@FindBy(name="marital_status")
	WebElement Marital_status;
	@FindBy(name="blood_group")
	WebElement Blood_group;
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
	@FindBy(xpath="//button[.='Save']")
	WebElement Save;
	
	public void Employee_M()
	{
		Emp_man.click();
	}
	public void Employee_Onb()
	{
		Emp_onboard.click();
	}
	public void Add_Employee()
	{
		Add_new.click();
	}
	public void name()
	{
		First_name.sendKeys("Balajione");
		Middle_name.sendKeys("A");
		Last_name.sendKeys("B");
	}
	public void role()
	{
		Select options= new Select(Role);
		options.selectByVisibleText("Employee");
	}
	public void email()
	{
		Email.sendKeys("Balajione@gmail.com");
	}
	public void mobile_number()
	{
		Mobile_number.sendKeys("9912123679");
	}
	public void emp_id()
	{
		Emp_id.sendKeys("BAL_02");
	}
	public void status()
	{
		Select options = new Select (Status);
		options.selectByVisibleText("Active");
	}
	public void doj()
	{
		Doj.sendKeys("10-09-2024");
	}
	public void dob()
	{
		Dob.sendKeys("15-08-2000");
	}
	public void gender()
	{
		Select options = new Select(Gender);
		options.selectByVisibleText("Male");
	}
	public void marital_status()
	{
		Select options = new Select(Marital_status);
		options.selectByVisibleText("Single");
	}
	public void blood_group()
	{
		Select options = new Select(Blood_group);
		options.selectByVisibleText("O+");
	}
	public void default_shift()
	{
		Select options = new Select(Default_shift);
		options.selectByVisibleText("General");
	}
	public void holiday_list()
	{
		Select options = new Select (Holiday_list);
		options.selectByVisibleText("2024_holiday_list");
	}
	public void grade()
	{
		Select options = new Select (Grade);
		options.selectByVisibleText("A");
	}
	public void leave_policy()
	{
		Select options = new Select(Leave_policy);
		options.selectByVisibleText("Leave Policy(12/09) (HR-LPOL-2024-00003)");
	}
	public void reports_to()
	{

	}
	public void branch()
	{
		Select options = new Select(Branch);
		options.selectByVisibleText("Head Office");
	}
	public void save()
	{
		Save.click();
	  
	}
	

}
