@Important
Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter10

@Smoke
Scenario: Validate the Login scenariol10
Given The user is on OrangeHRM login page10
When User enter user "Admin" Username10
And User enter password "admin123" password10
Then Click on Login button10
Then close browser10


@Smoke @Regression
Scenario: Validate the Logout scenariol10
Given The user is on OrangeHRM login page10
Given The user is on OrangeHRM login page10
When User enter user "Admin" Username10
And User enter password "admin123" password10
Then Click on Login button10
And User click on Welcome option10
And User Click on Logout option10
Then close browser10
