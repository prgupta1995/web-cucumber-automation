Feature: Footer links


Background: 
Given Navigate to the web url "https://jobs.economist.com/"

@Footer
Scenario: Verify that About us link is functional

Given Click on the About us link and user redirects to the About us page
When Verify that user is available on the About us page
Then Close the opened browser


@Footer
Scenario: Verify that Contact us link is functional

Given Click on the Contact us link and user redirects to the Contact us page
When Verify that user is available on the Contact us page
Then Close the opened browser


@Footer
Scenario: Verify that Terms and Conditions link is functional

Given Click on the Terms and Conditions link and user redirects to the Terms and Conditions page
When Verify that user is available on the Terms and Conditions page
Then Close the opened browser


@Footer
Scenario: Verify that Privacy policy link is functional

Given Click on the Privacy policy link and user redirects to the Privacy policy page
When Verify that user is available on the Privacy policy page
Then Close the opened browser

@Footer
Scenario: Verify that Advertise with us link is functional

Given Click on the Advertise with us link and user redirects to theAdvertise with us page
When Verify that user is available on the Advertise with us
Then Close the opened browser

@Footer
Scenario: Verify that facebook link is functional

Given Click on the facebook and user redirects to the facebook page
When Verify that user is available on the facebook page
Then Close the opened browser

@Footer
Scenario: Verify that twitter link is functional

Given Click on the twitter link and user redirects to the twitter page
When Verify that user is available on the twitter page
Then Close the opened browser

@Footer
Scenario: Verify that linkedin link is functional

Given Click on the linkedin link and user redirects to the linkedin page
When Verify that user is available on the linkedin page
Then Close the opened browser

		
