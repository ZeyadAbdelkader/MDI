package Tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.LoginScreen;

public class UnSuccessfullLoginAttempt extends BaseTest{
	
	
	SoftAssert softAssert;
    LoginScreen loginScreen;
    


    @Test(alwaysRun = true)
    public void TestUnSuccessfullLogin() throws InterruptedException{

        loginScreen = new LoginScreen(driver);
        loginScreen.EnterInValidUserName();
        loginScreen.EnterInValidPassword();
        loginScreen.ClickOnLoginBtn();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert(); 
        // Perform your test steps and assertions
        String actualValue = "Invaild user name or password";
        softAssert.assertEquals(loginScreen.GetErrorMessage(),actualValue);
        softAssert.assertAll();
}
}
