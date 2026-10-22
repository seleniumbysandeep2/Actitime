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
	private WebElement customerDescriptionTbx;
	
	@FindBy(xpath="//button[contains(text(),'Select ')]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="(//a[text()='Our Company'])[last()]")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='navigationLinks']/..//div[@class='title ellipsis']")
	private WebElement actualCustomer;
	
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

	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	
}




