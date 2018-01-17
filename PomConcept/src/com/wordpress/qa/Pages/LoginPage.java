package com.wordpress.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class will store all locators and method of login Page

public class LoginPage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password = By.xpath("//input[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginWordpress(String userid,String pwd)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pwd);
		
		driver.findElement(loginButton).click();
	}
	
	
/*	public void typeUserName(String url)
	{
		driver.findElement(username).sendKeys(url);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogonButton()
	{
		driver.findElement(loginButton).click();
	}*/

}
