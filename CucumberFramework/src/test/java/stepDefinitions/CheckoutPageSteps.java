package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {
	TestContext testContent;
	CheckoutPage checkoutPage;
	public CheckoutPageSteps(TestContext content) {
		// TODO Auto-generated constructor stub
		testContent = content;
		checkoutPage = testContent.getPageObjectManager().getCheckoutPage();
	}
	/*@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String customerName) throws Throwable {
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		checkoutPage.fill_PersonDetails(customer);
	}*/
	
	@When("^enter \"([^\"]*)\" personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String  customerName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		checkoutPage.fill_PersonDetails(customer);
	}


	@When("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
		checkoutPage.check_ShipToDifferentAddress(false);
	}

	@When("^select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1) throws Throwable {
		checkoutPage.select_PaymentMethod("CheckPayment");
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
		checkoutPage.check_TermsAndCondition(true);
		checkoutPage.clickOn_PlaceOrder();
		//driver.quit();
		// Added the quit browser into the Hooks class
		//testContent.getWebDriverManager().closeDriver();
		
	}
}
