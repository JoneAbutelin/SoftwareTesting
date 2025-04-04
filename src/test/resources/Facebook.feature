Feature: Validate the account creation of FB application
  @FB
  Scenario: To create new account
    Given To launch the browser and maximise the window
    When To launch URL of FB application
    And To click the create new account button
    And To pass firstname in firstname text box
    | selenium | python | java | php | react |       # 1dim
    And To pass secondname in secondname text box
    | fname | sam |
    | sname | tam |
    | tname | ram |
    And To pass mobile number or email in email text box
    | sel@gamil.com  | 12345     | jo@gmail.com | 743urej | 
    | jiju@gmail.com | 623874iur | example@mail | 98765   |                       # 2 dim without header
    And To create new password using new password text box
    Then To close the chrome browser
  
