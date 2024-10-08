package page_objects.Corp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Shift_type_page extends Base_page
{
	
	public Shift_type_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//p[.='Masters']")
	WebElement Master;
	@FindBy(xpath="//*[@id=\"root\"]/div/aside/div[2]/div[1]/div[2]/ul/li[11]/div[2]/ul/li[1]/a")
	WebElement HRMS;
	@FindBy(xpath="//button[.='Shift Type']")
	WebElement Shift_type;
	@FindBy(xpath="//button[.='Add New Shift']")
	WebElement Add_New_shift;
	@FindBy(name="shift_name")
	WebElement Shift_name;
	@FindBy(name="start_time")
	WebElement Start_time;
	@FindBy(name="end_time")
	WebElement End_time;
	@FindBy(name="shift_short_code")
	WebElement Shift_short_code;
	@FindBy(name="is_next_day")
	WebElement Is_next_day;
	@FindBy(name="holiday_list")
	WebElement Holiday_list;
	@FindBy(name="begin_check_in_before_shift_start_time")
	WebElement Begin_check_in_before_shift_start_time;
	@FindBy(name="allow_check_out_after_shift_end_time")
	WebElement Allow_check_out_after_shift_end_time;
	@FindBy(name="color")
	WebElement Color;
	@FindBy(xpath="//button[.='Close']")
	WebElement Close;
	@FindBy(xpath="//button[.='Save']")
	WebElement Save;
	
	
	public void master() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Master);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", HRMS);
		
	}
	public void Shift_Type()
	{
		Shift_type.click();
	}
	public void Add_New_shift()
	{
		Add_New_shift.click();
	}
	
	public void Shift_name(String Shift_Name)
	{
		Shift_name.sendKeys(Shift_Name);
	}
	public void Start_time(String Start_Time)
	{
		Start_time.sendKeys(Start_Time);
	}
	public void End_time(String End_Time)
	{
		End_time.sendKeys(End_Time);
	}
	public void Shift_short_code(String Shift_Short_Code)
	{
		Shift_short_code.sendKeys(Shift_Short_Code);
	}
	public void Is_next_day(String Is_Next_Day)
	{
		Select options = new Select(Is_next_day);
		options.selectByVisibleText(Is_Next_Day);
	}
	public void Holiday_list(String Holiday_List)
	{
		Select options = new Select(Holiday_list);
		options.selectByVisibleText(Holiday_List);
	}
	public void Begin_check_in_before_shift_start_time(String Begin_Check_In_Before_Shift_Start_Time)
	{
		Begin_check_in_before_shift_start_time.sendKeys(Begin_Check_In_Before_Shift_Start_Time);
	}
	public void Allow_check_out_after_shift_end_time(String Allow_Check_Out_After_Shift_End_Time)
	{
		Allow_check_out_after_shift_end_time.sendKeys(Allow_Check_Out_After_Shift_End_Time);
	}
	/*public void Color()
	{                            //defualt one
		Color.click();
	}*/
	public void Save()
	{
		Save.click();
	}
	

}
