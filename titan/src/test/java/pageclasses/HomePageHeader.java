package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClasses.BaseTest;

public class HomePageHeader extends BaseTest {

//	public static CreateProjectPage fn_NavCreateProject() {
//
//		wait.until(
//				ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("MenuDirectory_XPATH")))));
//		click("MenuDirectory_XPATH");
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("LinkProject_XPATH")))));
//		Actions actObj = new Actions(driver);
//		actObj.click(driver.findElement(By.xpath(OR.getProperty("LinkProject_XPATH")))).build().perform();
//		waitforProgressBar();
//		CreateProjectPage createProjectObj = new CreateProjectPage();
//		return createProjectObj;
//	}

	public static ProjectList fn_NavProjectlist(){
		
		wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("MenuDirectory_XPATH")))));
		click("MenuDirectory_XPATH");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(OR.getProperty("LinkProject_XPATH")))));
		Actions actObj = new Actions(driver);
		actObj.click(driver.findElement(By.xpath(OR.getProperty("LinkProject_XPATH")))).build().perform();
		ProjectList ObjProjectList = new ProjectList();
		return ObjProjectList;
		
	}
	 

	
	
}
