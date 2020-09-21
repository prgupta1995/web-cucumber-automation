Feature: Home page

@HomePage
Scenario: Verify that Sign in go to the respective page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Sign in link and user redirects to the Sign in page
Then Verify that user is available on the Sign Page
And Quit the opened browser


@HomePage
Scenario: Verify that Create account go to the respective page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Create account link and user redirects to the Create account page
Then Verify that user is available on the Create account
And Quit the opened browser


@HomePage
Scenario: Verify that Home navigation link is functional and redirects to the correct page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Home navigation link and user redirects to the Home page
Then Verify that user is available on the Home page
And Quit the opened browser


@HomePage
Scenario: Verify Find a job navigation link is functional and redirects to the correct page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Find a job navigation link and user redirects to the Find a job page
Then Verify that user is available on the Find a job page
And Quit the opened browser


@HomePage
Scenario: Verify that Job alerts link is functional and redirects to the correct page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Job alerts navigation link and user redirects to the Job alerts page
Then Verify that user is available on the Job alerts page
And Quit the opened browser


@HomePage
Scenario: Verify that Search recruiters link is functional and redirects to the correct page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Search recruiters navigation link and user redirects to the Search recruiters page
Then Verify that user is available on the Search recruiters page
And Quit the opened browser


@HomePage
Scenario: Verify that Jobs blog link is functional and redirects to the correct page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Jobs blog navigation link and user redirects to the Jobs blog page
Then Verify that user is available on the Jobs blog page
And Quit the opened browser





