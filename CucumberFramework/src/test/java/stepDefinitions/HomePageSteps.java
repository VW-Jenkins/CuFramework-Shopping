package stepDefinitions;


import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	//WebDriverManager webDriverManager;
	//WebDriver driver;
	//PageObjectManager pageObjectManager;
	HomePage home;
	
	TestContext testContent;
	
	public HomePageSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		testContent =  context;
		home = testContent.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
/*		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();	
		pageObjectManager = new PageObjectManager(driver);
		home = pageObjectManager.getHomePage();*/
		home.navigateTo_HomePage();
		Reporter.addScenarioLog("Scenarios - logs - here");
		Reporter.addStepLog("steps -logs - here");
	}

	@When("^search for \"([^\"]*)\"$")
	public void search_for(String product) throws Throwable {			
		//home = pageObjectManager.getHomePage();
		home.perform_Search(product);
	}
}
