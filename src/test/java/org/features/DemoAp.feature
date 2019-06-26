Feature: User should login the Demo Application

@demoapp
Scenario: To login the demo app- 102
Given User launch the demo application
When User enter the username in the email feild
And User enter the password in the password feild
And User click on Sign in button
Then User verify the project name in the logo