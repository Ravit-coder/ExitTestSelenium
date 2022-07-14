package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.GroceryPage;
import utils.ExcelDataProvider;

public class GroceryTest extends BaseTest{

	@Test(priority=5,alwaysRun = true,dataProvider = "test4data",dataProviderClass=ExcelDataProvider.class)
	public void grocery(String groceryitem)
	{
		log.info("*********************************************Grocery Funtinality**********************************************");
		GroceryPage ge = new GroceryPage(driver);
		ge.pop_up();
		ge.click_grocery();
		ge.search_product(groceryitem);
		ge.search_button();
		SoftAssert sa = new SoftAssert();     // assertion
 		sa.assertEquals(driver.toString(),"\r\n"
 				+ "Grocery");
 		System.out.println("Test Pass successfully");
	}
}

