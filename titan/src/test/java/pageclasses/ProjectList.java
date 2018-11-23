package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClasses.BaseTest;

public class ProjectList extends BaseTest {

//	public static ProjectDetail fn_NavProjectTask() {
//		click("LinkProjectName_XPATH");
//		waitforProgressBar();
//		ProjectDetail objProjectDetail=new ProjectDetail();
//		return objProjectDetail;  
////		click("LinkTabTask_XPATH");
////		click("LinkNewTaskButton_XPATH");
////		waitforProgressBar();
////		CreateTaskPage objCreateTask = new CreateTaskPage();
////		return objCreateTask;
//	}

	public static ProjectDetail fn_navProjectDetails() throws InterruptedException{
//		new HomePageHeader().fn_NavProjectlist();
//		waitforProgressBar();
		System.out.println("click before");
//		Thread.sleep(7000);
//		Actions objAct= new Actions(driver);
//		objAct.moveToElement(driver.findElement(By.xpath(OR.getProperty("LinkProjectName_XPATH")))); 
//		objAct.click(driver.findElement(By.xpath(OR.getProperty("LinkProjectName_XPATH")))).build().perform();
		
		String value = driver.findElement(By.xpath("//table[@id='myFirstTable']//tbody/tr[1]/td[2]/a")).getText(); 
//		click("LinkProjectName_XPATH");
		System.out.println(value);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@id='myFirstTable']//tbody/tr[1]/td[2]/a"))));
		driver.findElement(By.linkText(value)).click();
		
		
		System.out.println("click after");
		ProjectDetail objProjectDetail=new ProjectDetail();
		return objProjectDetail;
	}
	
	
	public CreateProjectPage fn_NavCreateProject() {		
		driver.findElement(By.xpath("//button[@id='CreateProject']")).click();
		waitforProgressBar();
		CreateProjectPage createProjectObj = new CreateProjectPage();
		return createProjectObj;
	}
}
