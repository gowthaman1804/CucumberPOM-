$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Nandhu/Addcustomer/src/test/resources/Features/Addcustomer.feature");
formatter.feature({
  "name": "To test add customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddcustPage.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the customer details",
  "keyword": "When "
});
formatter.match({
  "location": "AddcustPage.the_user_fill_in_the_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddcustPage.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddcustPage.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the customer ID",
  "keyword": "And "
});
formatter.match({
  "location": "AddcustPage.the_user_should_see_the_customer_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/Nandhu/Addcustomer/src/test/resources/Features/Addtariffpaln.feature");
formatter.feature({
  "name": "To test add tariff plan",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To add details in tariif plan",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in add tariif plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlan.the_user_is_in_add_tariif_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the details in tariff plan",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlan.the_user_fill_the_details_in_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success msg",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlan.the_user_should_see_the_success_msg()"
});
formatter.result({
  "status": "passed"
});
});