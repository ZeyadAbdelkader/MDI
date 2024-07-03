package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	
	public static WebDriver driver;
	
@BeforeSuite
	public void startDrivere() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\zyasser\\MDI\\MDI\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.eg/");
	
		
		
	}


}
