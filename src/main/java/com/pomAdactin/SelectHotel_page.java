package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_page {
	public static WebDriver driver;

	@FindBy(xpath="//input[@id='radiobutton_0']")
    private WebElement Radiobtn_click;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continue_click;
	
	@FindBy(xpath="//input[@id='hotel_name_0']")
	private WebElement hotelname;
	
	@FindBy(xpath="//input[@id='location_0']")
	private WebElement locationname;
	
	@FindBy(xpath="//input[@id='location_1']")
	private WebElement comparelocate;
	
	@FindBy(xpath="(//input[@value='01/06/2019'])[1]")
	private WebElement dateincompare;
	
	@FindBy(xpath="((//input[@value='02/06/2019'])[1]")
	private WebElement dateoutcompare;
	
	@FindBy(xpath="//input[@value='1 Rooms']")
	private WebElement roomscompare;
	
	@FindBy(xpath="(//input[@value='Standard'])[1]")
	private WebElement roomtypecompare;
	
	public WebElement getRoomtypecompare() {
		return roomtypecompare;
	}

	public WebElement getRoomscompare() {
		return roomscompare;
	}

	public WebElement getDateincompare() {
		return dateincompare;
	}

	public WebElement getDateoutcompare() {
		return dateoutcompare;
	}

	public WebElement getComparelocate() {
		return comparelocate;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getLocationname() {
		return locationname;
	}
	
	public WebElement getRadiobtn_click() {
		return Radiobtn_click;
	}

	public WebElement getContinue_click() {
		return Continue_click;
	}
	
	public SelectHotel_page (WebDriver driver2) {
		this.driver=(driver2);
		PageFactory.initElements(driver, this);
	}

}
