Feature: User Can Register to Jumia
validate that User can register successfully to Jumia Website

Scenario Outline: User Registration
Given the user in the home page and click on sign in link to register
When the user enter "<mobilenumber>" ,"<password>","<confirmpassword>","<firstname>","<lastname>","<email>","<date>","<otp>"
Then user registered successfully


Examples:
| mobilenumber | password | confirmpassword | firstname | lastname | email | date | otp |
| 01004816999 | joebata2222 | joebata2222 | usef | osama | usefrere454@gmail.com | 16041997 | 1234 |



