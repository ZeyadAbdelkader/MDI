package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class LoginScreen extends BasePage {

	public LoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath ="/html[1]/body[1]/app-root[1]/app-auto-registration[1]/app-login[1]/section[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    WebElement PhoneNumber;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/app-auto-registration[1]/app-login[1]/section[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
    WebElement Password;

    @FindBy (xpath  = "/html[1]/body[1]/app-root[1]/app-auto-registration[1]/app-login[1]/section[1]/form[1]/div[2]/button[1]")
    WebElement LoginBtn;
    @FindBy (xpath =  "//div[contains(text(),'Invaild user name or password')]")
    WebElement ErrorMessage;


    public void EnterInValidUserName(){
        PhoneNumber.sendKeys("ZeyadYasser");
    }
    public void EnterInValidPassword(){
        Password.sendKeys("ZEEEEE");
    }
    public void ClickOnLoginBtn(){
        LoginBtn.click();
    }

    public String GetErrorMessage(){
    	
    	ErrorMessage.getText();
        return ErrorMessage.getText();
    
    	
     }
    
    

}
		


