package dbTest;

import Database.ConnectDB;
import base.CommonAPI;
//import mainBestbuy.BrowseToBestbuy;
import mainBestBuy.PopUpWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DBtest extends CommonAPI {
    String SearchItem = "iphone";
    WebElement search;
    @BeforeTest
    public void dbConnection() throws SQLException, IOException, ClassNotFoundException {
        ConnectDB.connectToMySql();
    }

    @Test
    public void readData() throws Exception {
        List <String> searchItems = ConnectDB.readDataBase("testdata","searchItems");
        System.out.println(searchItems);
    }

    @Test
    public void searchItem() throws InterruptedException {
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        WebDriverWait wait = new WebDriverWait(driver, 1, 500);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
        sleep();
        driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys(SearchItem);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]/span")).click();
        Thread.sleep(2000);

    }

    @Test
    public void insertDataFromStringToMySql() throws Exception {
        ConnectDB.insertDataFromStringToMySql(SearchItem,"testdata","searchItems");
        readData();
    }

}