package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	public WebDriver driver;
	
	// Element Seclectors
	@FindBy(css="a[href*='/logon/']")
	private WebElement signInLink;
		
	@FindBy(css="[id='signinemail']")
	private WebElement emailAddress;
	
	@FindBy(css="[id='signinpassword']")
	private WebElement password;
	
	@FindBy(css="[value='Sign in']")
	private WebElement signIn;
	
	@FindBy(css="a[href='/logoff/']")
	private WebElement logoff;
	
	
	public SignIn(WebDriver driver) {
		this.driver=driver;
		
	// Receives the driver instance of the given class and returns a Page Object with fully initialized fields
		PageFactory.initElements(driver, this);
	}
	
	// Accessible methods for Element selectors
	public WebElement signInLinkJobsPage() {
		return signInLink;
	}
	
	public WebElement emailSignIn() {
		return emailAddress;
	}
	
	public WebElement passwordSignIn() {
		return password;
	}

	public WebElement SignInButton() {
		return signIn;
	}
	
	public WebElement signOutLink() {
		return logoff;
	}
	
}
