Feature: To validate Login application

Scenario: To test login application with valid condition

Given I should be in login page
When I enter username as "Admin"
And I enter password as "admin123"
And I click on submit button
Then I should see username as "Welcome Nishanth05"