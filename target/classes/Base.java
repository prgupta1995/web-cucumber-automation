package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();

		// Read data from data.properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources//data.properties");

		prop.load(fis);

		// Get property from data.properties file
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			// Set a path for chrome driver, use to run testcases
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//main//java//resources//chromedriver");
			ChromeOptions option = new ChromeOptions();
			driver = new ChromeDriver(option);

		}
		return driver;

	}
}