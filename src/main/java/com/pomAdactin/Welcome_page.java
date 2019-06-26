package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_page {
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
    private WebElement Location_dropdown;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels_dropdown;
	 
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement Rome_dropdown;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noOfRoms_dropdown;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement CheckInDate_input;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement CheckoutDate_input;
		
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement Adultroom_dropdown;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childroom_dropdown;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search_click;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	private WebElement checkinerror_msg;
	
	@FindBy(xpath="//span[@id='checkout_span']")
	private WebElement checkouterror_msg;
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement Booked_button;
	
	public WebElement getBooked_button() {
		return Booked_button;
	}

	public WebElement getCheckinerror_msg() {
		return checkinerror_msg;
	}

	public WebElement getCheckouterror_msg() {
		return checkouterror_msg;
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clicklinkbookeditiner_click;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement checkbox_click;
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelselected_click;
	
	//here handle one popupopppppp
	

	public WebElement getCheckbox_click() {
		return checkbox_click;
	}

	public WebElement getCancelselected_click() {
		return cancelselected_click;
	}
	
	
	public WebElement getClicklinkbookeditiner_click() {
		return clicklinkbookeditiner_click;
	}

	public WebElement getSearchorderid_input() {
		return searchorderid_input;
	}
	
	public WebElement getGo_click() {
		return go_click;
	}
	@FindBy(xpath="//input[@id='order_id_text']")
	private WebElement searchorderid_input;
	
	@FindBy(xpath="//input[@id='search_hotel_id']")
	private WebElement go_click;
	
	
	public WebElement getLocation_dropdown() {
		return Location_dropdown;
	}

	public WebElement getHotels_dropdown() {
		return Hotels_dropdown;
	}

	public WebElement getRome_dropdown() {
		return Rome_dropdown;
	}

	public WebElement getNoOfRoms_dropdown() {
		return noOfRoms_dropdown;
	}

	public WebElement getCheckInDate_input() {
		return CheckInDate_input;
	}

	public WebElement getCheckoutDate_input() {
		return CheckoutDate_input;
	}

	public WebElement getAdultroom_dropdown() {
		return Adultroom_dropdown;
	}

	public WebElement getChildroom_dropdown() {
		return childroom_dropdown;
	}

	public WebElement getSearch_click() {
		return search_click;
	}
	public Welcome_page (WebDriver driver2) {
		this.driver=(driver2);
		PageFactory.initElements(driver, this);

	} 
}
