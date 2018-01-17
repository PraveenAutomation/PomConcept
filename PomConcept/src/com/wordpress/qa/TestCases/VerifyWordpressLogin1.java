/**
 * 
 */
package com.wordpress.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.qa.Pages.LoginPage;

/**
 * @author Dell
 *
 */
public class VerifyWordpressLogin1 {
	
	
	@Test
	public void verifyValidLogin()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loginWordpress("admin", "demo123");
		
		/*loginPage.typeUserName("admin");
		loginPage.typePassword("demo123");
		loginPage.clickLogonButton();
		*/
		//driver.quit();
		
	}
	
	

}
