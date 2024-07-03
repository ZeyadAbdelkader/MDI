package Pages;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllVideoGamesPage extends BasePage {

	public AllVideoGamesPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void ClickOnFreeShipngBtn () {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]"))).click();
	}
	
	public void ScrollDownAllVideoGames(){
	    	By ScrollBar = By.xpath("/html[1]");
	 	  WebElement ScrollElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ScrollBar));
	 	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollBy(0, 1000)", ScrollElement);
	 	
    }
	
	public void ClickOnNewBtn () {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='New']"))).click();
	}
	public void ClickOnDropdownList () {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='a-autoid-0-announce']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("s-result-sort-select_2"))).click();

	}
	
	By SearchResults = By.xpath("//span[@data-component-type=\"s-search-results\"]//span[@class=\"a-price-whole\"]");
	Actions act = new Actions(driver);
	public void Search () {
		
		List<WebElement> searchresults = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchResults));
		for(WebElement element:searchresults) {
			int Price = Integer.valueOf(element.getText().replace(",","")); 
			System.out.println(Price);
			if(Price<=15000) {
				
				act.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
				AddProductToCart();
			}
			
		}
	}
	
	public void AddProductToCart() {
		String mainWindowHandle = driver.getWindowHandle();
	Set<String> allWindowHandles = driver.getWindowHandles();
	for (String handle : allWindowHandles){
        if(!handle.equals(mainWindowHandle)) {
		driver.switchTo().window(handle);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button"))).click();
        driver.close();
        
        }
    }
    driver.switchTo().window(mainWindowHandle);
		
		
	}
	
	By NextBtn = By.xpath("//a[normalize-space()='Next']");
	By DisNextBtn = By.xpath("//span[@class='s-pagination-item s-pagination-next s-pagination-disabled ']");
	public void PagesLoop() {
		boolean ContiueLoop = true;
		while(ContiueLoop) {
			Search();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(NextBtn)).click();
		}
		catch (Exception e) {
			
		ContiueLoop=!wait.until(ExpectedConditions.visibilityOfElementLocated(DisNextBtn)).isDisplayed();
		driver.navigate().refresh();
		}

		}
	}
	
	public void AddToBasketBtn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='a-autoid-2-announce']"))).click();

	}



}
