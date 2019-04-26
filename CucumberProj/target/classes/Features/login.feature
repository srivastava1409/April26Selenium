Feature: Free CRM login Feature
Scenario: Free CRM login scenario

Given User is already on login page
When Title of login page is Free CRM
Then User enters username and password
And User clicks on login button
And User is on home page
