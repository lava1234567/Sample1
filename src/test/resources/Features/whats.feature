Feature: Checking whatsapp features or functionalities

Scenario Outline: To verify if we can send message to another end user

Given The user at the whatsapp webApplication
When user has to scan the QR code and application will be opened
And Select one user "<user>" and send message as "<message>" only if the user name as "<ExactUser>"
Then Close the application by logging out

Examples: 

|user|message|ExactUser|
|Lava|Hi How are you|Lava Jio|
|Ram|Hi ram|Ram Hcl|