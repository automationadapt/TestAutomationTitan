package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;

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

	public static ProjectDetail fn_navProjectDetails(){
		new HomePageHeader().fn_NavProjectlist(); 
		click("LinkProjectName_XPATH");
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
