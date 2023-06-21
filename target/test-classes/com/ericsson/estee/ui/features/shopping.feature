Feature: Shopping Feature
@shopping
Scenario Outline: User purchases an item
Given user is on Home page
Then user clicks shop now button
Then user selects an item
Then user clicks add to bag
Then user clicks shopping kart icon
Then user clicks continue checkout
Then user enters shipping details