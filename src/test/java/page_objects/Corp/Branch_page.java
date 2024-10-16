package page_objects.Corp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branch_page extends Base_page
{
	public Branch_page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//p[.='Masters']")
	WebElement Master;
	@FindBy(xpath="//*[@id=\"root\"]/div/aside/div[2]/div[1]/div[2]/ul/li[11]/div[2]/ul/li[1]/a")
	WebElement HRMS;
	@FindBy(xpath="//button[.='Branch']")
	WebElement Branch;
	@FindBy(xpath="//button[.='Add New Branch']")
	WebElement Add_new_branch;
	@FindBy(name="branch")
	WebElement Branch_name;
	@FindBy(name="latitude")
	WebElement latitude;
	@FindBy(name="longitude")
	WebElement longitude;
	@FindBy(name="radius")
	WebElement radius;
	@FindBy(name="address")
	WebElement address;
	@FindBy(xpath="//button[.='Save']")
	WebElement Save;
	@FindBy(xpath="//button[.='Close']")
	WebElement Close;

	public void master() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Master);
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", HRMS);
		
	}
	public void branch()
	{
		Branch.click();
	}
	public void add_New_Branch()
	{
		Add_new_branch.click();
	}
	public void  branch_name(String Branch_Name)
	{
		 Branch_name.sendKeys(Branch_Name);
	}
	public void latitude(String Latitude)
	{
		latitude.sendKeys(Latitude);
	}
	public void longitude(String Longitude)
	{
		longitude.sendKeys(Longitude);
	}
	public void Radius(String Radius)
	{
		radius.sendKeys(Radius);
	}
	public void address(String Address)
	{
		address.sendKeys(Address);
	}
	public void save()
	{
		Save.click();
	}
}
