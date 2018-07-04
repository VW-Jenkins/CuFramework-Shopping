package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.FileReaderManager;

public class Hooks {
	TestContext testContent;

	public Hooks(TestContext content) {
		testContent = content;
	}

	@Before
	public void BeforeSteps() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB connections
		 * Setting up test data Setting up browser cookies Navigating to certain page or
		 * anything before the test
		 */
		Reporter.assignAuthor("Cucumber - Victor - test");
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			try {
				File sourcePath = ((TakesScreenshot) testContent.getWebDriverManager().getDriver())
						.getScreenshotAs(OutputType.FILE);
				/*File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
						+ screenShotName + ".png");*/
				
				File destinationPath = new File(FileReaderManager.getInstance().getConfigReader().getSnapshotPath()
						+ screenShotName + ".png");
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		testContent.getWebDriverManager().closeDriver();
	}
}
