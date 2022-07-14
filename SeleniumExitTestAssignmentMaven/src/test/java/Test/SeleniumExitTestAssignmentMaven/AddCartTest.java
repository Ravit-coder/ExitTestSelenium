package Test.SeleniumExitTestAssignmentMaven;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.AddCartPage;
import utils.ExcelDataProvider;

public class AddCartTest extends BaseTest {

	@Test(priority=1,alwaysRun = true,dataProvider = "test3data",dataProviderClass=ExcelDataProvider.class)
	public void Add_Product(String Search) throws InterruptedException {
	log.info("********************************************Add card funtionality*************************************************");	
	AddCartPage ad = new AddCartPage(driver);
	WebDriverWait wait = new WebDriverWait(driver,10);  // wait for driver
	ad.hh();
    ad.search(Search);
    ad.clk_search();
    ad.click_product();
    Thread.sleep(5000);
    ad.waitForNewWindowAndSwitchToIt(driver);      // wait for switch new window
    ad.click_addcart_btn();   
    Thread.sleep(5000);
    
    
    SoftAssert sa = new SoftAssert();       // assertion
	sa.assertEquals(driver.getTitle(),"Shopping Cart | Flipkart.com"); 
 	System.out.println("Test Pass successfully");
	sa.assertAll();
	}
}
