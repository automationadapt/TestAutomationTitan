package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClasses.BaseTest;

public class ProjectDetail extends BaseTest {
	
	public static CreateTaskPage fn_NavProjectTask() throws InterruptedException{
//		new HomePageHeader().fn_NavProjectlist().fn_navProjectDetails();
		waitforProgressBar();
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("TaskTab_XPATH"))))); 
		System.out.println("Before task");
		Actions vikas=new Actions(driver);
		vikas.moveToElement(driver.findElement(By.xpath(OR.getProperty("TaskTab_XPATH")))).click().build().perform();
//		click("TaskTab_XPATH");
		System.out.println("After Task");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("NewTaskButton_XPATH"))))); 
		click("NewTaskButton_XPATH");
//		waitforProgressBar();
		CreateTaskPage objCreateTaskPage= new CreateTaskPage();
		return objCreateTaskPage; 
	}

}
