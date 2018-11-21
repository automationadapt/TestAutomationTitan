package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import BaseClasses.BaseTest;
import utility.TestUtil;

public class CreateTaskPage extends BaseTest {


	public String fn_CreateTask(String TaskName, String Description, String StartDate, String DueDate, String Priority)
			throws InterruptedException {
		type("TaskNameTB_ID", TaskName);
		click("AssignToSelect_XPATH");
		click("AssignTovalue_XPATH");
		type("DescriptionTB_XPath", Description);
		dateselect("StartDateTB_XPATH", StartDate);
		dateselect("DueDateTB_XPATH", DueDate);
		Select("PrioritySelect_XPATH", Priority);
		click("IntimationatCompletionSelect_XPATH");
		click("ClickSubmitButton_XPATH");
		String actualAlertText = waitForAlertwithText();
		waitforProgressBar();
		return actualAlertText;
	}

	
}
