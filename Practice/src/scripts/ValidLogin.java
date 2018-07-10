package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.LoginPage;

public class ValidLogin 
{
	WebDriver driver = null;
	
	@Test
	public void testvalidLogin()
	{
		LoginPage l = new LoginPage(driver);
		l.geteleNecklace();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	}

	
		

}


