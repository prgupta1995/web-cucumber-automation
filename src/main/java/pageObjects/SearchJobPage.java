package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchJobPage {

	public WebDriver driver;
	
	// Element Seclectors
	@FindBy(css = "a.primary-nav__link[href='/jobs/']")
	private WebElement findAJobLink;
	
	@FindBy(css = "a[href='/searchjobs/']")
	private WebElement searchTab;

	@FindBy(css = "#keyword")
	private WebElement searchJobKeyword;

	@FindBy(css = "#location")
	private WebElement searchJoblocation;

	@FindBy(css = "div:nth-child(2) > button")
	private WebElement searchJobSector;
	
	@FindBy(css = "#Sector-16")
	private WebElement searchJobCheckbox;

	@FindBy(css = ".button--brand.button--search")
	private WebElement searchButton;

	@FindBy(css = "h1#searching")
	private WebElement foundJobs;

	public SearchJobPage(WebDriver driver) {
		this.driver = driver;
		
		// Receives the driver instance of the given class and returns a Page Object with fully initialized fields
		PageFactory.initElements(driver, this);
	}

	// Accessible methods for Element selectors
	public WebElement findAJobNav() {
		return findAJobLink;
	}
	
	public WebElement searchJobsTab() {
		return searchTab;
	}

	public WebElement searchJobKeywordField() {
		return searchJobKeyword;
	}

	public WebElement searchJobLocationField() {
		return searchJoblocation;
	}
	
	public WebElement searchJobSectorIcon() {
		return searchJobSector;
	}

	public WebElement searchJobSectorCheckbox() {
		return searchJobCheckbox;
	}

	public WebElement jobSearchButton() {
		return searchButton;
	}

	public WebElement foundJobsText() {
		return foundJobs;
	}
}
