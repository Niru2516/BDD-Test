
Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter5


Scenario: Validate the Login scenariol5
Given The user is on OrangeHRM login page5
When User enter user "Admin" Username5
And User enter password "admin123" password5
Then Click on Login button5



Scenario: Validate the Logout scenariol5
Given The user is on OrangeHRM login page5
When User enter user "Admin" Username5
And User enter password "admin123" password5
Then Click on Login button5
And User click on Welcome option5
And User Click on Logout option5
