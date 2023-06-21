Feature: Signup Feature
@Regression
Scenario Outline: User Signs up
Given user is on Home page
When user clicks sign in link
Then user enters first name
And user enters email
And user enters password
And user clicks terms and conditions check box
Then user clicks create account button
