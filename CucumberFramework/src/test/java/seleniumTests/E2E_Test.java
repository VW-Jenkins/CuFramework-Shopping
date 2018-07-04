package seleniumTests;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E2E_Test {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CuFramework\\CucumberFramework\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String URL = "http://www.shop.demoqa.com";
		driver.get(URL);
		
		driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
		
		List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		items.get(0).click();
	
		WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		addToCart.click();
		
		WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
		cart.click();
		
		WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
		continueToCheckout.click();
		
		Thread.sleep(5000);
		
		WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
		firstName.sendKeys("Victor");
		WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
		lastName.sendKeys("Wang");
		
		WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
		emailAddress.sendKeys("test@gmail.com");
		WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		phone.sendKeys("+8615829334994");
		
		WebElement countryDropDown = driver.findElement(By.cssSelector(".select2-arrow"));
		countryDropDown.click();
		Thread.sleep(2000);
		
		List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for(WebElement country:countryList) {
			if(country.getText().equals("India")) {
				country.click();
				break;
			}
		}
		
		WebElement city = driver.findElement(By.cssSelector("#billing_city"));
		city.sendKeys("Delhi");
		WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
		address.sendKeys("Shalimar Bagh");
		
		WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
		postcode.sendKeys("110088");		
		WebElement shipToDifferentAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
		shipToDifferentAddress.click();
		Thread.sleep(2000);
		
		List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
		paymentMethod.get(0).click();
		
		WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
		acceptTC.click();
		WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
		placeOrder.click();
		
		driver.quit();
	}

}
