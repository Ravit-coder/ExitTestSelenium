package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SocialMediaPage {
	WebDriver driver;
	
	public SocialMediaPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="//a[text()='Facebook']")
	public WebElement clkfacebook;
	
	@FindBy(how = How.XPATH, using="//a[text()='YouTube']")
	public WebElement clkyoutube;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_facebook()
	{
		clkfacebook.click();
	}
	
	public void click_youtube()
	{
		clkyoutube.click();
	}
}
