Feature: Validation of login page in adactin web application

  Background: 
    Given User launch the adactin web application
    Then User verify whether login in page is displayed

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
