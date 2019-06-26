  package com.RunnerClass;



import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseAdactin.Base_Adactin;
import com.cucumber.listener.Reporter;
import com.helper.PropertyReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\org\\features",
glue       = "com.stepdefinition",
dryRun     = false,
strict     = true,
monochrome = true,
tags       = "@demoapp",
plugin     = {"pretty",
		     "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\reports\\reports.html",
		     "html:src\\test\\resource\\reports",
             "json:src\\test\\resource\\reports\\report.json",
	        "junit:src\\test\\resource\\reports\\report.xml"})

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverinial() throws Exception {
String browserName = PropertyReaderManager.getInstance().getPr().getbrowserName();
System.out.println("The browser name is :" + browserName);
driver=Base_Adactin.getBrowser(browserName);


	}
	
	@AfterClass
	public static void driverquit() {
	Reporter.loadXMLConfig(new File("src\\test\\resource\\com\\adatinProperties\\extent-config.xml"));
		//driver.quit();
	}

}
