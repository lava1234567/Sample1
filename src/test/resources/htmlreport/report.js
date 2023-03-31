$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/whats.feature");
formatter.feature({
  "name": "Checking whatsapp features or functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify if we can send message to another end user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user at the whatsapp webApplication",
  "keyword": "Given "
});
formatter.step({
  "name": "user has to scan the QR code and application will be opened",
  "keyword": "When "
});
formatter.step({
  "name": "Select one user \"\u003cuser\u003e\" and send message as \"\u003cmessage\u003e\" only if the user name as \"\u003cExactUser\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Close the application by logging out",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "message",
        "ExactUser"
      ]
    },
    {
      "cells": [
        "Lava",
        "Hi How are you",
        "Lava Jio"
      ]
    },
    {
      "cells": [
        "Ram",
        "Hi ram",
        "Ram Hcl"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify if we can send message to another end user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user at the whatsapp webApplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Whatsapp.the_user_at_the_whatsapp_webApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to scan the QR code and application will be opened",
  "keyword": "When "
});
formatter.match({
  "location": "Whatsapp.user_has_to_scan_the_QR_code_and_application_will_be_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one user \"Lava\" and send message as \"Hi How are you\" only if the user name as \"Lava Jio\"",
  "keyword": "And "
});
formatter.match({
  "location": "Whatsapp.select_one_user_and_send_message_as_only_if_the_user_name_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the application by logging out",
  "keyword": "Then "
});
formatter.match({
  "location": "Whatsapp.close_the_application_by_logging_out()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[contains(@class,\u0027_1M6AF\u0027)])[2]\"}\n  (Session info: chrome\u003d111.0.5563.66)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J5AIGLE\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_361\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.66, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\lavan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49647}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 5125ab06bfb645f07de56805e4c23320\n*** Element info: {Using\u003dxpath, value\u003d(//div[contains(@class,\u0027_1M6AF\u0027)])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdefinition.Whatsapp.close_the_application_by_logging_out(Whatsapp.java:75)\r\n\tat ✽.Close the application by logging out(file:src/test/resources/Features/whats.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "To verify if we can send message to another end user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user at the whatsapp webApplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Whatsapp.the_user_at_the_whatsapp_webApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to scan the QR code and application will be opened",
  "keyword": "When "
});
formatter.match({
  "location": "Whatsapp.user_has_to_scan_the_QR_code_and_application_will_be_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one user \"Ram\" and send message as \"Hi ram\" only if the user name as \"Ram Hcl\"",
  "keyword": "And "
});
formatter.match({
  "location": "Whatsapp.select_one_user_and_send_message_as_only_if_the_user_name_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the application by logging out",
  "keyword": "Then "
});
formatter.match({
  "location": "Whatsapp.close_the_application_by_logging_out()"
});
formatter.result({
  "status": "passed"
});
});