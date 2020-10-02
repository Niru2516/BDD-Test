Feature: Automationpractice login As a Automationpractice user, I want to create account as user

Scenario Outline: Validate the account creation
Given  Launch Chrome and open Automation Website
When Create account under signin with email "<User>"and password "<password>"
And Select WOMEN product and add two qty 
Then Checkout process 
Then click on order details


Examples:
	| User							| password	|
	|	jnry234@gmail.com	|	nikb@123  |
	
	
																																									