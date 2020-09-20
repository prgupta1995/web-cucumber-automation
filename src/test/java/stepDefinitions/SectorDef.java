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
import pageObjects.SectorPage;
import resources.Base;

@RunWith(Cucumber.class)
public class SectorDef extends Base {

	public Logger log = LogManager.getLogger(Base.class.getName());
	WebDriverWait wait;
	SectorPage sector;

	@Given("^User navigates to the \"([^\"]*)\"$")
	public void user_navigates_to_the_something(String webUrl) throws Throwable {

		// driver initialization
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(webUrl);

		log.info("User redirected to the Economist jobs page");

		// webdriver wait
		wait = new WebDriverWait(driver, 3);

	}

	@And("^Click on the any sector, User redirects to sector job page$")
	public void click_on_the_any_sector_user_redirects_to_sector_job_page() throws Throwable {

		sector = new SectorPage(driver);
		sector.browserJobSectorLink().click();
	}

	@When("^Click on the job view details$")
	public void click_on_the_job_view_details() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(sector.jobViewDetails()));

		if (sector.jobViewDetails().isDisplayed()) {
			sector.jobViewDetails().click();
			log.info("User has redirected to the job page successfully");
		}

		else {
			log.error("User has not redirected to the job page");
		}

	}

	@Then("^Job details are displayed with Apply button$")
	public void job_details_are_displayed_with_apply_button() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(sector.jobApplyButton()));
		Assert.assertTrue("Apply button is not displayed", sector.jobApplyButton().isDisplayed());
	}

	@And("^Quit the opened web browser$")
	public void quit_the_opened_web_browser() throws Throwable {
		driver.quit();
	}

}
