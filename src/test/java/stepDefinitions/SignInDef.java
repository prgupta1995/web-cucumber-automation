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
import pageObjects.SignIn;
import resources.Base;

@RunWith(Cucumber.class)
public class SignInDef extends Base {

	// SignIn automation

	public Logger log = LogManager.getLogger(Base.class.getName());
	SignIn signin;
	WebDriverWait wait;

	@Given("^Navigate to the web page \"([^\"]*)\"$")
	public void navigate_to_the_web_page_something(String webUrl) throws Throwable {

		// driver initialization
		driver = initializeDriver();

		// webdriver wait
		wait = new WebDriverWait(driver, 3);
		driver.manage().window().maximize();
		driver.get(webUrl);
		log.info("User redirected to the Economist jobs page");

	}

	@When("^Click on the SignIn Home page button$")
	public void click_on_the_signin_home_page_button() throws Throwable {
		signin = new SignIn(driver);
		signin.signInLinkJobsPage().click();
		wait.until(ExpectedConditions.visibilityOf(signin.emailSignIn()));

	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click on the SignIn button$")
	public void enter_something_and_something_and_click_on_the_signin_button(String email, String password)
			throws Throwable {
		signin.emailSignIn().sendKeys(email);
		signin.passwordSignIn().sendKeys(password);
		signin.SignInButton().click();
		log.info("Email and password fields are filled successfully and clicked on signin button");
	}

	@And("^Verify that user logged in successfully$")
	public void verify_that_user_logged_in_successfully() throws Throwable {

		Assert.assertEquals("Sign out", signin.signOutLink().getText());
		log.info("User is successfully signed into the jobs Economist");
	}

	@And("^Quit the browser$")
	public void quit_the_browser() throws Throwable {
		driver.quit();
	}
}
