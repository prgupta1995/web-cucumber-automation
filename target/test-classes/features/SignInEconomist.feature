Feature: Sign in into the Economist jobs page

@SignIn
Scenario: Verify that user signs in successfully

Given Navigate to the web page "https://jobs.economist.com/"
When Click on the SignIn Home page button
Then Enter "priyankatest@yopmail.com" and "Password@123" and click on the SignIn button
And Verify that user logged in successfully
And Quit the browser
