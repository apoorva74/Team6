package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FeaturedOffers extends CommonAPI{

    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void featuredOffers() {
     /*   String title = driver.findElement(By.cssSelector("#widget-a9596c6c-a001-4460-ae39-bf48cdcf4822 > div > p")).getText();
        System.out.println("The " + title + " items are:");

        List<WebElement> heading = driver.findElements(By.xpath("//h2[@class=\"header-minimal\"]"));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) wGeckoDriver;
        js.executeScript("window.scrollBy(0,500)");
        List <WebElement> alllinks = wGeckoDriver.findElements(By.xpath("//div[@class=\"image-shell\"]//a"));
        for (int i = 0; i < heading.size(); i++)
            System.out.println(heading.get(i).getText());

            for (int i = 0; i < alllinks.size(); i++) {
                js.executeScript("window.scrollBy(0,607)");
                sleep();
                actions.moveToElement(alllinks.get(i)).click().build().perform();
                // alllinks.get(i).click();
                wGeckoDriver.navigate().back();
                sleep();  */
        }

    }

