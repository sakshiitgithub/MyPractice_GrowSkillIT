@smoke1
Feature: Validate New Account Functionality for Guru 99 demo application

  Scenario Outline: Validate New Account functionality with correct credentials
    Given user launches the Guru99 demo application
    And user enters the "<user_id>" in the UserId textbox
    And user enters "<password>" in password textbox
    When user will click on the login button
    Then user will be navigated to Guru99 demo application
    And user clicks on new account link
    And user enters the "<cust_id>" in  customer id field
    And user selects the account type from dropdown
    And user enters the "<deposit>" in the Initial deposit field
    When user will click on Submit button
    Then user will be navigated to New Account Page
    Then user closes the entire browser

    Examples:
      | user_id    | password | cust_id | deposit  |
      | mngr653315 | ApytaqE  | 97170   | 12345678 |
