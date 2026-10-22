package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String expectedCustomerText = f.getExcelData("CreateCustomer", 1,3);
	String customerDescription = f.getExcelData("CreateCustomer", 1,4);
	
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustomerNameTbx().sendKeys(expectedCustomerText);
	t.getCustomerDescriptionTbx().sendKeys(customerDescription);
	t.getSelectCustomerDD().click();	
	t.getOurCompanyOption().click();
	t.getCreateCustomerBtn().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), expectedCustomerText));
	String actualCustomerText = t.getActualCustomer().getText();
	Assert.assertEquals(actualCustomerText,expectedCustomerText);
	Reporter.log(actualCustomerText+"is created successfully",true);
	}	
}





