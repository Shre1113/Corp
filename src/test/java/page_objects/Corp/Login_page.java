package page_objects.Corp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Base_page
{

		public WebDriver driver;
		public Login_page (WebDriver driver) 
			{
				super(driver);
			}
		
		
		@FindBy(name="username")
		WebElement username;
		@FindBy(name="password")
		WebElement password;
		@FindBy(xpath="//button[.='Login']")
		WebElement login;
		
		
		public void UserName() throws InterruptedException
		{
			if(username.isEnabled())
			{
			username.sendKeys("admin@r.com");
			System.out.println("Enabled");
			}
			else
			{
				System.out.println("Not enabled");
			}
		}
		public void Password()
		{
			password.click();
			password.sendKeys("Rnit@123");
		}
		public void sumbit()
		{
			login.click();
		}
		
		
	}






