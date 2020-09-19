package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.JobsPage;
import resources.Base;

@RunWith(Cucumber.class)
public class JobsSectionRenderDef extends Base {

	public Logger log = LogManager.getLogger(Base.class.getName());
	WebDriverWait wait;
	JobsPage job;

	@Given("^User navigates to web url link \"([^\"]*)\"$")
	public void user_navigates_to_web_url_link_something(String webUrl) throws Throwable {

		// driver initialization
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(webUrl);

		log.info("User redirected to the Economist jobs page");

		// webdriver wait
		wait = new WebDriverWait(driver, 5);

	}

	@When("^Navigation bar, Search fields, sector lists, jobs blog, featured jobs and footer sections are displayed and renders correctly on Jobs page$")
	public void navigation_bar_search_fields_sector_lists_jobs_blog_featured_jobs_and_footer_sections_are_displayed_and_renders_correctly_on_jobs_page()
			throws Throwable {

		try {
		job = new JobsPage(driver);
		wait.until(ExpectedConditions.visibilityOf(job.jobsNavBar()));
		
		Assert.assertTrue("Navigation bar is not rendered correctly on the Jobs Page",job.jobsNavBar().isDisplayed());
		
		Assert.assertTrue("Search fields are not rendered correctly on the Jobs Page",job.jobssearchFields().isDisplayed());
		
		Assert.assertTrue("Section jobs field is not rendered correctly on the Jobs Page",job.jobsBrowseBySectorr().isDisplayed());
		
		Assert.assertTrue("Jobs blog section is not rendered correctly on the Jobs Page",job.jobsblogSection().isDisplayed());
		
		Assert.assertTrue("Featured jobs section is not rendered correctly on the Jobs Page",job.jobsfeatureSection().isDisplayed());
		
		Assert.assertTrue("Footer section is not rendered correctly on the Jobs Page",job.jobsfooterSection().isDisplayed());
		
		log.info("Sections are rendered properly on the jobs page.");
		}
		catch(Exception e) {
			log.error(e.getMessage()+ "Sections are not rendered properly on the job page");
		}
	}
	

	@Then("^Close the opened web browser$")
	public void close_the_opened_web_browser() throws Throwable {

		driver.quit();
	}
}
