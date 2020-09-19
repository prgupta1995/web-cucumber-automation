Feature: Search for a job 

@SeachJobResults
Scenario:
Verify that searching for a job correctly displays relevant search results
	Given User navigates to the web page "https://jobs.economist.com/"
	When Click on Find a Job Nav and now click on the search tab
	And Enter keyword into the "Director" field select Banking and Finance checkbox as Sector
	Then Click on the Search button, Search results displayed and check the available job search results on the page
	And Close the browser
		
		
