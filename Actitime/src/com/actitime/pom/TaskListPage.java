package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;	
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameTbx;	
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescTbx;	
	
	@FindBy(xpath="//button[@class='x-btn-text']")
   private WebElement activeCustDD;	
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompanyTx;	
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='navigationLinks']/../div[2]")
	private WebElement actualCustCreatedLoc;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescTbx() {
		return customerDescTbx;
	}
	public WebElement getActiveCustDD() {
		return activeCustDD;
	}
	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustCreatedLoc() {
		return actualCustCreatedLoc;
	}
	
}







