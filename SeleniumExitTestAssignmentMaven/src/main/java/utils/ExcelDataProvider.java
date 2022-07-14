package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	
     @DataProvider(name = "test1data")
	public Object[][] getData1() {

 	    String excelPath = "C:\\Users\\ravitkumar\\eclipse-workspace\\SeleniumExitTestAssignmentMaven\\excel\\data.xlsx";	
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
     @DataProvider(name = "test2data")
 	public Object[][] getData2() {

  	    String excelPath = "C:\\Users\\ravitkumar\\eclipse-workspace\\SeleniumExitTestAssignmentMaven\\excel\\data.xlsx";	
 		Object data1[][] = testData(excelPath, "Sheet2");
 		return data1;
 	}
     
     @DataProvider(name = "test3data")
  	public Object[][] getData3() {

   	    String excelPath = "C:\\Users\\ravitkumar\\eclipse-workspace\\SeleniumExitTestAssignmentMaven\\excel\\data.xlsx";	
  		Object data1[][] = testData(excelPath, "AddCartSearch");
  		return data1;
  	}
     
     @DataProvider(name = "test4data")
   	public Object[][] getData4() {

    	    String excelPath = "C:\\Users\\ravitkumar\\eclipse-workspace\\SeleniumExitTestAssignmentMaven\\excel\\data.xlsx";	
   		Object data1[][] = testData(excelPath, "Grocery");
   		return data1;
   	}
     
     @DataProvider(name = "test5data")
    	public Object[][] getData5() {

     	    String excelPath = "C:\\Users\\ravitkumar\\eclipse-workspace\\SeleniumExitTestAssignmentMaven\\excel\\data.xlsx";	
    		Object data1[][] = testData(excelPath, "Orders");
    		return data1;
    	}
     
	public static Object[][] testData(String excelPath, String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		String ProjectPath = System.getProperty("user.dir");
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = excel.getCellDataString(i,j);
				System.out.println(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}
}
