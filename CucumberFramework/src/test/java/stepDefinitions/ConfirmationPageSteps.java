package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import pageObjects.ConfirmationPage;

public class ConfirmationPageSteps {
	TestContext testContext;
	ConfirmationPage confirmationPage;
	
	public ConfirmationPageSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		testContext = context;
		confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
	}
	
	@Then("^verify the order details$")
	public void verify_the_order_details() throws Throwable {
	    String productName = (String)testContext.getScenarioContent().getContext(Context.PRODUCT_NAME);
	    Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);
	    // Make the Assert error to get snapshot
	    //Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()== 0);
	}
}
