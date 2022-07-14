package SeleniumExitTestAssignmentMaven.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CareersPage {
	  WebDriver driver;
	    public static File file;
		public static Properties prop;
		public static FileInputStream fis;


		static {
			
			try {
				file = new File("./Resources/config.properties");
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
		
		public CareersPage(WebDriver driver)  {
			PageFactory.initElements(driver,this);
			this.driver = driver;
		}
		@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
		public WebElement h;
		
		@FindBy(how = How.XPATH, using="//a[normalize-space()='Careers']")
		public WebElement clkcareer;
		
		@FindBy(how = How.XPATH, using="//a[text()='Jobs']")
		public WebElement clkjobs;
		
		@FindBy(how = How.XPATH, using="//a[text()='Jobs @ India']")
		public WebElement clkjobIndia;
		
		public void hh()
		{
			h.click();
		}
		public void click_career()
		{
			clkcareer.click();
		}
		
		public void click_jobs()
		{
			clkjobs.click();	
		}
		
		public void click_job_india()
		{
			clkjobIndia.click();
		}
}
