package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.Footer;
import resources.Base;

@RunWith(Cucumber.class)
public class FooterDef extends Base {

	WebDriverWait wait;
	Footer footer;

	@Given("^Navigate to the web url \"([^\"]*)\"$")
	public void navigate_to_the_web_url_something(String webUrl) throws Throwable {

		// driver initialization
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(webUrl);
		
		// webdriver wait
		wait = new WebDriverWait(driver, 5);
		
		footer = new Footer(driver);
	}

	@Given("^Click on the About us link and user redirects to the About us page$")
	public void click_on_the_about_us_link_and_user_redirects_to_the_about_us_page() throws Throwable {
		footer.aboutUsLink().click();

	}

	@When("^Verify that user is available on the About us page$")
	public void verify_that_user_is_available_on_the_about_us_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.aboutUsHeaderTitle()));
		Assert.assertEquals("About Us", footer.aboutUsHeaderTitle().getText());
	}

	@Given("^Click on the Contact us link and user redirects to the Contact us page$")
	public void click_on_the_contact_us_link_and_user_redirects_to_the_contact_us_page() throws Throwable {

		footer.contactUsLink().click();
	}

	@When("^Verify that user is available on the Contact us page$")
	public void verify_that_user_is_available_on_the_contact_us_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.contactUsHeaderTitle()));
		Assert.assertEquals("Contact Us", footer.contactUsHeaderTitle().getText());

	}

	@Given("^Click on the Terms and Conditions link and user redirects to the Terms and Conditions page$")
	public void click_on_the_terms_and_conditions_link_and_user_redirects_to_the_terms_and_conditions_page()
			throws Throwable {

		footer.termsAndConditionsLink().click();
	}

	@When("^Verify that user is available on the Terms and Conditions page$")
	public void verify_that_user_is_available_on_the_terms_and_conditions_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.termsAndConditionsHeaderTitle()));
		Assert.assertEquals("Terms & Conditions", footer.termsAndConditionsHeaderTitle().getText());

	}

	@Given("^Click on the Privacy policy link and user redirects to the Privacy policy page$")
	public void click_on_the_privacy_policy_link_and_user_redirects_to_the_privacy_policy_page() throws Throwable {

		footer.coprivacyPolicyLink().click();

	}

	@When("^Verify that user is available on the Privacy policy page$")
	public void verify_that_user_is_available_on_the_privacy_policy_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.coprivacyPolicyHeaderTitle()));
		Assert.assertEquals("Privacy Policy", footer.coprivacyPolicyHeaderTitle().getText());
	}

	@Given("^Click on the Advertise with us link and user redirects to theAdvertise with us page$")
	public void click_on_the_advertise_with_us_link_and_user_redirects_to_theadvertise_with_us_page() throws Throwable {

		footer.advertiseWithUsLink().click();
	}

	@When("^Verify that user is available on the Advertise with us$")
	public void verify_that_user_is_available_on_the_advertise_with_us() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.advertiseText()));
		Assert.assertEquals("We'll help you to attract the very best talent", footer.advertiseText().getText());

	}

	@Given("^Click on the facebook and user redirects to the facebook page$")
	public void click_on_the_facebook_and_user_redirects_to_the_facebook_page() throws Throwable {

		footer.facebookCareerLink().click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();	
		String parentWindow = it.next();
		String childWindow= it.next();	
		
		//switching to the childwindow
		driver.switchTo().window(childWindow);
	}

	@When("^Verify that user is available on the facebook page$")
	public void verify_that_user_is_available_on_the_facebook_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.facebookCareerText()));
		String facebookText = footer.facebookCareerText().getText();
		System.out.println(facebookText);
		if (facebookText.contains("Facebook")) {
			Assert.assertTrue("User is not on the facebook page", footer.facebookCareerText().isDisplayed());
		}
	}

	@Given("^Click on the twitter link and user redirects to the twitter page$")
	public void click_on_the_twitter_link_and_user_redirects_to_the_twitter_page() throws Throwable {

		footer.twitterCareerLink().click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();	
		String parentWindow = it.next();
		String childWindow= it.next();
		
		//switching to the childwindow
		driver.switchTo().window(childWindow);
	}

	@When("^Verify that user is available on the twitter page$")
	public void verify_that_user_is_available_on_the_twitter_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.twitterCareerExplore()));
		Assert.assertTrue("User is not on the twitter page", footer.twitterCareerExplore().isDisplayed());
	}

	@Given("^Click on the linkedin link and user redirects to the linkedin page$")
	public void click_on_the_linkedin_link_and_user_redirects_to_the_linkedin_page() throws Throwable {

		footer.linkedinCareerLink().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();	
		String parentWindow = it.next();
		String childWindow= it.next();
		
		//switching to the childwindow
		driver.switchTo().window(childWindow);

	}

	@When("^Verify that user is available on the linkedin page$")
	public void verify_that_user_is_available_on_the_linkedin_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(footer.linkedinCareerFollowButton()));
		Assert.assertTrue("User is not on the twitter page", footer.linkedinCareerFollowButton().isDisplayed());
	}

	@Then("^Close the opened browser$")
	public void close_the_opened_browser() throws Throwable {
		driver.quit();
	}

}
