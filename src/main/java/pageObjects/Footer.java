package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {

	public WebDriver driver;

    // Element Selector
	@FindBy(css = "a[href='/about-us/']")
	private WebElement aboutUs;

	@FindBy(css = "a[href='/contact-us/']")
	private WebElement contactUs;

	@FindBy(css = "a[href='/terms-and-conditions/']")
	private WebElement termsAndConditions;

	@FindBy(css = "a[href='/privacy-policy/']")
	private WebElement privacyPolicy;

	@FindBy(css = ".tertiary-nav__item:nth-child(5)")
	private WebElement advertiseWithUs;

	@FindBy(css = "a[href='https://www.facebook.com/economistcareersnetwork']")
	private WebElement facebookCareer;

	@FindBy(css = "a[href='https://twitter.com/careersnetwork']")
	private WebElement twitterCareer;

	@FindBy(css = "a[href='http://www.linkedin.com/company/the-economist-careers-network']")
	private WebElement linkedinCareer;

	@FindBy(css = "h1")
	private WebElement aboutUsTitle;

	@FindBy(css = "h1")
	private WebElement contactUsTitle;

	@FindBy(css = "h1")
	private WebElement termsAndConditionsTitle;

	@FindBy(css = "h1")
	private WebElement privacyPolicyTitle;

	@FindBy(css = "h1.hero-text")
	private WebElement advertiseUsText;

	@FindBy(css = "div._3oba")
	private WebElement facebookCareerPageText;

	@FindBy(css = "a[href='/explore']")
	private WebElement twitterExplore;

	@FindBy(css = ".top-card-layout__cta.top-card-layout__cta--primary")
	private WebElement linkedinCareerFollow;

	public Footer(WebDriver driver) {
		this.driver = driver;

		// Receives the driver instance of the given class and returns a Page Object
		// with fully initialized fields
		PageFactory.initElements(driver, this);

	}
	
	
	// Accessible methods for Element selectors
	public WebElement aboutUsLink() {
		return aboutUs;
	}

	public WebElement contactUsLink() {
		return contactUs;
	}

	public WebElement termsAndConditionsLink() {
		return termsAndConditions;
	}

	public WebElement coprivacyPolicyLink() {
		return privacyPolicy;
	}

	public WebElement advertiseWithUsLink() {
		return advertiseWithUs;
	}

	public WebElement facebookCareerLink() {
		return facebookCareer;
	}

	public WebElement twitterCareerLink() {
		return twitterCareer;
	}

	public WebElement linkedinCareerLink() {
		return linkedinCareer;
	}

	public WebElement aboutUsHeaderTitle() {
		return aboutUsTitle;
	}

	public WebElement contactUsHeaderTitle() {
		return contactUsTitle;
	}

	public WebElement termsAndConditionsHeaderTitle() {
		return termsAndConditionsTitle;
	}

	public WebElement coprivacyPolicyHeaderTitle() {
		return privacyPolicyTitle;
	}

	public WebElement advertiseText() {
		return advertiseUsText;
	}

	public WebElement facebookCareerText() {
		return facebookCareerPageText;
	}

	public WebElement twitterCareerExplore() {
		return twitterExplore;
	}

	public WebElement linkedinCareerFollowButton() {
		return linkedinCareerFollow;
	}

}
