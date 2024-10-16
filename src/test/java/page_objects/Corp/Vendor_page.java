package page_objects.Corp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Vendor_page extends Base_page
{
	public Vendor_page(WebDriver driver)
	{
		super(driver);
	}
	  @FindBy(xpath="//p[.='Masters']")
	  WebElement Master;
	  @FindBy(xpath="//*[@id=\"root\"]/div/aside/div[2]/div[1]/div[2]/ul/li[11]/div[2]/ul/li[1]/a")
	  WebElement HRMS;
      @FindBy(xpath="//button[.='Vendor']")
      WebElement Vendor;
      @FindBy(xpath="//button[.='Add New Vendor']")
      WebElement Add_new_vendor;
      @FindBy(name="vendor_name")
      WebElement Vendor_name;
      @FindBy(name="mobile_number")
      WebElement Mobile_number;
      @FindBy(name="vendor_id")
      WebElement Vendor_id;
      @FindBy(name="email")
      WebElement Email_;
      @FindBy(name="vendor_type")
      WebElement Vendor_type;
      @FindBy(name="company")
      WebElement Company_;
      @FindBy(name="address")
      WebElement Address_;
      @FindBy(xpath="//button[.='Save']")
      WebElement Save;
      
      
      public void master() throws InterruptedException
  	{
  		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("arguments[0].click();", Master);
  		Thread.sleep(2000);
  		JavascriptExecutor js1 = (JavascriptExecutor) driver;
  		js1.executeScript("arguments[0].click();", HRMS);
  		
  	}
      public void vendor()
      {
    	  Vendor.click();
      }
      public void add_new_vendor()
      {
    	  Add_new_vendor.click();
      }
      public void Vendor_name(String Vendor_Name)
      {
    	  Vendor_name.sendKeys(Vendor_Name);
      }
      public void mobile_number(String Mobile_Number)
      {
    	  Mobile_number.sendKeys(Mobile_Number);
      }
      public void vendor_id(String Vendor_Id)
      {
    	  Vendor_id.sendKeys(Vendor_Id);
      }
      public void email(String Email)
      {
    	  Email_.sendKeys(Email);
      }
      public void vendor_type(String Vendor_Type)
      {
    	  Select options = new Select(Vendor_type);
    	  options.selectByVisibleText(Vendor_Type);
      }
      public void Company(String Company)
      {
    	  Select options = new Select(Company_);
    	  options.selectByVisibleText(Company);
      }
      public void address(String Address)
      {
    	  Address_.sendKeys(Address);
      }
      public void save()
      {
    	  Save.click();
      }
}
