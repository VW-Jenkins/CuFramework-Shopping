package selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Wait {
	
	public static void untilJQueryLoadDone(WebDriver driver) {
		untilJQueryLoadDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}
	
	public static void untilJQueryLoadDone(WebDriver driver, Long timeoutInSeconds) {
		until(driver,(d)->{
			Boolean isJqueryCallDone  = (Boolean)((JavascriptExecutor)driver).executeScript("return jQuery.active==0");
			if(!isJqueryCallDone) System.out.println("JQuery call is in Progress");
			return isJqueryCallDone;
		}, timeoutInSeconds);
	}
	
	public static void untilPageLoadComplete(WebDriver driver) {
		untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}
	
	public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds) {
		until(driver, (d) ->
		{
			Boolean isPageLoad = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			if(!isPageLoad) System.out.println("Document is loading ... ");
			return isPageLoad;
		}, timeoutInSeconds);
	}
	
	public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition) {
		until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}
	private static void until(WebDriver driver, Function<WebDriver,Boolean> waitCondition,Long timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try {
			webDriverWait.until(waitCondition);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
