Feature: Quick Post
Scenario: Incorrect Email Format
Given User enters "ldskd123.com" as input in Email Address in quick post.
And User enters "9312821165" as input in Mobile Number in quick post.
And User enters "Ankur" as input in Name in quick post.
And User enters "Delhi" as input in Source in quick post.
And User enters "Noida" as input in Destination in quick post.
And User enters "Only males" as input in Additional Information in quick post.
When User click on submit 
Then A error msg "Please enter a valid email address." pop up should be displayed.
And home page should not be displayed.

Scenario: Mandatory data not filled
Given User enters "ldskd123@gmail.com" as input in Email Address in quick post.
And User enters "9312821165" as input in Mobile Number in quick post.
And User enters "Delhi" as input in Source in quick post.
And User enters "Noida" as input in Destination in quick post.
And User enters "Only males" as input in Additional Information in quick post.
When User click on submit 
Then A error msg "Name is required." pop up should be displayed.
And home page should not be displayed.


Scenario: Successful Publish
Given User enters "ldskd123@gmail.com" as input in Email Address in quick post.
And User enters "9312821165" as input in Mobile Number in quick post.
And User enters "Ankur" as input in Name in quick post.
And User enters "Delhi" as input in Source in quick post.
And User enters "Noida" as input in Destination in quick post.
And User enters "Only males" as input in Additional Information in quick post.
When User click on submit 
Then A  msg "Ride published successfully." should be displayed.
And "www.google.com" page should be displayed.
