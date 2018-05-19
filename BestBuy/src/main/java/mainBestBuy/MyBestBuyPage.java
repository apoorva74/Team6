package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyBestBuyPage extends CommonAPI {
    public void myBestBuy() {
        String title = getTextByCSS("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/a");
        System.out.println("The " + title + " items are:");
        List<WebElement> alllinks = getListOfWebElementsByXpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul//a");
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());
    }
}
