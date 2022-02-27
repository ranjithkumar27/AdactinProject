package com.definition;

import org.POJO.LoginModule;
import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	LoginModule login;

	@Given("User launch the adactin web application")
	public void user_launch_the_adactin_web_application() {

		getUrl("http://adactinhotelapp.com/");

	}

	@Then("User verify whether login in page is displayed")
	public void user_verify_whether_login_in_page_is_displayed() {

		String adactinHomepageUrl = getCurrenturl();
		boolean contains = adactinHomepageUrl.contains("http://adactinhotelapp.com/");
		System.out.println("Home page is "+contains);
	}

	@When("User eneters the valid {string} and valid password {string}")
	public void user_eneters_the_valid_and_valid_password(String s1, String s2) {
		
		login = new LoginModule();
		
		sendkeys(login.getUserName(),s1);
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
		
		System.out.println("User navigated to search hotel page "+containsSearch);


	}

}
