package com.definition;

import java.util.List;

import org.POJO.LoginModule;
import org.POJO.SearchHotelModule;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	LoginModule login;
	SearchHotelModule srcHotel;

	@Given("User launch the adactin web application")
	public void user_launch_the_adactin_web_application() {

		getUrl("http://adactinhotelapp.com/");

	}

	@Then("User verify whether login in page is displayed")
	public void user_verify_whether_login_in_page_is_displayed() {

		String adactinHomepageUrl = getCurrenturl();
		boolean contains = adactinHomepageUrl.contains("http://adactinhotelapp.com/");
		System.out.println("Home page is " + contains);
	}

	@When("User eneters the valid {string} and valid password {string}")
	public void user_eneters_the_valid_and_valid_password(String s1, String s2) {

		login = new LoginModule();

		sendkeys(login.getUserName(), s1);
		sendkeys(login.getPassword(), s2);

	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {

		login = new LoginModule();

		click(login.getLoginBtn());

	}

	@Then("User verify whether home page is displayed")
	public void user_verify_whether_home_page_is_displayed() {

		String adacinSearchHotel = getCurrenturl();

		boolean containsSearch = adacinSearchHotel.contains("http://adactinhotelapp.com/SearchHotel.php");

		System.out.println("User navigated to search hotel page " + containsSearch);

	}

	// Scenario 2

	@When("User enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() {

		login = new LoginModule();
		sendkeys(login.getUserName(), "ranjithram");
		sendkeys(login.getPassword(), "OZG41A");

	}

	@And("User clicks the login button in the home page")
	public void user_clicks_the_login_button_in_the_home_page() {
		login = new LoginModule();
		click(login.getLoginBtn());

	}

	@Then("User verfiy whether home page is displayed")
	public void user_verfiy_whether_home_page_is_displayed() {
		System.out.println("User navigated to search hotel page "
				+ getCurrenturl().contains("http://adactinhotelapp.com/SearchHotel.php"));

	}

	// Feature 2 //Scenario 1

	@When("User enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password() {

		login = new LoginModule();
		sendkeys(login.getUserName(), "ranjithram");
		sendkeys(login.getPassword(), "OZG41A");

	}

	@When("User clicks  login button in the home page")
	public void user_clicks_login_button_in_the_home_page() {

		login = new LoginModule();
		click(login.getLoginBtn());

	}

	@Then("User verfiy  home page is displayed")
	public void user_verfiy_home_page_is_displayed() {

		System.out.println("User navigated to search hotel page "
				+ getCurrenturl().contains("http://adactinhotelapp.com/SearchHotel.php"));

	}

	@When("User click the select location dropdown and select the hotel location")
	public void user_click_the_select_location_dropdown_and_select_the_hotel_location() {
		srcHotel = new SearchHotelModule();
		List<WebElement> selLocation = srcHotel.getSelLocation();

		for (int i = 0; i < selLocation.size(); i++) {

			WebElement loc = selLocation.get(i);
			String txtL = loc.getText();
			if (txtL.contains("Sydney")) {
				Select s = new Select(loc);

				s.selectByVisibleText("Sydney");

			} else {

				System.out.println("No value");
			}

		}

	}

	@Then("User verify whether hotel location is selected")
	public void user_verify_whether_hotel_location_is_selected() {
		srcHotel = new SearchHotelModule();
		List<WebElement> selLocation = srcHotel.getSelLocation();
		for (WebElement ele : selLocation) {
			System.out.println("is selected" + ele.getAttribute("value"));
			break;
		}
	}

}
