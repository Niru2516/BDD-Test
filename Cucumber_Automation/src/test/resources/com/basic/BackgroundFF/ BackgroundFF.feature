Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter1


//Background keyword helps us to reduse the size of your featurefile and as well as avoided duplication of steps wich is present in the featurefile
Background: User open OrangeHRM and end enter Username and password1
Given The user is on OrangeHRM login page1

Scenario: Validate the Login scenariol
When User enter the Username1
And User enter the password1
Then Click on Login button1
And User click on Welcome option1
Then User Click on Logout option1
