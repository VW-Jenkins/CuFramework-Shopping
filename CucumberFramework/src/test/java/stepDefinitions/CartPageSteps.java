package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageSteps {
	TestContext testContent;
	CartPage cartPage;

	public CartPageSteps(TestContext content) {
		// TODO Auto-generated constructor stub
		testContent = content;
		cartPage = testContent.getPageObjectManager().getCartPage();
	}

	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		// cartPage = pageObjectManager.getCartPage();
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckOut();

	}
}
