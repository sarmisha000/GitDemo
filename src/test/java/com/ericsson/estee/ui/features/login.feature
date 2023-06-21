Feature: Login Feature
@login

Scenario Outline: User Login In
Given user is on Home page
When user clicks sign in link
Then user clicks sign in link for Exiting User
And enters Existing User email <EmailId>
And enters Existing User password <Password>
Then user clicks Sign in button
Then user lands to Myaccount Page
Examples:
|EmailId         |Password     |
|vik16@gmail.com|Sveeru@g12com|
#|vik18@gmail.com|Sveeru@g12com|
#|santoshstallin@gmail.com|Vikram$123|