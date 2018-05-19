package testBestBuy;

import base.CommonAPI;
import mainBestBuy.PopUpWindow;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestPopUpWindow extends CommonAPI {

    @Test
    public void testPopUp()throws InterruptedException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
