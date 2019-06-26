package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoApp {

	public WebDriver driver;

	public DemoApp(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement projectName;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emailFeild;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordFeild;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitFeild;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPasswordFeild() {
		return passwordFeild;
	}

	public WebElement getSubmitFeild() {
		return submitFeild;
	}
	


}
