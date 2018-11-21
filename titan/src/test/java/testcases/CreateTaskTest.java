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

	@Test(dataProvider = "getData", priority = 1)
	public void fn_CreateTaskTest(String TaskName, String Description, String StartDate,String DueDate, String Priority, String Msg) throws InterruptedException
	{
		String Actual=new ProjectDetail().fn_NavProjectTask().fn_CreateTask(TaskName, Description, StartDate, DueDate, Priority);
		System.out.println(Msg);
	
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		return TestUtil.getData("NewTask");
	}
	

}
