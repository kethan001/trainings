package stepdefination;


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.poi.ss.formula.ptg.MultiplyPtg;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;

public class Defination {
	
	@Given("^navigate to the login page$")
	public static void navigate_to_the_login () throws Throwable {
		System.out.println("navigate to the login ");
	
	}
	@When("^user successfully logged in$")
	public static void user_successfully_logged_in() throws Throwable{
		System.out.println("user successfully logged in");
		}
	@And("^user selected a product$")
	public static void user_selected_a_product() throws Throwable {
		System.out.println("user selected a product");
	}
	@Then("^logout from the session$")
	public static void logout_from_the_session() throws Throwable {
		System.out.println("logout from the session");
	}
}
