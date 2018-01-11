package runner;


import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.runner.RunWith;
import org.testng.ITestResult;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(features = {"featureFiles"},glue = {"stepDefinitions"})
public class TestRunner {

	ExtentReports extent;
	ExtentTest test;

	

	@Test(enabled = true, priority = 0)
	public void Scenario_1() throws Throwable {	
		test=extent.startTest("Navigate_to_the_web_page");
		stepdefination.Defination.navigate_to_the_login();
		stepdefination.Defination.user_successfully_logged_in();
		stepdefination.Defination.user_selected_a_product();
		stepdefination.Defination.logout_from_the_session();
		} 
	

}