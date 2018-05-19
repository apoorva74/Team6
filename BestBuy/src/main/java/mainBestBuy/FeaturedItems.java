package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FeaturedItems extends CommonAPI{
    public void featuredItemsList() throws InterruptedException {
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        WebDriverWait wait = new WebDriverWait(driver, 1, 500);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
        sleep();
        clickByXpath("//*[@id=\"menu0\"]");
        String title = getTextByCSS("#group0 > div.level-one-cat-nav > div > div.featured > h2");
        System.out.println("The " + title + " items are:");
        List<String> text = getTextFromWebElements("//*[@id=\"group0\"]/div[1]/div/div[1]/ul/li");
        System.out.println(text);
        clickByXpath("//*[@id=\"group0\"]/div[3]/a");
    }
}
