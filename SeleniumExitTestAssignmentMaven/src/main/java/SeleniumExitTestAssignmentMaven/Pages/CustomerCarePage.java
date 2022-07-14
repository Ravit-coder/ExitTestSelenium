package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerCarePage {
	WebDriver driver;
	
	public CustomerCarePage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="//div[contains(text(),'More')]")
	public WebElement clkmore;
	
	@FindBy(how = How.XPATH, using="//span[text()='Help Center']")
	public WebElement clkhelp;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_more()
	{
		clkmore.click();
	}
	
	public void click_help_center()
	{
		clkhelp.click();
	}
}
