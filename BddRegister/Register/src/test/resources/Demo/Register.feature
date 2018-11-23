
Feature: create Registration validation page
Create a registration page with valid age group
Scenario: Successful Registration
Given Student Name and age
When Age greater than 18 
And Age less than 35
Then  Registration done successfully and store it in db