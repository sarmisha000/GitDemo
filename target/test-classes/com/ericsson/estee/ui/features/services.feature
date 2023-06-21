Feature: Store search
@searchstore
Scenario Outline: User search for the nearest store
Given user is on Home page
When user clicks services link
Then user is in services page
When user click on find a store near you
Then user should be taken to find a store page
When user enter the zip code and city
And click find a store button
Then all the stores with city and zipcode entered should be listed

