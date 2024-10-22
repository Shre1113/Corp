package test_cases;
    import java.io.IOException;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
    import page_objects.Corp.Employee_grade_page_DApproach;
    import page_objects.Corp.Login_page;
	import test_base.BaseTest;
	import utilities.ExcelUtils;

	public class Employee_grade_Creation_DApproach extends BaseTest {

	    @Test(dataProvider = "Employee_grade_data")
	    public void gradeCreationTest(String gradeName, String[][] gradeCostDetails) throws InterruptedException {
	        // Log in as before
	        Login_page lp = new Login_page(driver);
	        lp.UserName();
	        lp.Password();
	        lp.sumbit();

	        // Open the Employee Grade page and start adding a grade
	        Employee_grade_page_DApproach gradePage = new Employee_grade_page_DApproach(driver);
	        gradePage.master();
	        gradePage.employee_grade();
	        gradePage.Add_Grade();
	        gradePage.grade_name(gradeName);
	        
	        // Loop through each row of grade cost details and fill them in
	        for (int i = 0; i < gradeCostDetails.length; i++) {
	            String cityCategory = gradeCostDetails[i][0];
	            String foodExpenses = gradeCostDetails[i][1];
	            String travelExpenses = gradeCostDetails[i][2];
	            String otherExpenses = gradeCostDetails[i][3];

	            // Fill the current row with the data
	            gradePage.setRowValues(i, cityCategory, foodExpenses, travelExpenses, otherExpenses);
	            
	            // If there are more rows, click "Add More"
	            if (i < gradeCostDetails.length - 1) {
	                gradePage.clickAddMoreButton();
	            }
	        }

	        // Save the grade details
	        gradePage.Save();
	    }

	    @DataProvider(name = "Employee_grade_data")
	    public Object[][] getData() throws IOException {
	        String excelFilePath = "C:\\Users\\Admin\\eclipse-workspace\\Corp\\Excels\\Master_data.xlsx";
	        String sheetName = "Sheet3";

	        // Set the Excel file and sheet
	        ExcelUtils.setExcelFile(excelFilePath, sheetName);

	        int rowCount = ExcelUtils.getRowCount();
	        int colCount = ExcelUtils.getColCount();

	        // Assuming the first column is the grade name and the remaining columns are the row data
	        Object[][] data = new Object[rowCount - 1][2];

	        for (int i = 1; i < rowCount; i++) {
	            data[i - 1][0] = ExcelUtils.getCellData(i, 0); // Grade name

	            // Adjust for the number of rows in the cost details (you can change 2 if more rows are needed)
	            String[][] gradeCostDetails = new String[2][4];  // Assuming there are two rows of costs, adjust accordingly

	            for (int j = 0; j < 2; j++) {  // Loop through each row (city, food, travel, other)
	                gradeCostDetails[j][0] = ExcelUtils.getCellData(i, j * 4 + 1);  // City Category
	                gradeCostDetails[j][1] = ExcelUtils.getCellData(i, j * 4 + 2);  // Food Expenses
	                gradeCostDetails[j][2] = ExcelUtils.getCellData(i, j * 4 + 3);  // Travel Expenses
	                gradeCostDetails[j][3] = ExcelUtils.getCellData(i, j * 4 + 4);  // Other Expenses
	            }

	            data[i - 1][1] = gradeCostDetails;
	        }

	        return data;
	    }
	}
