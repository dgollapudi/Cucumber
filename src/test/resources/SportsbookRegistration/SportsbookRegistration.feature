@COM
Feature: Customer registration on .com sportsbook

 @desktop
 Scenario: Customer registartion on desktop sportsbook
   Given registration link is available on sportsbook desktop page
   Then I clicked on registartion link
   And entered all required fields and clicked on create account button
   And registration is successful
