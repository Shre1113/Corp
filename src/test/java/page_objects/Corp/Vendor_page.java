package page_objects.Corp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
      WebElement Email;
      @FindBy(name="vendor_type")
      WebElement Vendor_type;
      @FindBy(name="company")
      WebElement Company;
      @FindBy(name="address")
      WebElement Address;
      
      
      public void Master() throws InterruptedException
      {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeAsyncScript("arguments[0].click();", Master);
    	  Thread.sleep(2000);
    	  HRMS.click();;
      }
      //public    
      
      

}
