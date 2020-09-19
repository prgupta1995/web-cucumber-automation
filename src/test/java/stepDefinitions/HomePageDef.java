package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.SignIn;
import resources.Base;

@RunWith(Cucumber.class)
public class HomePageDef extends Base {

	/* - Both 'Sign in' and 'Create account' links go to their respective pages.
	   - Each of the links in the navigation bar is functional and goes to the correct
	page.*/

	HomePage home;
	WebDriverWait wait;
	SignIn sign;
	public Logger log = LogManager.getLogger(Base.class.getName());

	@Given("^Navigate to the \"([^\"]*)\"$")
	public void navigate_to_the_something(String webUrl) throws Throwable {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(webUrl);
		wait = new WebDriverWait(driver, 2);
		home = new HomePage(driver);
		sign = home.signInElements();
	}

	@When("^Click on the Sign in link and user redirects to the Sign in page$")
	public void click_on_the_sign_in_link_and_user_redirects_to_the_sign_in_page() throws Throwable {

		// Accessing the methods of SignIn
		sign.signInLinkJobsPage().click();
		log.info("Cliked on the available Sign in link");
	}

	@Then("^Verify that user is available on the Sign Page$")
	public void verify_that_user_is_available_on_the_sign_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.forgottenPassworwordLink()));
		if (home.forgottenPassworwordLink().isDisplayed()) {
			String forgottenPassworwordText = home.forgottenPassworwordLink().getText();
			Assert.assertEquals("Forgotten password?", forgottenPassworwordText);
			log.info("User redirected to the Sign in page successfully");
		} else {
			log.error("User is not redirected to the Sign in page");
		}
	}

	@When("^Click on the Create account link and user redirects to the Create account page$")
	public void click_on_the_create_account_link_and_user_redirects_to_the_create_account_page() throws Throwable {

		home.createAccount().click();
		log.info("Cliked on the available Create account link");
	}

	@Then("^Verify that user is available on the Create account$")
	public void verify_that_user_is_available_on_the_create_account() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.createAccountTCText()));
		if (home.createAccountTCText().isDisplayed()) {
			String termsConditionsText = home.createAccountTCText().getText();
			System.out.println(home.createAccountTCText().getText());
			Assert.assertEquals("Terms & Conditions", termsConditionsText);
			log.info("User redirected to the Create an account page successfully");
		} else {
			log.error("User is not redirected to the Create an account page");
		}
	}

	@When("^Click on the Home navigation link and user redirects to the Home page$")
	public void click_on_the_home_navigation_link_and_user_redirects_to_the_home_page() throws Throwable {

		home.homeNav().click();
	}

	@Then("^Verify that user is available on the Home page$")
	public void verify_that_user_is_available_on_the_home_page() throws Throwable {

		if (home.homePageHeader().isDisplayed()) {
			String headerText = home.homePageHeader().getText();
			Assert.assertEquals("Find a job on The Economist Jobs Board", headerText);
		} else {
			log.error("User is not redirected to the home page");
		}
	}

	@When("^Click on the Find a job navigation link and user redirects to the Find a job page$")
	public void click_on_the_find_a_job_navigation_link_and_user_redirects_to_the_find_a_job_page() throws Throwable {

		home.findAJobNav().click();
	}

	@Then("^Verify that user is available on the Find a job page$")
	public void verify_that_user_is_available_on_the_find_a_job_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.findAJobRefineText()));
		if (home.findAJobRefineText().isDisplayed()) {
			String jobSubscribeText = home.findAJobRefineText().getText();
			Assert.assertEquals("Refine your search", jobSubscribeText);
		}

		else {
			log.error("User is not redirected to the Find a Job page");
		}
	}

	@When("^Click on the Job alerts navigation link and user redirects to the Job alerts page$")
	public void click_on_the_job_alerts_navigation_link_and_user_redirects_to_the_job_alerts_page() throws Throwable {

		home.jobsAlertNav().click();
	}

	@Then("^Verify that user is available on the Job alerts page$")
	public void verify_that_user_is_available_on_the_job_alerts_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.jobAlertsJobAlertText()));
		Assert.assertTrue("Create job alert text is not displayed.", home.jobAlertsJobAlertText().isDisplayed());
	}

	@When("^Click on the Search recruiters navigation link and user redirects to the Search recruiters page$")
	public void click_on_the_search_recruiters_navigation_link_and_user_redirects_to_the_search_recruiters_page()
			throws Throwable {

		home.searchRecruitersNav().click();
	}

	@Then("^Verify that user is available on the Search recruiters page$")
	public void verify_that_user_is_available_on_the_search_recruiters_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.searchRecruiterText()));
		Assert.assertTrue("Search recruiters is not displayed.", home.searchRecruiterText().isDisplayed());
	}

	@When("^Click on the Jobs blog navigation link and user redirects to the Jobs blog page$")
	public void click_on_the_jobs_blog_navigation_link_and_user_redirects_to_the_jobs_blog_page() throws Throwable {

		home.jobsBlogNav().click();
	}

	@Then("^Verify that user is available on the Jobs blog page$")
	public void verify_that_user_is_available_on_the_jobs_blog_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(home.jobsBlogText()));
		Assert.assertTrue("Jobs blog text is not displayed.", home.jobsBlogText().isDisplayed());
	}

	@And("^Quit the opened browser$")
	public void quit_the_opened_browser() throws Throwable {
		driver.quit();
	}
}
