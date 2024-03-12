package Tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.LoginScreen;

public class UnSuccessfullLoginAttempt extends BaseTest{
	
	
	SoftAssert softAssert;
    LoginScreen loginScreen;
    


    @Test(alwaysRun = true)
    public void TestUnSuccessfullLogin(){

        loginScreen = new LoginScreen(driver);
        loginScreen.EnterInValidUserName();
        loginScreen.EnterInValidPassword();
        loginScreen.ClickOnLoginBtn();
        SoftAssert softAssert = new SoftAssert(); 
        softAssert.assertEquals(loginScreen.GetErrorMessage(),"Invaild user name or password");
        softAssert.assertAll();
}
}
