Feature: Facebook Login Functionality

  @Fb
  Scenario: Successful login with valid credentials
    Given User is on the Facebook login page
    When User enters valid "testuser@gmail.com" and "password123"
    And Clicks on the login button
    Then User should be redirected to the homepage
    
    
