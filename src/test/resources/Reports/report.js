$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/loginModule.feature");
formatter.feature({
  "name": "Validation of login page in adactin web application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the adactin web application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify whether login in page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_whether_login_in_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03_Validation of SearchHotel page by selecting location the dropdown",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User enters the valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks  login button in the home page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_login_button_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verfiy  home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verfiy_home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the select location dropdown and select the hotel location",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_the_select_location_dropdown_and_select_the_hotel_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify whether hotel location is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_whether_hotel_location_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});