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
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String cn = f.getExcelData("CreateCustomer", 1, 3);
	String cd = f.getExcelData("CreateCustomer", 1, 4);
	HomePage h=new HomePage(driver);
	h.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustomerNameTbx().sendKeys(cn);
	t.getCustomerDescTbx().sendKeys(cd);
	t.getActiveCustDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustomerBtn().click();
	
	String actualCust = t.getActualCustCreatedLoc().getText();
	Assert.assertEquals(actualCust,cn );
	}
	
}
