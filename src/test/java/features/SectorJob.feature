Feature: Browse Job By sector 

@SectorJob
Scenario: Verify that by clicking on sector, user redirects to the same sector job page and by clicking on job link, details and apply button is displayed
	Given User navigates to the "https://jobs.economist.com/"
	And Click on the any sector, User redirects to sector job page
	When Click on the job view details
	Then Job details are displayed with Apply button
	And Quit the opened web browser
	
