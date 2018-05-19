package testBestBuy;

import base.CommonAPI;
import mainBestBuy.HomePage;
import mainBestBuy.PopUpWindow;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    @Test
    public void testHomepage() throws InterruptedException {
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        homepage();
    }
}
