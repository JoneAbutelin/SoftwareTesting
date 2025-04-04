Feature: Gmail Login
  @GmailLogin
  Scenario Outline: Login with multiple credentials
    Given User is on the Gmail login page
    When User enters "<username>" and "<password>"
    And Clicks on the Next button
    Then User should see the inbox or an error message

    Examples:
      | username             | password    |
      | testuser1@gmail.com  | pass123     |
      | testuser2@gmail.com  | test@456    |
      | invaliduser@gmail.com | wrongpass   |
