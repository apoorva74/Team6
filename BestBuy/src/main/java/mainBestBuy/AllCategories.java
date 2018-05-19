package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllCategories extends CommonAPI {
    public void allCategories() throws InterruptedException {
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        WebDriverWait wait = new WebDriverWait(driver, 1, 500);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
        sleep();
        clickByXpath("//*[@id=\"menu0\"]");
        String title = getTextByCSS(".shopby > h2:nth-child(1)");
        System.out.println("The " + title + " items are:");
        List <String> text = getTextFromWebElements("//div[@class=\"shopby\"]//li[@class=\"js-navitem sub-nav-parent taphover\"]");
        System.out.println(text);
        clickByXpath("//*[@id=\"group0\"]/div[3]/a");
    }
}