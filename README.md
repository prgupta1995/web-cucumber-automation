# economist-automation

selenium-cucumber : Automation Testing Using Java

#### Pre-requisites
* Java
* Maven
* Eclipse
* Eclipse Plugins
    * Maven
    * Testng
    * Natural (for Gherkin)
    
#### Maven Dependencies:
- Selenium-Java
- testng
- cucumber-junit
- cucumber-java
- cucumber-core
- log4j-api
- log4j-core
- junit
    

#### Setting up selenium-cucumber-java
- Install Java and set path.
- Install Maven and set path.

#### Writing a test
The cucumber features goes in the features library and should have the ".feature" extension.

You can start out by looking at `features/Home.feature`. You can extend this feature or make your own features using the below format

```
Feature: Home page

@HomePage
Scenario: Verify that Sign in go to the respective page

Given Navigate to the "https://jobs.economist.com/"
When Click on the Sign in link and user redirects to the Sign in page
Then Verify that user is available on the Sign Page
And Quit the opened browser
```
#### POM
Define all the selectors page wise


#### Running test

Run test using TestRunner.java file->  Run as JUnit Test


#### In your TestRunner class add a glue option:

```
package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features" },
glue = { "stepDefinitions" },
plugin= {"pretty","html:target/cucumber.html"},
tags= "@SeachJobResults or @SignIn",
monochrome=true
)

public class TestRunner {

}
```


#### Output
Report file will be available in `target/Cucumber.html`