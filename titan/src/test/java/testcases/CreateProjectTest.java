package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClasses.BaseTest;
import pageclasses.CreateProjectPage;
import pageclasses.HomePageHeader;
import utility.TestUtil;

public class CreateProjectTest extends BaseTest
{

	@BeforeClass
	public static void fn_TechAdminLogin() throws InterruptedException
	{
		login("techadmin");
	}

	@Test(dataProvider = "getData", priority = 1)
	public void fn_CreateProjectTest(String ProjectCode, String ProjectName,
			String Departind, String OfficeInd, String Startdate,
			String Enddate, String AStartdate, String ProjectScope, String Type,
			String Industry, String Manager, String StackHolder, String Sponser,
			String Client, String AlertMessage, String DuplicateMSG,String DateValidation) throws InterruptedException
	{
		String msg= new HomePageHeader().fn_NavProjectlist().fn_NavCreateProject().
				fn_CreateProject(ProjectCode,
				ProjectName, Departind, OfficeInd, Startdate, Enddate,
				AStartdate, ProjectScope, Type, Industry, Manager, StackHolder,
				Sponser, Client, AlertMessage, DuplicateMSG, DateValidation);
		System.out.println(msg);
		Assert.assertEquals(msg, AlertMessage);
	}
	
//	@Test(dataProvider = "getData", priority = 2)
//	public void fn_DuplicateProjectIDTest(String ProjectCode, String ProjectName,
//			String Departind, String OfficeInd, String Startdate,
//			String Enddate, String AStartdate, String ProjectScope, String Type,
//			String Industry, String Manager, String StackHolder, String Sponser,
//			String Client, String AlertMessage, String DuplicateMSG,String DateValidation) throws InterruptedException
//	{
//		String actualMsg=new HomePageHeader().fn_NavCreateProject().fn_DuplicateIDValidation(ProjectCode,
//				ProjectName, Departind, OfficeInd, Startdate, Enddate,
//				AStartdate, ProjectScope, Type, Industry, Manager, StackHolder,
//				Sponser, Client, AlertMessage, DuplicateMSG, DateValidation);
//		Assert.assertEquals(actualMsg, DuplicateMSG, "Validation for DuplicateID passed" );
//	}	
//	
//	@Test(dataProvider = "getData", priority = 3,enabled= true )
//	public void fn_DuplicateProjectNameTest(String ProjectCode, String ProjectName,
//			String Departind, String OfficeInd, String Startdate,
//			String Enddate, String AStartdate, String ProjectScope, String Type,
//			String Industry, String Manager, String StackHolder, String Sponser,
//			String Client, String AlertMessage, String DuplicateMSG,String DateValidation) throws InterruptedException
//	{
//		String actualMsg= new HomePageHeader().fn_NavCreateProject().fn_DuplicateNameValidation(ProjectCode,
//				ProjectName, Departind, OfficeInd, Startdate, Enddate,
//				AStartdate, ProjectScope, Type, Industry, Manager, StackHolder,
//				Sponser, Client, AlertMessage, DuplicateMSG, DateValidation);
//		Assert.assertEquals(actualMsg, DuplicateMSG, "Validation for DuplicateID passed");
//	}	
//	
	@DataProvider
	public Object[][] getData()
	{
		return TestUtil.getData("NewProject");
	}

}
