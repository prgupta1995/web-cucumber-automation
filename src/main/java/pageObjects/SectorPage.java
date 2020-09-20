package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SectorPage {
	
	public WebDriver driver;
	
	// Element Seclectors
	@FindBy(css="a[href='/jobs/banking-and-finance/']")
	private WebElement browserJobSector;

	@FindBy(css=".button.button--lister-view-details")
	private WebElement viewDetailsButton;
	
	@FindBy(css=".button.button--brand.button--apply")
	private WebElement applyButton;
	
	
	
	
	public SectorPage(WebDriver driver) {
		this.driver=driver;
		
		// Receives the driver instance of the given class and returns a Page Object with fully initialized fields
		PageFactory.initElements(driver, this);
	}
	
	// Accessible methods for Element selectors
	public WebElement browserJobSectorLink() {
		return browserJobSector;
	}
	
	public WebElement jobViewDetails() {
		return viewDetailsButton;
	}
	
	public WebElement jobApplyButton() {
		return applyButton;
	}
}
