package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	 public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.CSS, using=".cart-button")
	 private WebElement btn_Cart;
	 
	 
	 @FindBy(how=How.CSS, using=".checkout-button.alt")
	 private WebElement btn_ContinueToCheckout;
	 
	 public void clickOn_Cart() {
		 btn_Cart.click();
	 }
	 
	 public void clickOn_ContinueToCheckOut() {
		 btn_ContinueToCheckout.click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	 }
}
