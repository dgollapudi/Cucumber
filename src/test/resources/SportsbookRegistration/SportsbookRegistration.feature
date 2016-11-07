@COM
Feature: Customer registration on .com sportsbook

 @desktop
 Scenario: Customer registartion on desktop sportsbook
   Given registration link is available on sportsbook desktop page
   And username and password
   Then I clicked on registartion link
   And entered all required field and clicked on create account button
   And registration is successful
   And user is logged in
