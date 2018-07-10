package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className= "LOGIN | SIGNUP")
	private WebElement LOGINORSIGNUPlink;
	public WebElement getLOGINORSIGNUPlink()
	{
		return LOGINORSIGNUPlink;
	}
	
	@FindBy(linkText= "cart")
	private WebElement cartlink;
	public WebElement getcartlink()
	{
		return cartlink;
	}
	
	@FindBy(className= "iWishView")
	private WebElement iWishViewlink;
	public WebElement getiWishViewlink()
	{
		return iWishViewlink;
	}
	
	@FindBy(className= "snize-input-style")
	private WebElement searchtextbox;
	public WebElement getsearchtextbox()
	{
		return searchtextbox;
	}
	
	@FindBy(xpath= "//img[@alt='Jumkey Fashion Jewellery']")
	private WebElement logolink;
	public WebElement getlogolink()
	{
		return logolink;
	}
	@FindBy(xpath = "//a[@title='Category']")
	private WebElement Categorylink;
	public WebElement Categorylink()
	{
		return Categorylink;
	}

}
