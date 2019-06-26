package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
public static WebDriver driver;

   @FindBy(xpath="//p[text()='Welcome to AdactIn Group of Hotels']")
   private WebElement Loginheader_verify;

    @FindBy(xpath="//input[@id='username']")
    private WebElement Username_input;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_input;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement Login_click;
	
	@FindBy(xpath="//input[@id='order_id_text']")
	private WebElement searchorder_input;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement go_click;
	
	public WebElement getSearchorder_input() {
		return searchorder_input;
	}
	public WebElement getGo_click() {
		return go_click;
	}


	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement usernameheader_verify;
	
	@FindBy(xpath="//input[contains(@id,'order_id_301311')]")
	private WebElement copythe_ordernum;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel_click;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement handlecheck_click;
	
	 public WebElement getHandlecheck_click() {
		return handlecheck_click;
	}
	public WebElement getCancel_click() {
		return cancel_click;
	}
	public WebElement getCopythe_ordernum() {
		return copythe_ordernum;
	}
	public WebElement getUsernameheader_verify() {
		return usernameheader_verify;
	}
	public WebElement getLoginheader_verify() {
			return Loginheader_verify;
		}
	public WebElement getUsername_input() {
		return Username_input;
	}
	public WebElement getPassword_input() {
		return password_input;
	}
	public WebElement getLogin_click() {
		return Login_click;
	}
	

public LoginPage (WebDriver driver2) {
	this.driver=(driver2);
	PageFactory.initElements(driver, this);
}}