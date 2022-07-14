package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.CareersPage;

public class CareersTest extends BaseTest {

	@Test
	public void cheak_job_vacancy() throws InterruptedException 
	{
	log.info("***************************************************Careers Funtionality******************************************");	
	CareersPage cr = new CareersPage(driver);
	cr.hh();
	cr.click_career();
	cr.click_jobs();
	cr.click_job_india();  
	Thread.sleep(5000);
	
	    SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Job Openings"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
