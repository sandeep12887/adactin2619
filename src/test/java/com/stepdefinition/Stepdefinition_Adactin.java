package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseAdactin.Base_Adactin;
import com.RunnerClass.TestRunner;
import com.helper.PageObjectManager;
import com.helper.PropertyReaderManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition_Adactin extends Base_Adactin {
	public WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User should launch the adactin application$")
	public void user_should_launch_the_adactin_application() throws Throwable {
		String ulr = PropertyReaderManager.getInstance().getPr().getulr();
		geturl(ulr);
		System.out.println("The application url is :" + ulr);

	}

	@Then("^User should Validate the login page$")
	public void user_should_Validate_the_login_page() throws Throwable {

		WebElement loginheader = pom.getLp().getLoginheader_verify();
		try {
			String text = loginheader.getText();
			Assert.assertEquals("Welcome to AdactIn Group of Hotels", text);
			System.out.println("The Login page is verified :" + text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			//hi
		}

	}

	@Then("^User enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
		inputValuestoWebelement(pom.getLp().getUsername_input(),
				PropertyReaderManager.getInstance().getPr().getusername());
		inputValuestoWebelement(pom.getLp().getPassword_input(),
				PropertyReaderManager.getInstance().getPr().getpassword());

	}

	@Then("^User enter the login button$")
	public void user_enter_the_login_button() throws Throwable {
		elementClick(pom.getLp().getLogin_click());

	}

	@Then("^User verify that correct username is displayed on the login page$")
	public void user_verify_that_correct_username_is_displayed_on_the_login_page() throws Throwable {
		String text = pom.getLp().getUsernameheader_verify().getText();
		Assert.assertEquals("Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
		System.out.println("Now verified that user at search page : " + text);

	}

	@Then("^User should location as in test data \"([^\"]*)\"$")
	public void user_should_location_as_in_test_data(String location) throws Throwable {
		selectDDusingValue(pom.getwp().getLocation_dropdown(), location);

	}

	@Then("^User should hotel as in test data \"([^\"]*)\"$")
	public void user_should_hotel_as_in_test_data(String hotels) throws Throwable {
		selectDDusingValue(pom.getwp().getHotels_dropdown(), hotels);

	}

	@Then("^User should room type as in test data \"([^\"]*)\"$")
	public void user_should_room_type_as_in_test_data(String roomtype) throws Throwable {
		selectDDusingValue(pom.getwp().getRome_dropdown(), roomtype);

	}

	@Then("^User should no-of-rooms as in test data \"([^\"]*)\"$")
	public void user_should_no_of_rooms_as_in_test_data(String noofrooms) throws Throwable {
		selectDDusingValue(pom.getwp().getNoOfRoms_dropdown(), noofrooms);

	}

	@Then("^User Enter check-in-date as in test data \"([^\"]*)\"$")
	public void user_Enter_check_in_date_as_in_test_data(String checkindate) throws Throwable {
		elementClear(pom.getwp().getCheckInDate_input());
		inputValuestoWebelement(pom.getwp().getCheckInDate_input(), checkindate);

	}

	@Then("^User Enter check-out-date as in test data \"([^\"]*)\"$")
	public void user_Enter_check_out_date_as_in_test_data(String checkoutdate) throws Throwable {
		elementClear(pom.getwp().getCheckoutDate_input());
		inputValuestoWebelement(pom.getwp().getCheckoutDate_input(), checkoutdate);

	}

	@Then("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		elementClick(pom.getwp().getSearch_click());

	}

	@Then("^User Verify that system gives an error message for check in date$")
	public void user_Verify_that_system_gives_an_error_message_for_check_in_data() throws Throwable {
		try {
			String errorcheckin = pom.getwp().getCheckinerror_msg().getText();
			System.out.println("Check in error message : " + errorcheckin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	@Then("^User Verify that system gives an error message for check out date$")
	public void user_Verify_that_system_gives_an_error_message_for_check_out_data() throws Throwable {
		try {
			String errorcheckout = pom.getwp().getCheckouterror_msg().getText();
			System.out.println("Check out error message : " + errorcheckout);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	@Then("^User Enter check-in-date as in test data - before \"([^\"]*)\"$")
	public void user_Enter_check_in_date_as_in_test_data_before(String checkinbeforedate) throws Throwable {
		elementClear(pom.getwp().getCheckInDate_input());
		inputValuestoWebelement(pom.getwp().getCheckInDate_input(), checkinbeforedate);

	}

	@Then("^User Enter check-out-date as in test data - before \"([^\"]*)\"$")
	public void user_Enter_check_out_date_as_in_test_data_before(String checkoutbeforedate) throws Throwable {
		elementClear(pom.getwp().getCheckoutDate_input());
		inputValuestoWebelement(pom.getwp().getCheckoutDate_input(), checkoutbeforedate);

	}

	@Then("^User should enter the today date \"([^\"]*)\"$")
	public void user_should_enter_the_today_date(String todaydate) throws Throwable {
		elementClear(pom.getwp().getCheckInDate_input());
		inputValuestoWebelement(pom.getwp().getCheckInDate_input(), todaydate);

	}

	@Then("^User should enter the tomorrow date \"([^\"]*)\"$")
	public void user_should_enter_the_tomorrow_date(String today_1) throws Throwable {
		elementClear(pom.getwp().getCheckoutDate_input());
		inputValuestoWebelement(pom.getwp().getCheckoutDate_input(), today_1);
	}

	@Then("^User should enter the no of Adults \"([^\"]*)\" and number of childrens \"([^\"]*)\"$")
	public void user_should_enter_the_no_of_Adults_and_number_of_childrens(String adults, String child)
			throws Throwable {
		selectDDusingValue(pom.getwp().getAdultroom_dropdown(), adults);
		selectDDusingValue(pom.getwp().getChildroom_dropdown(), child);
	}
	/*
	 * @Then("^User should verify that search location shuold be exactly match with next page of select hotel location$"
	 * ) public void
	 * user_should_verify_that_search_location_shuold_be_exactly_match_with_next_page_of_select_hotel_location
	 * () throws Throwable { String compare =
	 * pom.getsh().getLocationname().getText();
	 * System.out.println("The locations are same : " + compare);
	 * Assert.assertEquals("Sydney", compare);
	 * System.out.println("The locations are same : " + compare);
	 * 
	 * }
	 */

	/*
	 * @Then("^verify the selected checkin date is match with nextpage$") public
	 * void verify_the_selected_checkin_date_is_match_with_nextpage() throws
	 * Throwable { String datein = pom.getsh().getDateincompare().getText();
	 * System.out.println("The Check in date is match with nextpage : "+datein);
	 * Assert.assertEquals("01/06/2019", datein);
	 * 
	 * }
	 * 
	 * @Then("^verify the selected checkout date is match with nextpage$") public
	 * void verify_the_selected_checkout_date_is_match_with_nextpage() throws
	 * Throwable { String dateOUT = pom.getsh().getDateoutcompare().getText();
	 * System.out.println("The Check out date is match with nextpage : "+dateOUT);
	 * Assert.assertEquals("02/06/2019", dateOUT);
	 * 
	 * }
	 */

	@Then("^verify that room enters in search page should be match with next page$")
	public void verify_that_room_enters_in_search_page_should_be_match_with_next_page() throws Throwable {
		String text = pom.getsh().getRoomscompare().getText();
		System.out.println("rooms no is :" + text);

	}

	@Then("^verify that roomtype enters in search page should be match with next page$")
	public void verify_that_roomtype_enters_in_search_page_should_be_match_with_next_page() throws Throwable {
		String text = pom.getsh().getRoomtypecompare().getText();
		System.out.println("roomtype no is :" + text);

	}

	@Then("^User should click the radiobuttoin$")
	public void user_should_click_the_radiobuttoin() throws Throwable {
		elementClick(pom.getsh().getRadiobtn_click());

	}

	@Then("^User should click the continue button$")
	public void user_should_click_the_continue_button() throws Throwable {
		elementClick(pom.getsh().getContinue_click());

	}

	@Then("^User should enter the \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_should_enter_the_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		inputValuestoWebelement(pom.getbh().getFirstname_input(), arg1);
		inputValuestoWebelement(pom.getbh().getLastname_input(), arg2);
		inputValuestoWebelement(pom.getbh().getAddress_input(), arg3);
		inputValuestoWebelement(pom.getbh().getCreditcardnum_input(), arg4);
	}

	@Then("^User should enter the card type \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_should_enter_the_card_type(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		selectDDusingValue(pom.getbh().getCardtype_dropdown(), arg1);
		selectDDusingVisibleText(pom.getbh().getExpirydatemonth_dropdown(), arg2);
		selectDDusingValue(pom.getbh().getExpirydateyear_dropdown(), arg3);
		inputValuestoWebelement(pom.getbh().getCcvnum_input(), arg4);
	}

	@Then("^User should click the booknow button$")
	public void user_should_click_the_booknow_button() throws Throwable {
		elementClick(pom.getbh().getBooknow_click());

	}

	@Then("^User should click the logout button$")
	public void user_should_click_the_logout_button() throws Throwable {
		elementClick(pom.getlb().getLogout_click());

	}

	@Then("^User should generate the order number$")
	public void user_should_generate_the_order_number() throws Throwable {
		String text = pom.getlb().getOrdernum().getAttribute("value");
		System.out.println("The order num is : " + text);

	}

	@When("^User should click the Booked Itinerary button$")
	public void user_should_click_the_Booked_Itinerary_button() throws Throwable {
		elementClick(pom.getwp().getBooked_button());

	}

	@Then("^User should enter the order id and click the go button$")
	public void user_should_enter_the_order_id_and_click_the_go_button() throws Throwable {
		// String text = pom.getlb().getOrdernum().getAttribute("value");
		// String attribute = pom.getlb().getEntetheorderid().getAttribute("value");
		// inputValuestoWebelement(pom.getLp().getSearchorder_input(), text);
		// inputValuestoWebelement(pom.getLp().getCopythe_ordernum(),text);
		// inputValuestoWebelement(pom.getLp().getSearchorder_input(), orderid);
		elementClick(pom.getLp().getGo_click());

	}

	@Then("^User should cancel the selected order$")
	public void user_should_cancel_the_selected_order() throws Throwable {
		elementClick(pom.getLp().getCancel_click());

	}

	@Then("^User should handle the popup to cancel or ok then click cancel$")
	public void user_should_handle_the_popup_to_cancel_or_ok() throws Throwable {

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		elementClick(pom.getLp().getHandlecheck_click());
		elementClick(pom.getLp().getCancel_click());
		Alert confirm = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();

		elementClick(pom.getLp().getCancel_click());

	}

	@Then("^User verify that order number is cancelled and now longer exists in Booked Itinerary page$")
	public void user_verify_that_order_number_is_cancelled_and_now_longer_exists_in_Booked_Itinerary_page()
			throws Throwable {

	}

}
