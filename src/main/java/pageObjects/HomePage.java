package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	// Element Seclectors
	@FindBy(css = "a[href*='/register/']")
	private WebElement createAccountLink;

	@FindBy(css = "a[href*='/remindme/']")
	private WebElement forgottenPassworword;

	@FindBy(css = "a[href*='/terms-and-conditions/']")
	private WebElement createAccountTC;

	@FindBy(css = "a.primary-nav__link[href='/']")
	private WebElement homeLink;

	@FindBy(css = "a.primary-nav__link[href='/jobs/']")
	private WebElement findAJobLink;

	@FindBy(css = "a.primary-nav__link[href='/newalert/']")
	private WebElement jobsAlertLink;

	@FindBy(css = "a.primary-nav__link[href='/employers/']")
	private WebElement searchRecruitersLink;

	@FindBy(css = "a.primary-nav__link[href='/careers/']")
	private WebElement jobsBlogLink;

	@FindBy(css = "h1.header")
	private WebElement homeHeader;

	@FindBy(css = "h3.margin-bottom-5")
	private WebElement findAJobRefineSearch;

	@FindBy(css = "h1")
	private WebElement jobAlertsCreateJobAlert;

	@FindBy(css = "h1")
	private WebElement searchRecruiter;

	@FindBy(css = "h1")
	private WebElement jobsBlog;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		// Receives the driver instance of the given class and returns a Page Object with fully initialized fields
		PageFactory.initElements(driver, this);

	}

	public SignIn signInElements() {
		SignIn sign = new SignIn(driver);
		return sign;
	}

	// Accessible methods for Element selectors
	public WebElement createAccount() {
		return createAccountLink;
	}

	public WebElement forgottenPassworwordLink() {
		return forgottenPassworword;
	}

	public WebElement createAccountTCText() {
		return createAccountTC;
	}

	public WebElement homeNav() {
		return homeLink;
	}

	public WebElement findAJobNav() {
		return findAJobLink;
	}

	public WebElement jobsAlertNav() {
		return jobsAlertLink;
	}

	public WebElement searchRecruitersNav() {
		return searchRecruitersLink;
	}

	public WebElement jobsBlogNav() {
		return jobsBlogLink;
	}

	public WebElement homePageHeader() {
		return homeHeader;
	}

	public WebElement findAJobRefineText() {
		return findAJobRefineSearch;
	}

	public WebElement jobAlertsJobAlertText() {
		return jobAlertsCreateJobAlert;
	}

	public WebElement searchRecruiterText() {
		return searchRecruiter;
	}

	public WebElement jobsBlogText() {
		return jobsBlog;
	}

}
