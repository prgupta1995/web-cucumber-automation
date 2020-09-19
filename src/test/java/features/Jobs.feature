Feature: Components rendering on Jobs Page 

@JobsPage
Scenario: 
	Verify that Jobs page renders correctly with the following components visible- navigation bar, search fields, sector lists, jobs blog, featured jobs and footer
	Given User navigates to web url link "https://jobs.economist.com/" 
	When Navigation bar, Search fields, sector lists, jobs blog, featured jobs and footer sections are displayed and renders correctly on Jobs page 
	And Close the opened web browser 
	
	
