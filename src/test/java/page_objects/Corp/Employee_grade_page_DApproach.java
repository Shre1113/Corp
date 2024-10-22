package page_objects.Corp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employee_grade_page_DApproach extends Base_page
{




	    // Constructor to initialize WebDriver
		public Employee_grade_page_DApproach(WebDriver driver)
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
		
		public void master() throws InterruptedException {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    try {
		        // Wait for "Master" element to be visible and clickable
		        WebElement masterElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Masters']")));
		        if (masterElement != null) {
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("arguments[0].click();", masterElement);
		        } else {
		            System.out.println("Master element not found");
		        }

		        // Wait for "HRMS" element to be visible and clickable
		        WebElement hrmsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/aside/div[2]/div[1]/div[2]/ul/li[11]/div[2]/ul/li[1]/a")));
		        if (hrmsElement != null) {
		            JavascriptExecutor js1 = (JavascriptExecutor) driver;
		            js1.executeScript("arguments[0].click();", hrmsElement);
		        } else {
		            System.out.println("HRMS element not found");
		        }
		    } catch (TimeoutException e) {
		        System.out.println("Element not found within the timeout period.");
		    } catch (Exception e) {
		        System.out.println("An error occurred: " + e.getMessage());
		    }
		}	private Object xpath(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		public void  employee_grade()
		{
			Employee_grade.click();;
		}
		public void Add_Grade()
		{
			Add_grade.click();	
		}

		
	    // Method to interact with Grade Name field
	    public void grade_name(String gradeName) {
	        WebElement gradeNameField = driver.findElement(By.name("__newname"));
	        gradeNameField.sendKeys(gradeName);
	    }

	    // Methods to interact with fields in a particular row
	    public void setRowValues(int rowIndex, String cityCategory, String foodExpenses, String travelExpenses, String otherExpenses) {
	        // City Category
	        WebElement cityCategoryDropdown = driver.findElement(By.name("custom_employee_grade_based_cost." + rowIndex + ".city_category"));
	        cityCategoryDropdown.sendKeys(cityCategory);

	        // Food Expenses
	        WebElement foodField = driver.findElement(By.name("custom_employee_grade_based_cost." + rowIndex + ".food"));
	        foodField.sendKeys(foodExpenses);

	        // Travel Expenses
	        WebElement travelField = driver.findElement(By.name("custom_employee_grade_based_cost." + rowIndex + ".travel"));
	        travelField.sendKeys(travelExpenses);

	        // Other Expenses
	        WebElement otherField = driver.findElement(By.name("custom_employee_grade_based_cost." + rowIndex + ".other_expenses"));
	        otherField.sendKeys(otherExpenses);
	    }

	    // Method to add more rows
	    public void clickAddMoreButton() {
	        driver.findElement(By.xpath("//button[text()='Add More']")).click();
	    }

	    // Method to save
	    public void Save() {
	        driver.findElement(By.xpath("//button[text()='Save']")).click();
	    }
	    
	    // Other methods like accessing master, employee_grade etc. can stay as they are.
	}



