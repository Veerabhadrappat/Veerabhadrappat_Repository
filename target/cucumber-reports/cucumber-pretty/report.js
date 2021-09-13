$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Myntra.feature");
formatter.feature({
  "line": 1,
  "name": "Myntra application workflow",
  "description": "",
  "id": "myntra-application-workflow",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Buy product from myntra",
  "description": "",
  "id": "myntra-application-workflow;buy-product-from-myntra",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the test URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Hover on Home and Living in the top section and select Home Centre under Brands",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "In the next page select Wall Art under Categories and In the list available select the first item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Display the title of the product in the print statement",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Websites",
  "description": "",
  "id": "login-to-websites",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to ARC application",
  "description": "",
  "id": "login-to-websites;login-to-arc-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Navigate to url https://arc.emids.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login to arc successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-to-websites;login-to-arc-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "login-to-websites;login-to-arc-application;;1"
    },
    {
      "cells": [
        "Veerabhadrappat",
        "Emids123"
      ],
      "line": 11,
      "id": "login-to-websites;login-to-arc-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login to ARC application",
  "description": "",
  "id": "login-to-websites;login-to-arc-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Navigate to url https://arc.emids.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter Veerabhadrappat and Emids123",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login to arc successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Recharge my prepaid number using Phonepay",
  "description": "",
  "id": "login-to-websites;recharge-my-prepaid-number-using-phonepay",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I open Phonepay app",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I select number and select the rechange plan",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Recharge",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "My phone number shoud get recharged",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Upload profile pic in Facebook",
  "description": "",
  "id": "login-to-websites;upload-profile-pic-in-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Already Logged in to Facebook as veeru",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on Upload profile picture option",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select photo from Galary and Click on upload",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Profile photo should get uploaded",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 27,
  "name": "Call History - Post/Put - default isOutbound\u003dtrue when not inbound term code",
  "description": "",
  "id": "login-to-websites;call-history---post/put---default-isoutbound\u003dtrue-when-not-inbound-term-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "a inbound call history call",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "term code is not in (IA,IT,IC,IL,IO,IH,IW,IX,IS)",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "POST request is made to call-history endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "app defaults IsOutbound to true and returns 200 OK status",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 33,
  "name": "Apply WFH in ARC",
  "description": "",
  "id": "login-to-websites;apply-wfh-in-arc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "I already loggen in to ARC application",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I click on my area and Click on Apply leave options",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Select WFH option and select Date range",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Enter comments and click on Submit",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "System should be updated with WFH request",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});