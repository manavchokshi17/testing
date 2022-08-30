package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Selenium_Workspace\\FreeCRMBDDFrameWork\\src\\test\\resources\\Features\\login.feature",
	glue={"StepDefination"},
	dryRun = false )
	public class TestRunner {	
	
		
		
}
