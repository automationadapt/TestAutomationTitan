package pageclasses;

import BaseClasses.BaseTest;

public class ProjectDetail extends BaseTest {
	
	public static CreateTaskPage fn_NavProjectTask(){
		new HomePageHeader().fn_NavProjectlist().fn_navProjectDetails();
		waitforProgressBar();
		click("LinkTabTask_XPATH");
		click("LinkNewTaskButton_XPATH");
		waitforProgressBar();
		CreateTaskPage objCreateTaskPage= new CreateTaskPage();
		return objCreateTaskPage; 
	}

}
