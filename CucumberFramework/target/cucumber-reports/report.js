$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End Tests",
  "description": "Description: The purpose of this feature is to test End 2 End integration",
  "id": "automated-end2end-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 15,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 16,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5037449500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"Lakshay\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 3427207100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 12
    }
  ],
  "location": "HomePageSteps.search_for(String)"
});
formatter.result({
  "duration": 4776045400,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 3961107500,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 7703978600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 7
    }
  ],
  "location": "CheckoutPageSteps.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 11181018800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.select_same_delivery_address()"
});
formatter.result({
  "duration": 2260573500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 26
    }
  ],
  "location": "CheckoutPageSteps.select_payment_method_as_payment(String)"
});
formatter.result({
  "duration": 96685000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.place_the_order()"
});
formatter.result({
  "duration": 15540604600,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPageSteps.verify_the_order_details()"
});
formatter.result({
  "duration": 70757900,
  "status": "passed"
});
formatter.after({
  "duration": 870057700,
  "status": "passed"
});
});