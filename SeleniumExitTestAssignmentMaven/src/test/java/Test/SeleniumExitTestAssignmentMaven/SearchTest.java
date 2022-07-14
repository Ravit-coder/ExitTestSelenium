package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumExitTestAssignmentMaven.Pages.SearchPage;
import utils.ExcelDataProvider;


public class SearchTest extends BaseTest {

	@Test(priority=10,alwaysRun = true,dataProvider = "test2data",dataProviderClass=ExcelDataProvider.class)
	public void validSearch(String Search) throws InterruptedException
	{
		log.info("********************************************Search Funtionality*******************************************");
		SearchPage sh = new SearchPage(driver);
		// sh.search();
		sh.pop_up();
		sh.searchproduct(Search);
		sh.click_search_button();
		Thread.sleep(5000);
	}
}
