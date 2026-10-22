package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement unTbx;  //declaration
	
	@FindBy(name="pwd")
	private WebElement pwTbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);    //initialization
	}
	public void setLogin(String un,String pw) {
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);				//utilization
		lgBtn.click();
	}
	
}





