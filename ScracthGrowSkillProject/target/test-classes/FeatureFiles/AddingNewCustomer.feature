@smoke1
Feature: Validate New Customer Functionality for Guru 99 demo application

  Scenario Outline: Validate New Customer functionality with correct credentials
    Given user launches the Guru99 demo application
    And user enters the "<user_id>" in the UserId textbox
    And user enters "<password>" in password textbox
    When user will click on the login button
    Then user will be navigated to Guru99 demo application
    And user clicks on new customer link
    And user enters the "<cust_name>" in  customer name field
    And user selects the gender
    And user enters the "<dob>" in the date of birth field
    And user enters the "<address>" in the address field
    And user enters the "<city>" in the city field
    And user enters the "<state>" in the state field
    And user enters the "<pin>" in the pinCode field
    And user enters the "<mob>" in the mobileNumber field
    And user enters the "<email>" in the emailId field
    And user enters "<password>" in password textbox
    #When user will click on the SUBMIT button
    #Then user will be navigated to New Customer Page and fetches the Customer Id
    Then user closes the entire browser

    Examples:
      | user_id    | password | cust_name | dob        | address       | city    | state     | pin    | mob        | email          |
      | mngr653315 | ApytaqE  | sakshi    | 24-11-1999 | Vinayak Nagar | Udaipur | Rajasthan | 313205 | 8114423712 | saks@gmail.com |
