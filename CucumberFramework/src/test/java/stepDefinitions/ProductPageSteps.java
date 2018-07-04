package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
	TestContext testContent;
	ProductListingPage productListingPage;

	public ProductPageSteps(TestContext content) {
		// TODO Auto-generated constructor stub
		testContent = content;
		productListingPage = testContent.getPageObjectManager().getProductListingPage();
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		// productListingPage = pageObjectManager.getProductListingPage();
		String productName = productListingPage.getProductName(0);
		testContent.scenarioContent.setContext(Context.PRODUCT_NAME, productName);
		
		productListingPage.select_Product(0);
		productListingPage.clickOn_AddToCart();

	}
}
