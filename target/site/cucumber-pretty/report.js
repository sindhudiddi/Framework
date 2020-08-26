$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "User tries to login",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5677694600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct user name and password",
  "description": "",
  "id": "loginfeature;login-with-correct-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigated to login page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User entered the creds",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "admin2@gmail.com",
        "12345678"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicked on ok button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdef.User_navigated_to_login_page_of_the_application()"
});
formatter.result({
  "duration": 13711984100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.userEnteredTheCreds(DataTable)"
});
formatter.result({
  "duration": 488744600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.userClickedOnOkButton()"
});
formatter.result({
  "duration": 89369000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.userShouldBeAbleToSeeTheUserformPage()"
});
formatter.result({
  "duration": 122405600,
  "status": "passed"
});
formatter.after({
  "duration": 102400,
  "status": "passed"
});
});