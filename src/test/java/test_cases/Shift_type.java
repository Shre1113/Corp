package test_cases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.Corp.Login_page;
import page_objects.Corp.Shift_type_page;
import test_base.BaseTest;
import utilities.ExcelUtils;

public class Shift_type extends BaseTest
{
	@Test(dataProvider = "ShiftData")
    public void loginTest(String Shift_Name, String	Start_Time,
    		String End_Time, String	Shift_Short_Code, String	Is_Next_Day, String	Holiday_List,	
    		String Begin_Check_In_Before_Shift_Start_Time,	
    		String Allow_Check_Out_After_Shift_End_Time) throws InterruptedException
    {
		Login_page lp= new Login_page(driver);
		lp.UserName();
		lp.Password();
		lp.sumbit();
		
		Shift_type_page Shift_Creation= new Shift_type_page(driver);
		Shift_Creation.master();
		Shift_Creation.Shift_Type();
		Shift_Creation.Add_New_shift();
		Shift_Creation.Shift_name(Shift_Name);
		Shift_Creation.Start_time(Start_Time);
		Shift_Creation.End_time(End_Time);
		Shift_Creation.Shift_short_code(Shift_Short_Code);
		Shift_Creation.Is_next_day(Is_Next_Day);
		Shift_Creation.Holiday_list(Holiday_List);
		Shift_Creation.Allow_check_out_after_shift_end_time(Allow_Check_Out_After_Shift_End_Time);
		Shift_Creation.Begin_check_in_before_shift_start_time(Begin_Check_In_Before_Shift_Start_Time);
		Shift_Creation.Save();
		
		
		
    }
	
	 @DataProvider(name = "ShiftData")
	    public Object[][] getData() throws IOException 
	    {
	        String excelFilePath = "C:\\Users\\Admin\\eclipse-workspace\\Corp\\Excels\\Master_data.xlsx";
	        String sheetName = "Shift_types";

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





