Feature: User add productss
validate that user add products

Scenario Outline: user add products
Given the user in the home page and click on sign in link
And the user enter "<email>" ,"<password>"
And navigate to Bakery page
Then user can add two products in the cart


Examples:
| email | password |
| youssefosoltan97@gmail.com | joebata1997 |
