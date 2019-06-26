package com.helper;

import org.openqa.selenium.WebDriver;

import com.pomAdactin.BookAHotel_page;
import com.pomAdactin.DemoApp;
import com.pomAdactin.LoginPage;
import com.pomAdactin.Logout_bookingconfirm_page;
import com.pomAdactin.SelectHotel_page;
import com.pomAdactin.Welcome_page;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver = (driver2);
	}

	public LoginPage lp;

	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public Welcome_page wp;

	public Welcome_page getwp() {
		if (wp == null) {
			wp = new Welcome_page(driver);
		}
		return wp;
	}

	public SelectHotel_page sh;

	public SelectHotel_page getsh() {
		if (sh == null) {
			sh = new SelectHotel_page(driver);
		}
		return sh;
	}

	public BookAHotel_page bh;

	public BookAHotel_page getbh() {
		if (bh == null) {
			bh = new BookAHotel_page(driver);
		}
		return bh;
	}

	public Logout_bookingconfirm_page lb;

	public Logout_bookingconfirm_page getlb() {
		if (lb == null) {
			lb = new Logout_bookingconfirm_page(driver);
		}
		return lb;
	}

	public DemoApp da;

	public DemoApp getDa() {
		if (da == null) {
			da = new DemoApp(driver);
		}
		return da;

	}

}