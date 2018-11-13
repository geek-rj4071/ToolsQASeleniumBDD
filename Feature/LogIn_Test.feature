Feature: Login Action

Scenario: Successful login with valid credentials
	Given User is at home page
	When user enter username
	And password
	Then Message displayed "WELCOME :)"

Scenario: Successful logout
	When user logout from application
	Then message displayed "Successfully logout"
	And user will close the window
	
