@smoke1

Feature: Valiadte Login functionality for Guru99 Demo application 

Scenario Outline: Valiadte Login functionality with correct credentials 

Given user launches the Guru99 demo application
And user enters the "<user_id>" in the UserId textbox
And user enters "<password>" in password textbox
When user will click on the login button
Then user will be navigated to Guru99 demo application
Then user closes the entire browser


Examples:
| user_id | password |
| mngr653189 | bUtarYd |