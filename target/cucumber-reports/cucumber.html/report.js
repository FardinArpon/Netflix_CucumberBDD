$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "name": "Login to Netflix website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify users can login to portal with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User visits website",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User can logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "xyzabc@abc.net",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify users can login to portal with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User visits website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_visits_e_commerce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"xyzabc@abc.net\" and \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_enters_valid_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_can_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
});