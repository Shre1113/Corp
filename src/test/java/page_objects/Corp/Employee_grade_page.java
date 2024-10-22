package page_objects.Corp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employee_grade_page extends Base_page
{
	public Employee_grade_page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//p[.='Masters']")
	WebElement Master;
	@FindBy(xpath="//*[@id=\"root\"]/div/aside/div[2]/div[1]/div[2]/ul/li[11]/div[2]/ul/li[1]/a")
	WebElement HRMS;
	@FindBy(xpath="//button[.='Employee Grade']")
	WebElement Employee_grade;
	@FindBy(xpath="//button[.='Add New Employee Grade']")
	WebElement Add_grade;
	@FindBy(name="__newname")
	WebElement Grade_name;
	@FindBy(name="custom_employee_grade_based_cost.0.city_category")
	WebElement City_cat_0;
	@FindBy(name="custom_employee_grade_based_cost.0.food")
	WebElement Food_expenses_0;
	@FindBy(name="custom_employee_grade_based_cost.0.travel")
	WebElement Travel_expenses_0;
	@FindBy(name="custom_employee_grade_based_cost.0.other_expenses")
	WebElement Other_expenses_0;
	@FindBy(xpath="//button[.='Add More']")
	WebElement Add_more;
	@FindBy(xpath="//button[.='Save']")
	WebElement Save;
	
	public void master() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Master);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", HRMS);
		
	}
	public void  employee_grade()
	{
		Employee_grade.click();;
	}
	public void Add_Grade()
	{
		Add_grade.click();	
	}
	public void grade_name(String Grade_Name)
	{
		Grade_name.sendKeys(Grade_Name);
		
	}
	public void City_cat_0(String City_Cat_0)
	{
		Select options = new Select(City_cat_0);
		options.selectByVisibleText(City_Cat_0);
	}
	public void Food_expenses_0(String Food_Expenses_0)
	{
		Food_expenses_0.sendKeys(Food_Expenses_0);
	}
	public void Travel_expenses_0(String Travel_Expenses_0)
	{
		Travel_expenses_0.sendKeys(Travel_Expenses_0);
	}
	public void Other_expenses_0(String Other_Expenses_0)
	{
		Other_expenses_0.sendKeys(Other_Expenses_0);
	}
	public void Add_More()
	{
		Add_more.click();
	}
	public void Save()
	{
		Save.click();
	}
	
	

}
