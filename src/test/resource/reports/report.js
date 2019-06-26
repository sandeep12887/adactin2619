$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoAp.feature");
formatter.feature({
  "line": 1,
  "name": "User should login the Demo Application",
  "description": "",
  "id": "user-should-login-the-demo-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To login the demo app- 102",
  "description": "",
  "id": "user-should-login-the-demo-application;to-login-the-demo-app--102",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@demoapp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the demo application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the username in the email feild",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the password in the password feild",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verify the project name in the logo",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition_Demo.user_launch_the_demo_application()"
});
formatter.result({
  "duration": 10677927874,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition_Demo.user_enter_the_username_in_the_email_feild()"
});
formatter.result({
  "duration": 6131441071,
  "error_message": "java.lang.Exception\r\n\tat com.BaseAdactin.Base_Adactin.inputValuestoWebelement(Base_Adactin.java:109)\r\n\tat com.stepdefinition.Stepdefinition_Demo.user_enter_the_username_in_the_email_feild(Stepdefinition_Demo.java:29)\r\n\tat ✽.When User enter the username in the email feild(DemoAp.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition_Demo.user_enter_the_password_in_the_password_feild()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition_Demo.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition_Demo.user_verify_the_project_name_in_the_logo()"
});
formatter.result({
  "status": "skipped"
});
});