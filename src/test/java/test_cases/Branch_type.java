package test_cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.Corp.Branch_page;
import page_objects.Corp.Login_page;
import test_base.BaseTest;
import utilities.ExcelUtils;

public class Branch_type extends BaseTest
{
	@Test(dataProvider="Branch_data")
	public void Branch_type_creation(String Branch_Name, String Latitude, 
			String Longitude,String  Radius, String Address) throws InterruptedException
	{
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		Branch_page Branch_Creartion= new Branch_page(driver);
		Branch_Creartion.master();
		Branch_Creartion.branch();
		Branch_Creartion.add_New_Branch();
		Branch_Creartion.branch_name(Branch_Name);
		Branch_Creartion.latitude(Latitude);
		Branch_Creartion.longitude(Longitude);
		Branch_Creartion.Radius(Radius);
		Branch_Creartion.address(Address);
		Branch_Creartion.save();
		
		
	}
	 @DataProvider(name = "Branch_data")
	    public Object[][] getData() throws IOException 
	    {
	        String excelFilePath = "C:\\Users\\Admin\\eclipse-workspace\\Corp\\Excels\\Master_data.xlsx";
	        String sheetName = "Branch_types";

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


