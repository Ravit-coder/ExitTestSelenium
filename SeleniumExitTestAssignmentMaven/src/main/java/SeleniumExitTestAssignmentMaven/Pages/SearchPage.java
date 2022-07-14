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
import org.testng.annotations.Test;

public class SearchPage{
     WebDriver driver;
    
	
	public SearchPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.CLASS_NAME, using="_3704LK")
	public WebElement srch;
	
	@FindBy(how = How.XPATH, using="//button[@class='L0Z3Pu']")
	public WebElement clksearch;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void searchproduct(String p)
	{
		srch.sendKeys(p);
	}
	
	public void click_search_button()
	{
		clksearch.click();
	}
	
}
