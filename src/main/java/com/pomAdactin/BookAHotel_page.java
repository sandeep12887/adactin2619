package com.pomAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel_page {
	public static WebDriver driver;

	@FindBy(xpath="//input[@id='first_name']")
    private WebElement firstname_input;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname_input;
	
	@FindBy(xpath="//textarea[@id='address']")
    private WebElement Address_input;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcardnum_input;
	
	@FindBy(xpath="//select[@id='cc_type']")
    private WebElement Cardtype_dropdown;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expirydatemonth_dropdown;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
    private WebElement expirydateyear_dropdown;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccvnum_input;
	
	@FindBy(xpath="//input[@id='book_now']")
    private WebElement booknow_click;
	
	@FindBy(xpath="//input[@id='price_night_dis']")
    private WebElement pricepernight;
	
	@FindBy(xpath="//input[@id='room_num_dis']")
    private WebElement numofroom;
	
	@FindBy(xpath="//input[@id='total_days_dis']")
    private WebElement noofdays;
	
	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getNumofroom() {
		return numofroom;
	}

	public WebElement getNoofdays() {
		return noofdays;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}
	@FindBy(xpath="//input[@id='total_price_dis']")
    private WebElement totalprice;
	
	
	public WebElement getFirstname_input() {
		return firstname_input;
	}

	public WebElement getLastname_input() {
		return lastname_input;
	}

	public WebElement getAddress_input() {
		return Address_input;
	}

	public WebElement getCreditcardnum_input() {
		return creditcardnum_input;
	}

	public WebElement getCardtype_dropdown() {
		return Cardtype_dropdown;
	}

	public WebElement getExpirydatemonth_dropdown() {
		return expirydatemonth_dropdown;
	}

	public WebElement getExpirydateyear_dropdown() {
		return expirydateyear_dropdown;
	}

	public WebElement getCcvnum_input() {
		return ccvnum_input;
	}

	public WebElement getBooknow_click() {
		return booknow_click;
	}
	public BookAHotel_page (WebDriver driver2) {
		this.driver=(driver2);
		PageFactory.initElements(driver, this);

	
	}


 

}
