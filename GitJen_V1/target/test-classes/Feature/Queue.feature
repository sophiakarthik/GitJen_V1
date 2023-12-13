Feature: Queue Page Feature

Background:
Given user already logged to home page by signin
|username||password|
|SirishaSA||Success4you!|

Scenario: Queue Page
  Given user is on home page
  When user clicks on the Get Started button under Queue Data Structure
  Then it should go to Queue structure home page 
  
  When User clicks on Implementation of Queue in Python link
  Then User Should be redirected to correct Queue page
  When User clicks on Try Here button
  Then User should be redirected to next page
  When User enters the text in the TextBox "print(Hello)"
  And Clicks on the Run button
  Then Result is displayed on the console
  Then Go back to previous page

  Given User Should be redirected to correct Queue page
  When User clicks on Implementation using collections.deque link
  Then User Should be redirected to correct Queue page
  When User clicks on Try Here button
  Then User should be redirected to next page
  When User enters the text in the TextBox "print(Hello)"
  And Clicks on the Run button
  Then Result is displayed on the console  
  Then Go back to previous page
  
  Given User Should be redirected to correct Queue page
  When User clicks on Queue Operations link
  Then User Should be redirected to correct Queue page
  When User clicks on Try Here button
  Then User should be redirected to next page
  When User enters the text in the TextBox "print(Hello)"
  And Clicks on the Run button
  Then Result is displayed on the console  
  Then Go back to previous page
  
  Given User Should be redirected to correct Queue page
  When User clicks on Practice Questions link
  Then User Should be redirected to correct Queue page
  
  
  
  
