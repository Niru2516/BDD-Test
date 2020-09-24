
Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter4


Scenario: Validate the Login scenariol4
Given The user is on OrangeHRM login page4
When User enter user "Admin" Username4
And User enter password "admin123" password4
Then Click on Login button4



Scenario: Validate the Logout scenariol4
Given The user is on OrangeHRM login page4
When User enter user "Admin" Username4
And User enter password "admin123" password4
Then Click on Login button4
And User click on Welcome option4
And User Click on Logout option4
