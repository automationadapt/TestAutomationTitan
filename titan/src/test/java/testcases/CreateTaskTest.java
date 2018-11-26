package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClasses.BaseTest;
import pageclasses.CreateTaskPage;
import pageclasses.HomePageHeader;
import pageclasses.ProjectDetail;
import utility.TestUtil;

public class CreateTaskTest extends CreateTaskPage {
	@BeforeClass
	public static void fn_TechAdminLogin() throws InterruptedException {
		login("techadmin");
	}

	@Test(dataProvider = "getDataOne", priority = 1)
	public void fn_CreateTaskTest(String TaskName, String Description, String StartDate,String DueDate, String Priority, String Msg) throws InterruptedException
	{
		
		new HomePageHeader().fn_NavProjectlist().fn_navProjectDetails().fn_NavProjectTask().fn_CreateTask(TaskName, Description, StartDate, DueDate, Priority); 
	
	}
	
	
	@DataProvider
	public Object[][] getDataOne()
	{
		return TestUtil.getData("NewTask");
	}
	

}
