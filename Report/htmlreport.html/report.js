$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Fb.feature");
formatter.feature({
  "name": "Facebook Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fb"
    }
  ]
});
formatter.step({
  "name": "User is on the Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Challenge.user_is_on_the_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"testuser@gmail.com\" and \"password123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Challenge.user_enters_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Challenge.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Challenge.user_should_be_redirected_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
});