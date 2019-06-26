package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.BaseAdactin.Base_Adactin;
import com.RunnerClass.TestRunner;
import com.helper.PageObjectManager;
import com.helper.PropertyReader;
import com.helper.PropertyReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition_Demo extends Base_Adactin {

	public WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the demo application$")
	public void user_launch_the_demo_application() throws Throwable {
		driver.get(PropertyReaderManager.getInstance().getPr().getulr());
		Thread.sleep(10000);
	}

	@When("^User enter the username in the email feild$")
	public void user_enter_the_username_in_the_email_feild() throws Throwable {
		inputValuestoWebelement(pom.getDa().getEmailFeild(), "Hello@gmai.com");
	}

	@When("^User enter the password in the password feild$")
	public void user_enter_the_password_in_the_password_feild() throws Throwable {
		inputValuestoWebelement(pom.getDa().getPasswordFeild(), "2345yuio");
	}

	@When("^User click on Sign in button$")
	public void user_click_on_Sign_in_button() throws Throwable {
		Thread.sleep(3000);
		clickUsingActions(pom.getDa().getSubmitFeild());
	}

	@Then("^User verify the project name in the logo$")
	public void user_verify_the_project_name_in_the_logo() throws Throwable {
		String text = pom.getDa().getProjectName().getText();
		System.out.println(text);
		Assert.assertEquals("Project", text);
	}

}
