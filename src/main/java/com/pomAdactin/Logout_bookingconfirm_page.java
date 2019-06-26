package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_bookingconfirm_page {

	public static WebDriver driver;

	@FindBy(xpath="//input[@id='logout']")
    private WebElement Logout_click;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
    private WebElement my_itinerary_click;
	
	@FindBy(xpath="//input[@id='order_no']")
    private WebElement ordernum;
	
	@FindBy(xpath="//input[@id='order_id_301535']")
    private WebElement entetheorderid;
	
	
	
	

	
	public WebElement getEntetheorderid() {
		return entetheorderid;
	}


	public WebElement getOrdernum() {
		return ordernum;
	}


	public WebElement getLogout_click() {
		return Logout_click;
	}


	public WebElement getMy_itinerary_click() {
		return my_itinerary_click;
	}


	public Logout_bookingconfirm_page (WebDriver driver2) {
		this.driver=(driver2);
		PageFactory.initElements(driver, this);
	
}
}