package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "//input[@id='customer_email']")
	private WebElement mailid;
	
	public LoginPage(WebDriver driver)
	{
//		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement mailid()
	{
		return mailid;
	}
	
	@FindBy(xpath="//a[@title='Necklaces')")
			private WebElement eleNecklace;
	
	public WebElement geteleNecklace()
	{
		return eleNecklace;
	}
}
