package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;




public class BasePage {
	public WebDriver driver;
	
	public FluentWait<WebDriver> wait;
	
	public BasePage (WebDriver driver) {
		super();
		this.driver = driver;
		 this.wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(20))
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class)
		        .ignoring(TimeoutException.class)
		        .ignoring(ElementClickInterceptedException.class);
		
}
	
	
	
	
}
