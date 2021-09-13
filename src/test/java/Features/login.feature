Feature: Login to Websites

Scenario Outline: Login to ARC application
Given Navigate to url https://arc.emids.com
When I enter <Username> and <Password>
And Click on submit
Then I should be able to login to arc successfully

Examples:
| Username | Password |
| Veerabhadrappat | Emids123 |


Scenario: Recharge my prepaid number using Phonepay
Given I open Phonepay app
When I select number and select the rechange plan
And Click on Recharge
Then My phone number shoud get recharged

Scenario: Upload profile pic in Facebook
Given Already Logged in to Facebook as veeru
When I click on Upload profile picture option
And Select photo from Galary and Click on upload
Then Profile photo should get uploaded


Scenario: Call History - Post/Put - default isOutbound=true when not inbound term code
Given a inbound call history call
And term code is not in (IA,IT,IC,IL,IO,IH,IW,IX,IS)
When POST request is made to call-history endpoint
Then app defaults IsOutbound to true and returns 200 OK status

Scenario: Apply WFH in ARC
Given I already loggen in to ARC application
When I click on my area and Click on Apply leave options
And Select WFH option and select Date range
And Enter comments and click on Submit
Then System should be updated with WFH request

