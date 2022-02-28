package org.POJO;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelModule extends BaseClass{
	
	public SearchHotelModule() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Search Hotel ']")

	private WebElement searchTxt;

	@FindBy(id = "location")

	private List<WebElement> selLocation;

	@FindBy(id = "hotels")

	private List<WebElement> selHotels;

	@FindBy(id = "room_type")

	private List<WebElement> selRoomType;

	@FindBy(id = "room_nos")

	private List<WebElement> selNoRooms;

	@FindBy(id = "datepick_in")

	private WebElement checkInDate;

	@FindBy(id = "datepick_out")

	private WebElement checkOutDate;

	@FindBy(id = "adult_room")

	private List<WebElement> selAdultPerRoom;

	@FindBy(id = "child_room")

	private List<WebElement> selChildPerRoom;

	@FindBy(id = "submit")

	private WebElement btnSubmit;

	@FindBy(id = "Reset")

	private WebElement btnReset;

	public WebElement getSearchTxt() {
		return searchTxt;
	}

	public List<WebElement> getSelLocation() {
		return selLocation;
	}

	public List<WebElement> getSelHotels() {
		return selHotels;
	}

	public List<WebElement> getSelRoomType() {
		return selRoomType;
	}

	public List<WebElement> getSelNoRooms() {
		return selNoRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public List<WebElement> getSelAdultPerRoom() {
		return selAdultPerRoom;
	}

	public List<WebElement> getSelChildPerRoom() {
		return selChildPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

}
