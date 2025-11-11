Feature: Login

Scenario: Successful Login With Valid Credentials
Given User is on login page
When User enter Email as "admin@yourstore.com" Password as "admin"
When User Click on Login Button
Then Page text should be "Dashboard"
When User click on Logout Button
Then Page message should be "Welcome, please sign in!"
