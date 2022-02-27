package org.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginModule extends BaseClass{
	
	public LoginModule() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Adactin Launches The Adactin Hotel App! ']")

	private WebElement adactinTxt;

	@FindBy(xpath = "//td[text()='Existing User Login - Build 1']")

	private WebElement adactinUserTitle;

	@FindBy(id = "username")

	private WebElement userName;

	@FindBy(id = "password")

	private WebElement password;

	@FindBy(id = "login")

	private WebElement loginBtn;

	@FindBy(xpath = "//a[text()='Forgot Password?']")

	private WebElement forgotBtn;

	@FindBy(xpath = "//a[text()='New User Register Here']")

	private WebElement newUser;

	@FindBy(xpath = "//td[text()='Important Note:']")

	private WebElement impNote;

	@FindBy(xpath = "//strong[contains(text(),'Build 1')]")

	private WebElement build1;

	@FindBy(xpath = "//strong[text()='Build 2']")

	private WebElement build2;

	@FindBy(xpath = "//td[text()='For any queries/issues please email: ']")

	private WebElement queries;

	public WebElement getAdactinTxt() {
		return adactinTxt;
	}

	public WebElement getAdactinUserTitle() {
		return adactinUserTitle;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getForgotBtn() {
		return forgotBtn;
	}

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getImpNote() {
		return impNote;
	}

	public WebElement getBuild1() {
		return build1;
	}

	public WebElement getBuild2() {
		return build2;
	}

	public WebElement getQueries() {
		return queries;
	}
	
	

}
