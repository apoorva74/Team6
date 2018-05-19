package mainBestBuy;


import base.CommonAPI;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.testng.annotations.Test;
        import reporting.TestLogger;

public class PopUpWindow {

    @FindBy(css = ".modal-body")
    public WebElement PopUpWindowWebElement;
    @FindBy(css = ".email-submission-modal .modal-header button.close")
    public WebElement PopUpWindowCloseWebElement;


    public WebElement getScholarshipPopUpWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PopUpWindowWebElement;
    }

    public void setScholarshipPopUpWindowWebElement(WebElement scholarshipPopUpWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.PopUpWindowWebElement = scholarshipPopUpWindowWebElement;
    }

    public WebElement getPopUpWindowCloseWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PopUpWindowCloseWebElement;
    }

    public void setPopUpWindowCloseWebElement(WebElement PopUpWindowCloseWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.PopUpWindowCloseWebElement = PopUpWindowCloseWebElement;
    }

    public boolean isPopUpWindowDisplayed(WebDriver driver1, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setPopUpWindowCloseWebElement(PopUpWindowCloseWebElement);
        getPopUpWindowCloseWebElement().click();
    }

    public void handlePopUpWindowBeforeLogIn(WebDriver driver1)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.sleepFor(2);
        if(isPopUpWindowDisplayed(driver1, ".modal-body")) {
            TestLogger.log("Yes, displayed. Handle it now.");
            closePopUpWindow();
            TestLogger.log("Sleep for 2 sec");
            CommonAPI.sleepFor(2);
        }
    }

}
