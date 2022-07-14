package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GiftsCardsPage {
WebDriver driver;
	
	public GiftsCardsPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="//span[text()='Gift Cards']")
	public WebElement clkgiftcard;
	
	@FindBy(how = How.XPATH, using="(//img[@class='kJjFO0 _3DIhEh'])[3]")
	public WebElement clkknwmore;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_gift_card()
	{
		clkgiftcard.click();
	}
	
	public void click_know_more()
	{
		clkknwmore.click();
	}
}
