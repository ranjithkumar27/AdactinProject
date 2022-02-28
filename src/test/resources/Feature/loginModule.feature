Feature: Validation of login page in adactin web application

  Background: 
    Given User launch the adactin web application
    Then User verify whether login in page is displayed

  @san
  Scenario Outline: TC01_Validation of login page with multiple valid test data
    When User eneters the valid "<userNameAdactin>" and valid password "<userPasswordAdactin>"
    And User clicks the login button
    Then User verify whether home page is displayed

    Examples: 
      | userNameAdactin | userPasswordAdactin |
      | ranjithram      | OZG41A              |
      | ranjithram      | OZG41A              |
      | ranjithram      | OZG41A              |
      | ranjithram      | OZG41A              |
      | ranjithram      | OZG41A              |
	@san
  Scenario: TC02_Validation of login page with valid inputs
    When User enter the valid username and valid password
    And User clicks the login button in the home page
    Then User verfiy whether home page is displayed

  @reg
  Scenario: TC03_Validation of SearchHotel page by selecting location the dropdown
    When User enters the valid username and valid password
    And User clicks  login button in the home page
    Then User verfiy  home page is displayed
    When User click the select location dropdown and select the hotel location
    Then User verify whether hotel location is selected
