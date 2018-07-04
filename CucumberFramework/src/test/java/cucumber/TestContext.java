package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	private PageObjectManager pageObjectManager;
	private WebDriverManager webDriverManager;
	public ScenarioContext scenarioContent;
	public TestContext() {
		// TODO Auto-generated constructor stub
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		scenarioContent = new ScenarioContext();
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContent() {
		return scenarioContent;
	}
}
