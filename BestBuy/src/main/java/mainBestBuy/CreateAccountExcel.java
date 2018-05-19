package mainBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class CreateAccountExcel extends CommonAPI{
    public void createAccount() throws InterruptedException {
//Reading data from Excel sheet
        Xls_Reader reader = new Xls_Reader("C:\\Users\\apoor\\IdeaProjects\\NewWebAutomationTeam6\\BestBuy\\src\\main\\java\\testData\\bestbuy.xlsx");

        String firstName = reader.getCellData("Sheet1", "First Name", 7);
        System.out.println(firstName);

        String lastName = reader.getCellData("Sheet1", "Last Name", 7);
        System.out.println(lastName);

        String email = reader.getCellData("Sheet1", "E-Mail Address", 7);
        System.out.println(email);

        String password = reader.getCellData("Sheet1", "Password", 7);
        System.out.println(password);

        String confirmPass = reader.getCellData("Sheet1", "Confirm Password", 7);
        System.out.println(confirmPass);

        String phone = reader.getCellData("Sheet1", "Phone Number", 7);
        System.out.println(phone);
        PopUpWindow handlePopUp = PageFactory.initElements(driver, PopUpWindow.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        WebDriverWait wait = new WebDriverWait(driver, 1, 500);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
        sleep();
//Enter Data to WebPage
        WebElement createAccount = null;
        typeByCss("#fld-firstName",firstName);
        sleep();
        typeByCss("#fld-lastName",lastName);
        sleep();
        typeByCss("#fld-e",email);
        sleep();
        typeByCss("#fld-p1",password);
        sleep();
        typeByCss("#fld-p2",confirmPass);
        sleep();
        typeByCss("#fld-phone",phone);
        sleep();
        clickOnElement(".cia-form__submit-button");
        //createAccount = wGeckoDriver.findElement(By.cssSelector(".cia-form__submit-button"));
       // wait.until(ExpectedConditions.visibilityOf(createAccount)); //this will wait for elememt to be visible for 20 seconds
        // createAccount.click();
    }
}
