$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/RegistrationTest.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Test",
  "description": "As a user I want to register into nopcommerce website",
  "id": "registration-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 43441641600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user navigate to registration page successfully",
  "description": "",
  "id": "registration-test;verify-user-navigate-to-registration-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on nopcommerce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Register page successfully \"\u003cverifyMessage\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTestStepdefs.iAmOnNopcommerceHomepage()"
});
formatter.result({
  "duration": 2460416600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 8903509800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cverifyMessage\u003e",
      "offset": 49
    }
  ],
  "location": "RegistrationTestStepdefs.iShouldNavigateToRegisterPageSuccessfully(String)"
});
formatter.result({
  "duration": 1308160200,
  "status": "passed"
});
formatter.after({
  "duration": 1660583800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify error message with first name empty for registration",
  "description": "",
  "id": "registration-test;verify-error-message-with-first-name-empty-for-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select female radio button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I leave first name box empty \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter email in email field \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter password in password field \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter confirm password \"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message First Name is required \"\u003cerrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "registration-test;verify-error-message-with-first-name-empty-for-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "errorMessage"
      ],
      "line": 23,
      "id": "registration-test;verify-error-message-with-first-name-empty-for-registration;;1"
    },
    {
      "cells": [
        "",
        "sahi",
        "sahi@gmail.com",
        "sahi2000",
        "First name is required."
      ],
      "line": 24,
      "id": "registration-test;verify-error-message-with-first-name-empty-for-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 22005130400,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify error message with first name empty for registration",
  "description": "",
  "id": "registration-test;verify-error-message-with-first-name-empty-for-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select female radio button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I leave first name box empty \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter last name \"sahi\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter email in email field \"sahi@gmail.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter password in password field \"sahi2000\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter confirm password \"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message First Name is required \"First name is required.\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 107600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 3797915900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iSelectFemaleRadioButton()"
});
formatter.result({
  "duration": 704901700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "RegistrationTestStepdefs.iLeaveFirstNameBoxEmpty(String)"
});
formatter.result({
  "duration": 448429000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi",
      "offset": 19
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 855828700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi@gmail.com",
      "offset": 30
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterEmailInEmailField(String)"
});
formatter.result({
  "duration": 282527600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi2000",
      "offset": 36
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterPasswordInPasswordField(String)"
});
formatter.result({
  "duration": 229722400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cconfirmpassword\u003e",
      "offset": 26
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 171442300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 377633700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First name is required.",
      "offset": 55
    }
  ],
  "location": "RegistrationTestStepdefs.iShouldSeeTheErrorMessageFirstNameIsRequired(String)"
});
formatter.result({
  "duration": 124624600,
  "status": "passed"
});
formatter.after({
  "duration": 1467687900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Verify user registered successfully",
  "description": "",
  "id": "registration-test;verify-user-registered-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Regression2"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I select female radio button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter first name \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter confirm password \"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should Register successfully \"\u003cregistermessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "registration-test;verify-user-registered-successfully;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "confirmpassword"
      ],
      "line": 39,
      "id": "registration-test;verify-user-registered-successfully;;1"
    },
    {
      "cells": [
        "suhana",
        "sahi",
        "sahi@gmail.com",
        "sahi2000",
        "sahi2000"
      ],
      "line": 40,
      "id": "registration-test;verify-user-registered-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19340126200,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify user registered successfully",
  "description": "",
  "id": "registration-test;verify-user-registered-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Regression2"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I select female radio button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter first name \"suhana\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter last name \"sahi\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"sahi@gmail.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter password \"sahi2000\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter confirm password \"sahi2000\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should Register successfully \"\u003cregistermessage\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 52100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 4048829000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iSelectFemaleRadioButton()"
});
formatter.result({
  "duration": 189674500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suhana",
      "offset": 20
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 723000700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi",
      "offset": 19
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 166353100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginTestStepdefs.iEnterEmail(String)"
});
formatter.result({
  "duration": 1578923600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi2000",
      "offset": 18
    }
  ],
  "location": "LoginTestStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 261532500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sahi2000",
      "offset": 26
    }
  ],
  "location": "RegistrationTestStepdefs.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 173962200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTestStepdefs.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 13943709200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cregistermessage\u003e",
      "offset": 32
    }
  ],
  "location": "RegistrationTestStepdefs.iShouldRegisterSuccessfully(String)"
});
formatter.result({
  "duration": 138575100,
  "status": "passed"
});
formatter.after({
  "duration": 1168793900,
  "status": "passed"
});
});