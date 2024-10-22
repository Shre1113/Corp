package test_cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.Corp.Branch_page;
import page_objects.Corp.Employee_grade_page;
import page_objects.Corp.Login_page;
import test_base.BaseTest;
import utilities.ExcelUtils;

public class Employee_Grade_Creation extends BaseTest
{

	@Test(dataProvider="Employee_grade_data")
	public void Employee_grade_creation(String Grade_Name, String City_Cat_0, 
			String Food_Expenses_0,String  Travel_Expenses_0, String Other_Expenses_0) throws InterruptedException
	{
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		
		Employee_grade_page grade_creation = new Employee_grade_page(driver);
		grade_creation.master();
		grade_creation.employee_grade();
		grade_creation.Add_Grade();
		grade_creation.grade_name(Grade_Name);
		grade_creation.City_cat_0(City_Cat_0);
		grade_creation.Food_expenses_0(Food_Expenses_0);
		grade_creation.Travel_expenses_0(Travel_Expenses_0);
		grade_creation.Other_expenses_0(Other_Expenses_0);
		grade_creation.Add_More();
		grade_creation.Save();
		
	}
	 @DataProvider(name = "Employee_grade_data")
	    public Object[][] getData() throws IOException 
	    {
	        String excelFilePath = "C:\\Users\\Admin\\eclipse-workspace\\Corp\\Excels\\Master_data.xlsx";
	        String sheetName = "Employee_Grade";

	        // Set the Excel file and sheet before getting the data
	        ExcelUtils.setExcelFile(excelFilePath, sheetName);

	        int rowCount = ExcelUtils.getRowCount();
	        int colCount = ExcelUtils.getColCount();

	        Object[][] data = new Object[rowCount - 1][colCount];

	        for (int i = 1; i < rowCount; i++) 
	        {
	            for (int j = 0; j < colCount; j++) 
	            {
	                data[i - 1][j] = ExcelUtils.getCellData(i, j);
	            }
	        }

	        return data;
	    }


}



