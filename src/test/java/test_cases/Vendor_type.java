package test_cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.Corp.Login_page;
import page_objects.Corp.Vendor_page;
import test_base.BaseTest;
import utilities.ExcelUtils;

public class Vendor_type extends BaseTest
{
	@Test(dataProvider="Vendor_creation")
	public void vendor_creation(String Vendor_Name, String Mobile_Number, String Vendor_Id, 
			String Email, String Vendor_Type, String Company, String Address) throws InterruptedException
	{
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		Vendor_page VendorCreation = new Vendor_page(driver);
		VendorCreation.master();
		VendorCreation.vendor();
		VendorCreation.add_new_vendor();
		VendorCreation.Vendor_name(Vendor_Name);
		VendorCreation.mobile_number(Mobile_Number);
		VendorCreation.vendor_id(Vendor_Id);
		VendorCreation.email(Email);
		VendorCreation.vendor_type(Vendor_Type);
		VendorCreation.Company(Company);
		VendorCreation.address(Address);
		VendorCreation.save();
		
		
	}
	@DataProvider(name="Vendor_creation")
	public Object[][] getData () throws IOException
	{
		String excelFilePath="C:\\Users\\Admin\\eclipse-workspace\\Corp\\Excels\\Master_data.xlsx";
		String sheetName="Vendor_types";
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


