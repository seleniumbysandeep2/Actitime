package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void testCreateProject() {
		Reporter.log("CreateProject",true);	
	}
}
