package testBestBuy;

import mainBestBuy.CreateAccountExcel;
import org.testng.annotations.Test;

public class TestCreateAccount extends CreateAccountExcel {
    @Test
    public void testAccount() throws InterruptedException {
        createAccount();
    }
}
