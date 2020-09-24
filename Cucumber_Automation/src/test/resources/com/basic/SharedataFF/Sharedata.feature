Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter9

#Scenario: Validate the Login scenariol
#Given The user is on OrangeHRM login page
#When User enter user "Admin" Username
#And User enter password "admin123" password
#Then Click on Login button

Scenario: Validate the Logout scenariol9
Given The user is on OrangeHRM login page9
When User enter user "Admin" Username9
And User enter password "admin123" password9
Then Click on Login button9
And User click on Welcome option9
And User Click on Logout option9


