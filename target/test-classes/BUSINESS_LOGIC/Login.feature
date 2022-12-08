Feature: Login functionality

Background: User successfully cliked on initial Login page
When user provide "webdriver.chrome.driver" and exe location as "F:\\Automation Support\\ChromeDriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancle initial login page

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user navigate on login
When user click on My Profile
When user enter "8010488270" as username
When user enter "Arti" as password
When user click on Login button
Then application shows user profile to user

@RegressionTest
Scenario: Login functionality with valid username and valid password
When user navigate on login
When user click on My Profile
When user enter "8010488270" as username
When user enter "Arti" as password
When user click on Login button
Then application shows user profile to user







