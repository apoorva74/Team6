package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class SignIn extends CommonAPI {

    WebDriverWait wait = new WebDriverWait(driver, 1, 500);
    public void signInButton() {
        WebElement signInB = null;
        signInB=findcss(".lam-signIn__button");
        wait.until(ExpectedConditions.visibilityOf(signInB)); //this will wait for elememt to be visible for 20 seconds
        signInB.click();
    }

    public void signIn() throws InterruptedException {
        Xls_Reader reader = new Xls_Reader("..\\SeleniumHybridFrameworkTeam6\\Bestbuy\\src\\main\\java\\TestData\\bestbuy.xlsx");

        String email = reader.getCellData("Sheet1", "E-Mail Address", 2);
        System.out.println(email);

        String password = reader.getCellData("Sheet1", "Password", 2);
        System.out.println(password);
        WebElement signIn = null;
        typeByCss("#fld-e",email);
        Thread.sleep(2000);
        typeByCss("#fld-p1",password);
        Thread.sleep(2000);
        signIn = findcss(".cia-form__submit-button");
        wait.until(ExpectedConditions.visibilityOf(signIn)); //this will wait for elememt to be visible for 20 seconds
        signIn.click();
    }
}
