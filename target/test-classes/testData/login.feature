Feature: Login faeature

Scenario: Valid login

Given OrangeHRM logo is displayed
When I enter "admin" and "admin123"
And I click on login button
Then I successfully logged in