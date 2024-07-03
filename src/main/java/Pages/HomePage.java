package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;








public class HomePage extends BasePage {

	public HomePage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public void ChangeLanguagetoEnglish () {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/i[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[2]/span[1]/input[1]"))).click();
		
	}
	


    public void ClickOnAllMenuBtn(){

		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-hamburger-menu"))).click();
    }
    
    public void ClickOnSelectAllBtn(){
    	By x = By.xpath("//div[@id=\"hmenu-content\"]/ul/li/a[@class=\"hmenu-item hmenu-compressed-btn\"]");
	   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(x));
	   driver.findElement(x).click();
    }
    
    public void ScrollDown(){
    	By ScrollBar = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]");
 	  WebElement ScrollElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ScrollBar));
 	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollBy(0, 800)", ScrollElement);
 	

    }
    
    public void ClickOnVideoGamesBtn() {

	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/ul[1]/li[11]/a[1]")));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/ul[1]/li[11]/a[1]"))).click();
	   }
    
    public AllVideoGamesPage ClickOnAllVideoGamesBtn() {
    	WebElement AllVideosBtn = driver.findElement(By.xpath("//a[contains(text(),'All Video Games')]"));
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", AllVideosBtn);
    	
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'All Video Games')]"))).click();
       return new AllVideoGamesPage (driver);
    // I User Javascript Executor because i don not know why when i'm using the 
   //wait to find the element the menu is not loaded when i run the script
}
    
}


		


