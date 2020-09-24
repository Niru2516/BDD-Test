Feature: OrangeHRM login As a OrangeHRM user, I want to enter username and password as a parameter2


Scenario Outline: Validate the Login scenariol2
Given The user is on OrangeHRM login page2
When User enter the user "<User>" Username2
And User enter the password "<password>" password2
And Click on Login button2
Then Close browser2
Examples:
	| User		| password	|
	|	Admin		|	admin123	|
	|	Nirali	|	nirali16	|
	

