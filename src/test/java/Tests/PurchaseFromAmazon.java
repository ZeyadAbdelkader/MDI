package Tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.AllVideoGamesPage;
import Pages.HomePage;

public class PurchaseFromAmazon extends BaseTest{
	
	
	SoftAssert softAssert;
    HomePage homePage;
    AllVideoGamesPage allVideoGamesPage;
    


    @Test(alwaysRun = true)
    public void PurchaseAmazon() throws InterruptedException{

        homePage = new HomePage(driver);
        homePage.ChangeLanguagetoEnglish();
        Thread.sleep(2000);
        homePage.ClickOnAllMenuBtn();
        homePage.ClickOnSelectAllBtn();
        homePage.ScrollDown();
        homePage.ClickOnVideoGamesBtn();
        allVideoGamesPage= homePage.ClickOnAllVideoGamesBtn();
        allVideoGamesPage.ClickOnFreeShipngBtn();
        allVideoGamesPage.ScrollDownAllVideoGames();
        allVideoGamesPage.ClickOnNewBtn();
        allVideoGamesPage.ClickOnDropdownList();
        allVideoGamesPage.PagesLoop();
        allVideoGamesPage.AddProductToCart();
        
}
}
