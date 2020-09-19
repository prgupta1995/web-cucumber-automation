package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.SearchJobPage;
import resources.Base;

@RunWith(Cucumber.class)
public class SearchJobDef extends Base {

	public Logger log = LogManager.getLogger(Base.class.getName());
	WebDriverWait wait;
	SearchJobPage searchJob;

	@Given("^User navigates to the web page \"([^\"]*)\"$")
	public void user_navigates_to_the_web_page_something(String webUrl) throws Throwable {

		// driver initialization
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(webUrl);

		log.info("User redirected to the Economist jobs page");

		// webdriver wait
		wait = new WebDriverWait(driver, 3);
	}

	@When("^Click on Find a Job Nav and now click on the search tab$")
	public void click_on_find_a_job_nav_and_now_click_on_the_search_tab() throws Throwable {

		searchJob = new SearchJobPage(driver);

		searchJob.findAJobNav().click();

		wait.until(ExpectedConditions.visibilityOf(searchJob.searchJobsTab()));
		searchJob.searchJobsTab().click();

	}

	@And("^Enter keyword into the \"([^\"]*)\" field select Banking and Finance checkbox as Sector$")
	public void enter_keyword_into_the_something_field_select_banking_and_finance_checkbox_as_sector(String keywords)
			throws Throwable {

		try {
			wait.until(ExpectedConditions.visibilityOf(searchJob.searchJobKeywordField()));
			searchJob.searchJobKeywordField().sendKeys(keywords);

			searchJob.searchJobSectorIcon().click();

			wait.until(ExpectedConditions.visibilityOf(searchJob.searchJobSectorCheckbox()));
			searchJob.searchJobSectorCheckbox().click();

			if(searchJob.searchJobSectorCheckbox().isSelected()) {

				log.info("Checkbox is selected successfully");
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@Then("^Click on the Search button, Search results displayed and check the available job search results on the page$")
	public void click_on_the_search_button_search_results_displayed_and_check_the_available_job_search_results_on_the_page()
			throws Throwable {
		
		wait.until(ExpectedConditions.visibilityOf(searchJob.jobSearchButton()));
		searchJob.jobSearchButton().click();
		wait.until(ExpectedConditions.visibilityOf(searchJob.foundJobsText()));
		String foundJobText = searchJob.foundJobsText().getText();
		if(foundJobText.contains("Director")) {
			log.info("-----Found jobs result-----" + foundJobText);
			Assert.assertTrue("Apply button is not displayed", searchJob.foundJobsText().isDisplayed());
		} else {
			log.error("No Job results found");
		}
	}

	@And("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
