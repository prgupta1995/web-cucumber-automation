package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {
	
	public WebDriver driver;
	
	// Element Seclectors
	@FindBy(css="#primary-nav")
	private WebElement navBar;
	
	@FindBy(css="section.search.brick")
	private WebElement searchFields;
	
	@FindBy(css=".browse.brick")
	private WebElement browseBySector;
	
	@FindBy(css=".articles.brick")
	private WebElement blogSection;
	
	@FindBy(css=".featured-jobs.brick")
	private WebElement featureSection;
	
	@FindBy(css="footer .wrapper.content")
	private WebElement footerSection;
	
	
	public JobsPage(WebDriver driver) {
		this.driver=driver;
		
		// Receives the driver instance of the given class and returns a Page Object with fully initialized fields
		PageFactory.initElements(driver, this);
	}
	
	// Accessible methods for Element selectors
	public WebElement jobsNavBar() {
		return navBar;
	}
	
	public WebElement jobssearchFields() {
		return searchFields;
	}
	
	public WebElement jobsBrowseBySectorr() {
		return browseBySector;
	}
	
	public WebElement jobsblogSection() {
		return blogSection;
	}
	
	public WebElement jobsfeatureSection() {
		return featureSection;
	}
	
	public WebElement jobsfooterSection() {
		return footerSection;
	}
	
}
