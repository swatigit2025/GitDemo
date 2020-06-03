Feature: Gmail Login

Scenario: Valid login

Given : User is on gmail login page
When : User enters username as "def" and password as "456"
And : User clicks on login button
Then : User navigates to gmail home page
And : User can see inbox 

Scenario: Invalid login

Given : User is on gmail login page
When : User enters username as "aaa" and password as "123"
And : User clicks on login button
Then : User navigates to gmail home page
And : User can see inbox 